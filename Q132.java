import java.util.*;
import java.lang.*;

public class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] dp  = new boolean[n][n];
        for (int i=0; i<n; i++) for (int j=0; j<n; j++) dp[i][j] = false;
        int[] cut = new int[n];
        for (int i=0; i<n; i++) cut[i] = i;
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++) {
                if (j == i) dp[i][j] = true;
                else if (j == i-1 && s.charAt(i) == s.charAt(j)) dp[i][j] = true;
                else if (j<i-1 && dp[i-1][j+1] && s.charAt(i) == s.charAt(j)) dp[i][j] = true;
                
                if (dp[i][j]) {
                    int pre = 0;
                    if (j-1 >= 0) pre = cut[j-1];
                    else pre = -1;
                    cut[i] = Math.min(pre+1, cut[i]);
                }       
            }
        }
        return cut[n-1];
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       String s = "aab";
       int ans = slu.minCut(s);
       System.out.println(ans);
       //for (int i=0; i<ans.size(); i++) { System.out.println(Arrays.toString(ans.get(i).toArray())); }
   }
}


