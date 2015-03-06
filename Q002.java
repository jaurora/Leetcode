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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long left = 0;
        long coef = 1;
        ListNode ln = l1;
        while (ln != null) {
            left = left + ln.val * coef;
            coef = coef * 10;
            ln = ln.next;
        }
       
        long right = 0;    
        coef = 1;
        ln = l2;
        while (ln != null) {
            right = right + ln.val * coef;
            coef = coef * 10;
            ln = ln.next;
        }
        
        long sum = left + right;
        long copy = sum;
        
        int tail = (int) (copy % 10);
        ListNode header = new ListNode(tail);
        ListNode pre = header;
        
        while (copy > 0) {
            copy = (copy - tail)/10;
            if (copy > 0) {
               tail = (int) (copy % 10);
               ListNode nd = new ListNode(tail);
               pre.next = nd;
               pre = nd;
            }
        }
        return header;
        
    }
}
