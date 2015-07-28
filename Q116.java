import java.util.*;
import java.lang.*;

/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */

public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        List<TreeListNode> l = new ArrayList<TreeListNode>();
        l.add(root);
        level(l);
    }

    private void level(List<TreeLinkNode> lt) {
        if (lt.size() < 1) return;
        List<TreeLinkNode> tmp = new ArrayList<Integer>();
        for (int i=0; i<lt.size(); i++) {
            TreeListNode p = (TreeListNode) lt.get(i);
            if (i < lt.size()-1) lt.get(i).next = (TreeListNode) lt.get(i+1);
            else lt.get(i).next = null;
            if (p.left != null) tmp.add(p.left);
            if (p.right != null) tmp.add(p.right);
        }
        level(tmp);
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode a = TreeNode()
       //ListNode ans = slu.reverseBetween(a, 2,4);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


