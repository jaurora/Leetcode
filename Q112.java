import java.util.*;

public class Solution {
    private boolean find = false;
    private int sum = 0;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root  == null) return find;
        this.sum = sum;
        dfs(root, 0);
        return find;
    }
   

    private void dfs(TreeNode leaf, int downsum) {
        if (leaf.left == null && leaf.right == null) {
            if (downsum+leaf.val == sum) find = true;
        }

        if (leaf.left != null) dfs(leaf.left, downsum+leaf.val);
        if (leaf.right != null) dfs(leaf.right, downsum+leaf.val);
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode r = new TreeNode(1);
       TreeNode x = new TreeNode(2);
       r.left = x;
       StdOut.println(slu.hasPathSum(r, 1));

   }
}
