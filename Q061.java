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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int len = 0;
        ListNode tmp = head;
        while (tmp != null) { tmp = tmp.next; len++; }
  
        ListNode addnode = new ListNode(0);
        addnode.next = head;

        ListNode stop = addnode;
        int cnt = 0;
        while (stop != null && cnt<len-(k%len)) {
            stop = stop.next;
            cnt++;
        }
        if (stop == null || stop.next == null) return head;
        
        ListNode end = stop;
        while (end.next != null) end = end.next;
       
        addnode.next = stop.next;
        end.next = head;
        stop.next = null;
        head = addnode.next;
        return head;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       ListNode a = new ListNode(0);
       ListNode b = new ListNode(1);
       a.next = b;
       ListNode ans = slu.rotateRight(a, 1);
       while (ans != null) {
           System.out.println(ans.val);
           ans = ans.next;
       }
   }
}


