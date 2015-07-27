import java.util.*;
import java.lang.*;

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
    private int[] num;
    private TreeNode root;
    public TreeNode sortedArrayToBST(int[] nums) {
        num = nums;
        bst(0, num.length-1, null, false);
        return root;
    }

    private void bst(int start, int end, TreeNode tn, boolean left) {
        if (start <= end) {
            int mid  = (start+end)/2;
            TreeNode x = new TreeNode(num[mid]);
            if (tn == null) root = x;
            else {
                if (left) tn.left = x;
                else tn.right = x;
            }
            bst(start, mid-1, x, true);
            bst(mid+1, end, x, false);
        }
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode a = TreeNode()
       //ListNode ans = slu.reverseBetween(a, 2,4);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


