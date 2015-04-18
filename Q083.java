import java.util.*;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = head;
        ListNode ptr = head.next;
        while (ptr != null) {
            if (ptr.val == pre.val) {
                pre.next = ptr.next;
                ptr = ptr.next;
            } else {
                pre = pre.next;
                ptr = ptr.next;
            }
        }
        return head;
    }
   
   public static void main(String[] args) {
       Solution slu = new Solution();
       ListNode head = new ListNode(1);
       ListNode tmp = new ListNode(1);
       head.next = tmp;
       ListNode x = slu.deleteDuplicates(head);
       while (x != null) {
           StdOut.println(x.val);
           x = x.next;
       }
   }
}
