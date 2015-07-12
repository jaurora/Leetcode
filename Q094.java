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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<TreeNode>();
        List<Integer> ans = new ArrayList<Integer>();
        if (root == null) return ans;
                
        TreeNode node = root;

        while (!st.empty() || node != null) {
            if (node != null) {
                st.push(node);
                node = node.left;
            } else {
                node = st.pop();
                ans.add(node.val);
                node = node.right;
            }
        }
        return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode a = new TreeNode(0);
       TreeNode b = new TreeNode(1);
       TreeNode c = new TreeNode(2);
       a.left = b;
       b.right = c;
       List<Integer> ans = slu.inorderTraversal(a);
       System.out.println(Arrays.toString(ans.toArray()));
       
   }
}
