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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre = null;
        ListNode first = head;
        ListNode last = findlast(first, k);

        while (last != null) {
            ListNode inode = first;
            ListNode jnode = inode.next;
            ListNode savenext = last.next;
            int i = 1;  
            while (i < k) {
                savenext = jnode.next;
                jnode.next = inode;
                inode = jnode;
                jnode = savenext;
                i++;
            }
            first.next = savenext;
            
            if (pre != null) {
                pre.next = last;
            } else { head = last; }
           
            pre = first;
            first = pre.next;
            last = findlast(first, k);
        }

        return head;        
    }
    
    private ListNode findlast(ListNode first, int k) {
        int i = 1;
        ListNode last = first;
        while (i < k && last != null) {
            last = last.next;
            i++;
        }
        return last;
    }

    public static void main(String[] args) { // unit tests (not graded)
    }
}
