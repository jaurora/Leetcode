import java.util.*;
import java.lang.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) return head;
        if (n <= m) return head;
        int cnt = 0;
        ListNode start = null;
        ListNode end = null;
        ListNode res = null;
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode keep = node;
        while (node != null) {
            if (cnt == m-1) start = node;
            else if (cnt == m) {
                end = new ListNode(node.val);
                res = end;
            } else if (cnt > m && cnt <= n) {
                ListNode tmp = new ListNode(node.val);
                tmp.next = res;
                res = tmp;
                if (cnt == n) start.next = res;
            } else if (cnt == n+1) end.next = node;
            cnt++;
            node = node.next;
        }
        return keep.next;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       ListNode a = new ListNode(1);
       ListNode b = new ListNode(2);
       ListNode c = new ListNode(3);
       ListNode d = new ListNode(4);
       ListNode e = new ListNode(5);
       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
       e.next = null;
       ListNode ans = slu.reverseBetween(a, 2,4);
       while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


