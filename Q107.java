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
    private List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return ans;
        List<TreeNode> p = new ArrayList<TreeNode>();
        p.add(root);
        level(p);
        return ans;
    }

    private boolean level(List<TreeNode> lt) {
        if (lt.size() == 0) return true;
        List<Integer> tmp = new ArrayList<Integer>();
        List<TreeNode> tn = new ArrayList<TreeNode>();
        for (int i=0; i<lt.size(); i++) {
            TreeNode x = (TreeNode) lt.get(i);
            tmp.add(x.val);
            if (x.left != null) tn.add(x.left);
            if (x.right != null) tn.add(x.right);
        }
        if (level(tn)) ans.add(tmp);
        return true;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode a = TreeNode()
       //ListNode ans = slu.reverseBetween(a, 2,4);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


