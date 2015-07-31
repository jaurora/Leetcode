import java.util.*;
import java.lang.*;


public class Solution {
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        List<TreeNode> l = new ArrayList<TreeNode>();
        if (root == null) return ans;
        l.add(root);
        bfs(l);
        return ans;
    }

    private void bfs(List<TreeNode> ls) {
        int len = ls.size();
        if (len == 0) return;
        ans.add(ls.get(len-1).val);
        List<TreeNode> tmp = new ArrayList<TreeNode>();
        for (int i=0; i<len; i++) {
            TreeNode tn = (TreeNode) ls.get(i);
            if (tn.left != null) tmp.add(tn.left);
            if (tn.right != null) tmp.add(tn.right);
        }
        bfs(tmp);
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int ans = slu.rangeBitwiseAnd(5, 7);
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


