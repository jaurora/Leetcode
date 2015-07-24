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
    public TreeNode invertTree(TreeNode root) {
        revert(root);
        return root;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode a = new TreeNode(0);
       TreeNode b = new TreeNode(1);
       TreeNode c = new TreeNode(2); 
       a.left = b;
       a.right =c;
       b.right=null;
       b.left=null;
       c.right=null;
       c.left=null;

       List<Integer> ans = slu.postorderTraversal(a); 
       for (int i=0; i<ans.size();i++) System.out.println(ans.get(i));
   }
}


