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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return sm(p, q);
    }

    private boolean sm(TreeNode m, TreeNode n) {
        if (m == null) return n == null;
        if (n == null) return m == null;
        if (m.val != n.val) return false;
        return (sm(m.left, n.left) && sm(m.right, n.right));
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       //ListNode ans = slu.reverseBetween(a, 2,4);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


