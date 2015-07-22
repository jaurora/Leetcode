import java.util.*;
import java.lang.*;

public class Solution {
    public int numDecodings(String s) {
        int len = s.length();
        if (len == 0) return 0;
        
        int[] dp = new int[len+1];
        dp[0] = 1;

        for (int i=0; i<len; i++) {

            if (s.charAt(i) == '0') {
                if (i==0 || (s.charAt(i-1) != '1' && s.charAt(i-1) !='2')) return 0;
                dp[i+1] = dp[i-1];                    
                continue;               
            } else {
                dp[i+1] = dp[i];
            }
            if (i>0) {
                int tmp = Integer.parseInt(s.substring(i-1,i+1));
                if (tmp >= 10 && tmp <= 26) 
                    dp[i+1] += dp[i-1];
            }
            System.out.println(dp[i+1]);
        }
        return dp[len]; 
    }



   public static void main(String[] args) {
       Solution slu = new Solution();
       String x = "012";
       int ans = slu.numDecodings(x); 
       System.out.println(ans);

   }
}


