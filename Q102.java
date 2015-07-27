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
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return ans;
        List<TreeNode> tn = new ArrayList<TreeNode>();
        tn.add(root);
        level(tn);
        return ans;
    }

    private void level(List<TreeNode> ln) {
        if (ln.size() == 0) return;
        List<Integer> ll = new ArrayList<Integer>();
        List<TreeNode> tmp = new ArrayList<TreeNode>();

        for (int i=0; i<ln.size(); i++) {
            TreeNode p = (TreeNode) ln.get(i);
            ll.add(p.val);
            if (p.left != null) tmp.add(p.left); 
            if (p.right != null) tmp.add(p.right);
        }
        ans.add(ll);
        level(tmp);
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode a = TreeNode()
       //ListNode ans = slu.reverseBetween(a, 2,4);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


