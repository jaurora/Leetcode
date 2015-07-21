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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode addnode = new ListNode(x-1);
        addnode.next = head;
        ListNode pre = addnode;
        ListNode prebdy = null;
        ListNode cur = head;
        while (cur != null) {
            if (prebdy == null) {
                if (cur.val >= x) prebdy = pre;
                pre = cur;
            } else if (cur.val < x) {
                ListNode tmpa = prebdy.next;
                pre.next = cur.next;
                prebdy.next = cur;
                cur.next = tmpa;
                prebdy = cur;
            } else pre = cur;
            
            cur = pre.next;
                          
        }
        return addnode.next;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       ListNode a = new ListNode(1);
       ListNode b = new ListNode(1);
       a.next = b;
       ListNode ans = slu.partition(a, 0);
       System.out.println(ans.val);
       System.out.println(ans.next.val);
   }
}


