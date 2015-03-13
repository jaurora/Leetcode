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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int len = 1;
        ListNode counter = head;
        while (counter.next != null) {
            counter = counter.next;
            len++;
        }
        
        int lastn = len + 1 - n;
        if (lastn == 1) {
            head = head.next;
            return head;
        } else {
            ListNode pointer = head; 
            ListNode pre = null;
            int count = 1;
            while (count < lastn) {
                pre = pointer;
                pointer = pointer.next;
                count++;
            }
            pre.next = pointer.next;
        }
        return head;
    }
}
