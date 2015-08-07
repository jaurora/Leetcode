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
    int max;
    public int maxPathSum(TreeNode root) {
        max.root.val;
        pathmax(root);
        return max;
    }

    private int pathmax(TreeNode root) {
        if (root == null) return 0;
        int pathleft = pathmax(root.left);
        int pathright = pathmax(root.right);
        int tmp = root.val;
        if (pathleft > 0) tmp += pathleft;
        if (pathright > 0) tmp += pathright;
        if (tmp > max) max = tmp;
        return root.val + Math.max(pathleft, pathright);
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode a = new TreeNode(1);
       TreeNode b = new TreeNode(0);
       TreeNode c = new TreeNode(2);       
       a.left = c;
       a.right = b;
       b.left = null;
       b.right = null;
       c.left = null;
       c.right = null;
       slu.recoverTree(a);
       System.out.println(a.left.val);
       System.out.println(a.right.val);       
       //for (int i=0; i<9; i++) { System.out.println(Arrays.toString(a[i])); }
   }
}


