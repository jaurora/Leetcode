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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if (head == null) return false;  
        if (head.next == null) return false;
        fast = fast.next;

        while (slow != null && fast != null && slow.val != fast.val) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) fast = fast.next;
        }
        
        if (slow == null || fast == null) return false;
        else return true;
    }



   public static void main(String[] args) {
       Solution slu = new Solution();
       ListNode a = new ListNode(1);
       ListNode b = new ListNode(2);
       a.next = b;
       System.out.println(slu.hasCycle(a));
   }
}


