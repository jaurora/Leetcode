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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    ListNode cur;
    public TreeNode sortedListToBST(ListNode head) {
        int cnt = 0;
        ListNode x = head;
        while (x != null) { cnt++; x = x.next; }
        cur = head;
        return slb(0, cnt-1);
    }

    private TreeNode slb(int start, int end) {
        if (start <= end) {
            int mid = start + (end-start)/2;
            TreeNode left = slb(start, mid-1);
            TreeNode root = new TreeNode(cur.val);
            cur = cur.next;
            TreeNode right = slb(mid+1, end);
            root.left = left;
            root.right = right;
            return root;
        } else return null;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode a = TreeNode()
       //ListNode ans = slu.reverseBetween(a, 2,4);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


