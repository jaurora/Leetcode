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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode na = headA;
        ListNode nb = headB;
        if (na == null || nb == null) return null;

        boolean swa = false;
        boolean swb = false;

        while (true) {
            if (na == null && !swa) {
                na = headB;
                swa = true;
            }
            if (nb == null && !swb) {
                nb = headA;
                swb = true;
            }
            if (na == nb) return na;
            if (swa && swb && na == null && nb == null) return null;   
            na = na.next;
            nb = nb.next;  
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


