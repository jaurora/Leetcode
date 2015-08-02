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
    public String largestNumber(int[] nums) {
        int len = nums.length;
        String ans = "";
        String[] str = new String[len];
        for (int i=0; i<len; i++) str[i] = String.valueOf(nums[i]);
        Arrays.sort(str, new comp());
        for (int i=len-1; i>=0; i--) ans += str[i];
        while (ans.charAt(0) == '0' && ans.length()>1) ans = ans.substring(1,ans.length());
        return ans;
    }

    private class comp implements Comparator<String> {
        public int compare(String s1, String s2) {
            if (s1.concat(s2).compareTo(s2.concat(s1)) >= 0) return 1;
            else return -1;
        }
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {0, 0};
       String ans = slu.largestNumber(a);
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


