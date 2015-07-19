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
    public ListNode removeElements(ListNode head, int val) {
        ListNode move = head;
        ListNode pre = head;
        while (move != null) {
            if (move.val == val) {
                if (move == head) {
                    head = head.next;
                    move = head;
                    pre = head;
                    continue;
                } else {
                    move = move.next;
                    pre.next = move;
                    continue;
                }
            }
            pre = move;
            move = pre.next;
        }
        return head;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       ListNode a = new ListNode(1);
       ListNode b = new ListNode(2);
       a.next = b;
       //ListNode ans = slu.detectCycle(a);
       //System.out.println(ans);
       //System.out.println(slu.detectCycle(a).val);
   }
}


