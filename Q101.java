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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return sm(root.left, root.right);
    }

    private boolean sm(TreeNode left, TreeNode right) {
        if (left == null) return right == null;
        if (right == null) return left == null;
        if (left.val != right.val) return false;
        return (sm(left.left, right.right) && sm(left.right, right.left));
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       //ListNode ans = slu.reverseBetween(a, 2,4);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


