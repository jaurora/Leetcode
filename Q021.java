/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode connect = null;

        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        boolean first = true;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                if (first) {
                    head = l1;
                    connect = head;
                    first = false;
                } else {
                    connect.next = l1;
                    connect = connect.next;
                }
                l1 = l1.next;
            } else {
                if (first) {
                    head = l2;
                    connect = head;
                    first = false;
                } else {
                 connect.next = l2;
                 connect = connect.next;
                }
                l2 = l2.next;
            }
        }
        if (l1 == null) connect.next = l2; 
        if (l2 == null)  connect.next = l1;
        return head;
    }

    public static void main(String[] args) { // unit tests (not graded)
    }
}
