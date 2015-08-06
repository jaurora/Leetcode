import java.util.*;
import java.lang.*;

public class Solution {
    public boolean isMatch(String s, String p) {
        int slen = s.length();
        int plen = p.length();
        if (slen == 0 && plen == 0) return true;
        if (slen == 0 || plen == 0) return false;
        boolean[][] dp = new boolean[slen+1][plen+1];

        for (int i=0; i<=slen; i++) dp[i][0] = false;        
        dp[0][0]= true;
        for (int j=1; j<=plen; j++) {
            if (p.charAt(j-1) == '*') dp[0][j]  = dp[0][j-2];
            else  dp[0][j] = false; 
        }

        for (int i=1; i<=slen; i++) {
            for (int j=1; j<=plen; j++) {
                if (p.charAt(j-1) != '.' && p.charAt(j-1) != '*') dp[i][j] = dp[i-1][j-1] && p.charAt(j-1) == s.charAt(i-1);
                else if (p.charAt(j-1) == '.') dp[i][j] = dp[i-1][j-1];
                else {
                    if (s.charAt(i-1) != p.charAt(j-2) && p.charAt(j-2) != '.') dp[i][j] = dp[i][j-2];
                    else dp[i][j] = dp[i][j-2] || dp[i-1][j];
                    
                }
            }
        }
        return  dp[slen][plen];  
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       boolean ans = slu.isMatch("ab", ".*");
       System.out.println(ans);
       //for (int i=0; i<ans.size(); i++) { System.out.println(Arrays.toString(ans.get(i).toArray())); }
   }
}


