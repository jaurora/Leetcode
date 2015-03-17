public class Solution {
    public ListNode swapPairs(ListNode head) {
       
        if (head == null || head.next == null) return head;

        ListNode pre = null;
        ListNode first = head;
        ListNode second = head.next;
        
        while(first!= null && second != null) {
            
            if (pre != null) {
                pre.next = second;
            }
            first.next = second.next;
            second.next = first;           

            if (pre == null) head = second;

            pre = first;
            first = pre.next;
            if (first != null) { 
                second = first.next; }
            else { second = null; }
        }
        return head;
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        //b.next = c;
        //c.next = d;
        
        ListNode ans = slu.swapPairs(a);
        while (ans != null) {
            StdOut.println(ans.val);
            ans = ans.next;
        }
    }
}
