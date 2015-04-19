import java.util.*;

public class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    private int sum = 0;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> l = new ArrayList<Integer>();
        if (root  == null) return ans;
        this.sum = sum;
        dfs(root, 0, l);
        return ans;
    }
   

    private void dfs(TreeNode leaf, int downsum, List<Integer> list) {
        if (leaf.left == null && leaf.right == null) {
            if (downsum+leaf.val == sum) {
                list.add(leaf.val);
                ans.add(list);
            }
        }

        if (leaf.left != null) {
            List<Integer> tmp = new ArrayList<Integer>(list);
            tmp.add(leaf.val);
            dfs(leaf.left, downsum+leaf.val, tmp);
        }
        if (leaf.right != null) {
            List<Integer> tmp = new ArrayList<Integer>(list);
            tmp.add(leaf.val);
            dfs(leaf.right, downsum+leaf.val, tmp);
        }
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       TreeNode r = new TreeNode(1);
       TreeNode x = new TreeNode(2);
       r.left = x;
       StdOut.println(slu.pathSum(r, 3));

   }
}
