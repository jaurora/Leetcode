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
    public void deleteNode(ListNode node) {
        ListNode nn = node.next;
        node.val = nn.val;
        node.next = nn.next;
    }



   public static void main(String[] args) {
       Solution slu = new Solution();
       ListNode a = new ListNode(1);
       ListNode b = new ListNode(2);
       a.next = b;
       ListNode ans = slu.detectCycle(a);
       System.out.println(ans);
       //System.out.println(slu.detectCycle(a).val);
   }
}


