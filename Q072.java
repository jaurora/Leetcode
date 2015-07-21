import java.util.*;
import java.lang.*;

public class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        int[][] dp = new int[len1+1][len2+1];
        
        for (int p=0; p<=len1; p++) dp[p][0] = p;
        for (int p=0; p<=len2; p++) dp[0][p] = p;

        for (int i=1; i<=len1; i++) {
            for (int j=1; j<=len2; j++) {
                int x1=0, x2=0, x3=0;
                if (word1.charAt(i-1) == word2.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
                else {
                    x1 = dp[i-1][j-1]+1;
                    x2 = dp[i-1][j]+1;
                    x3 = dp[i][j-1]+1;
                    dp[i][j] = Math.min(x1, Math.min(x2, x3));
                }
                System.out.println(dp[i][j]);
            }
        }
        return dp[len1][len2];
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       String x = "abc";
       String y = "abd";
       int ans = slu.minDistance(x, y);
       
       System.out.println(ans);

   }
}


