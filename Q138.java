import java.util.*;
import java.lang.*;
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>(); 
        RandomListNode node = head, ans = null;
        RandomListNode pre = null;
        boolean first = true;
        while (node != null) {
            RandomListNode rn = new RandomListNode(node.label);
            rn.next = null;
            rn.random = null;
            if (first) { ans = rn; first = false; }
            else pre.next = rn;
            map.put(node, rn);
            pre = rn;
            node = node.next;
        }

        node = head;
        while (node != null) {
            if (node.random != null) {
                RandomListNode mon = map.get(node);
                RandomListNode kid = map.get(node.random);
                mon.random = kid;
            }
            node = node.next;
        }
        return ans; 
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       RandomListNode a = new RandomListNode(-1);
       RandomListNode b = new RandomListNode(-2);
       a.next = b; b.next = null;
       a.random = b; b.random = null;
       RandomListNode x = slu.copyRandomList(a);
       while (x != null) {
           System.out.println(x.label);
           x = x.random;
       }       
   }
}
