/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
import java.util.List;
import java.util.LinkedList;
 
public class Solution {
    public ListNode mergeKLists(List<ListNode> lists) {

        if (lists.size() == 0) return null;
        if (lists.size() == 1) return lists.get(0);
     
        while (lists.size() > 1) {
            List<ListNode> tmp = new LinkedList<ListNode>();
            for (int i = 0; i < lists.size()/2; i++) tmp.add(merge(lists.get(i*2), lists.get(i*2+1)));
            if (lists.size() % 2 == 1) tmp.add(lists.get(lists.size()-1));
            lists = tmp;
        }
        return lists.get(0);
    }

    private ListNode merge(ListNode la, ListNode lb) {
        ListNode ap = la;
        ListNode bp = lb;
        boolean first = true;
        
        ListNode head = null;
        ListNode cons = null;

        if (ap == null && bp == null) return null;
        
        while (ap != null && bp != null) {
            if (ap.val <= bp.val) {
                if (!first) { cons.next = ap; }
                cons = ap;   
                ap = ap.next;
            } else {
                if (!first) { cons.next = bp; }
                cons = bp;   
                bp = bp.next;
            }
            if (first) {  
                head  = cons; 
                first = false;
            }
        }

        if (ap == null) {
            if (first) { 
                head  = bp; 
            } else {
              cons.next = bp;
            }
        }

        if (bp == null) {
            if (first) { 
                head  = ap; 
            } else {
              cons.next = ap;
            }
        }

        return head;
    }
}
