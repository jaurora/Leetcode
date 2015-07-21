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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        int cnt = 0;
        ListNode cur = head;
        while (cur != null) {
            cnt++;
            cur = cur.next;
        }

        ListNode center = head;
        int half = cnt/2;
        for (int i = 0; i<half; i++) center = center.next;
        
        ListNode reverse = center.next;
        ListNode pre = center;
        while (reverse != null) {
            ListNode tmp = reverse.next;
            reverse.next = pre;
            pre = reverse;
            reverse = tmp;
        }
        
        ListNode x1 = head;
        ListNode x2 = pre;
        while (true) {
            if (x1.val != x2.val) return false;
            if (x1 == x2) break;
            if (x1.next == x2) break;
            x1 = x1.next;
            x2 = x2.next;
        }
        return true;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       ListNode a = new ListNode(1);
       ListNode b = new ListNode(2);
       //ListNode c = new ListNode(2);
       //ListNode d = new ListNode(1);
       a.next = b;
       //b.next = c;
       //c.next = d;
       boolean ans = slu.isPalindrome(a);
       System.out.println(ans);
   }
}


