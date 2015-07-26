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
    private List<Integer> ls = new ArrayList<Integer>();
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        addnode(root, 0);
        for (int i=0; i<ls.size(); i++) sum += ((Integer) ls.get(i)).intValue();
        return sum;
    }

    private void addnode(TreeNode node, int num) {
        int tmp = num*10 + node.val;
        if (node.left != null)  addnode(node.left, tmp);
        if (node.right != null)  addnode(node.right, tmp);
        if (node.left == null && node.right == null) ls.add(tmp);
    }
    

   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode a = new TreeNode(1);
       TreeNode b  = new TreeNode(1);
       TreeNode c = new TreeNode(1);
       a.left = b;
       a.right =c;
       b.left = null;
       b.right = null;
       c.left = null;
       c.right = null;
       int ans = slu.sumNumbers(a); 
       System.out.println(ans);
   }
}


