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
    public boolean isBalanced(TreeNode root) {
        return balance(root);
    }

    private boolean balance(TreeNode tn) {
        if (tn == null) return true;
        if (!balance(tn.left)) return false;
        if (!balance(tn.right)) return false;
        if (Math.abs(height(tn.left)-height(tn.right))>1) return false;
        else return true;
    }

    private int height(TreeNode tn) {
        if (tn == null) return 0;
        return 1+Math.max(height(tn.left, tn.right));
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode a = TreeNode()
       //ListNode ans = slu.reverseBetween(a, 2,4);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


