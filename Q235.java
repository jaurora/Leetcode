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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> lp = search(new ArrayList<TreeNode>(), root, p);
        List<TreeNode> lq = search(new ArrayList<TreeNode>(), root, q);
        if (lp == null || lq == null) return null;
        int i = 0;
        TreeNode ance = null;
        while (i<lp.size() && i<lq.size() && lp.get(i) == lq.get(i)) {ance = lp.get(i); i++;}
        return ance;
    }

    private List<TreeNode> search(List<TreeNode> ls, TreeNode tn, TreeNode target) {
        ls.add(tn);
        if (tn == target) return ls;
        List<TreeNode> ll = null;
        if (tn.left != null) {
            List<TreeNode> tmp = new ArrayList<TreeNode>(ls);
            tmp.add(tn.left);
            ll = search(tmp, tn.left, target);
        }
        if (ll != null) return ll;
        if (tn.right != null) {
            List<TreeNode> tmp = new ArrayList<TreeNode>(ls);
            tmp.add(tn.right);
            ll = search(tmp, tn.right, target);
        }
        return ll;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode a = new TreeNode(1);
       TreeNode b = new TreeNode(2);
       a.right = b;
       a.left = null;
       b.right = null;
       b.left = null;
       TreeNode ans = slu.lowestCommonAncestor(a, a, b);
       System.out.println(ans.val);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


