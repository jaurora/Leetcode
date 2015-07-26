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
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(0);
        for (int i=1; i<=n; i++) {
            ans = gray(i, ans);
        }
        return ans;
    }
    private List<Integer> gray(int p, List<Integer> l) {
        List<Integer> tmp = new ArrayList<Integer>(l);
        for (int i=l.size()-1; i>=0; i--) {
            tmp.add((1<<(p-1))+l.get(i));
        }
        return tmp;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       List<Integer> ans = slu.grayCode(2);
       for (int i=0; i<ans.size(); i++) System.out.println(ans.get(i));
   }
}


