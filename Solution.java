import java.util.*;

public class Solution {

    public int numDistinct(String S, String T) {	
	
	S = " " + S;
	T = " " + T;
	char[] sc = S.toCharArray();
	char[] tc = T.toCharArray();

	int slen = sc.length;
	int tlen = tc.length;
	int[][] dp = new int[tlen][slen];

	for (int i = 0; i < tlen; i++) {
	    for (int j = 0; j < slen; j++) {
		if (i == 0) dp[i][j] = 1;
		else if (j == 0) dp[i][j] = 0;
		else {
		    dp[i][j] = dp[i][j-1];
		    if (tc[i] == sc[j]) dp[i][j] + = dp[i-1][j-1];
		}
	    }
	}		
	return dp[tlen-1][slen-1];
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       String s = "aacaacca";
       String t = "ca";
       System.out.println(slu.numDistinct(s,t));
   }
}
