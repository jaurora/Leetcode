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
    public void flatten(TreeNode root) {
        TreeNode x = root;
        while (x) {
            if (x.left != null) {
                TreeNode p = x.left;
                while (p.right != null) p=p.right;
                p.right = x.right;
                x.right = x.left;
                x.left = null;
            }
            x = x.right;
        }
    }

   
   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode a = TreeNode()
       //ListNode ans = slu.reverseBetween(a, 2,4);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


