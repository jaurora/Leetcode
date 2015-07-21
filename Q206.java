import java.util.*;
import java.lang.*;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = head;
        ListNode rev = head.next;
        pre.next = null;
        while (rev != null) {
            ListNode tmp = rev.next;
            rev.next = pre;
            pre = rev;
            rev = tmp;
        }
        return pre;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       ListNode a = new ListNode(1);
       ListNode b = new ListNode(2);
       ListNode c = new ListNode(3);
       ListNode d = new ListNode(4);
       a.next = b;
       b.next = c;
       c.next = d;
       ListNode ans = slu.reverseList(a);
       while (ans != null) {System.out.println(ans.val);  ans = ans.next; }
   }
}


