import java.util.*;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = head;
        ListNode ptr = head.next;
        ListNode pp = head;
        int cnt = 1;
        while (ptr != null) {
            if (ptr.val == pre.val) {
                ptr = ptr.next;
                cnt++;
            } else if (cnt > 1) {
                if (pre == head) { head = ptr; pp = ptr; }
                else pp.next= ptr;
                pre = ptr;
                ptr = ptr.next;
                cnt = 1;
            } else {
                pp = pre;
                pre = ptr;
                ptr = ptr.next;
            }
        }

        if (cnt > 1) {
            if (pre != head) pp.next = null;
            else head = null;
        }
        return head;
    }
   
   public static void main(String[] args) {
       Solution slu = new Solution();
       ListNode head = new ListNode(1);
       ListNode tmp = new ListNode(2);
       head.next = tmp;
       //ListNode tmp1 = new ListNode(2);
       //tmp.next = tmp1;

       ListNode x = slu.deleteDuplicates(head);
       while (x != null) {
           StdOut.println(x.val);
           x = x.next;
       }
   }
}
