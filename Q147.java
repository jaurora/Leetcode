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
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newhead = new ListNode(head.val);
        ListNode cur = head.next;
        while (cur != null) {
            ListNode nn = new ListNode(cur.val);
            if (nn.val < newhead.val) {
                nn.next = newhead;
                newhead = nn;
            } else {
                ListNode pre = newhead;
                if (pre.next == null) {
                    nn.next = pre.next;
                    pre.next = nn;
                } else {
                    while (pre.next.val < cur.val) {
                        pre = pre.next;
                        if (pre.next == null) break;
                    }
                    nn.next = pre.next;
                    pre.next = nn;
                }
            }
            cur = cur.next;
        }
        return newhead;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       ListNode a = new ListNode(2);
       ListNode b = new ListNode(1);
       a.next = b;
       ListNode ans = slu.insertionSortList(a);
       System.out.println(ans.val);
       System.out.println(ans.next.val);
   }
}


