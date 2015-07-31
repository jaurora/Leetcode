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
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return vBST(root, Long.MIN_VALUE, Long.MAX_VALUE);     
    }

    private boolean vBST(TreeNode tn, long mini, long maxi) {
        if (tn == null) return true;
        if (tn.val <= mini || tn.val >= maxi) return false;
        return vBST(tn.left, mini, Math.min(tn.val, maxi)) && vBST(tn.right, Math.max(mini, tn.val), maxi);
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode a = TreeNode()
       //ListNode ans = slu.reverseBetween(a, 2,4);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


