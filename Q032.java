public class Solution {
    public int longestValidParentheses(String s) {
	char[] charArray = s.toCharArray();
	int len = s.length();

	if (len == 0) return 0;  
	int[] dp = new int[len];
	int maxi = 0;
	dp[0] = 0;  // the longest length of valid parentheses before i
	for (int i = 1; i < len; i++) {
	    if (charArray[i] == '(') dp[i] = 0;
	    else {
		  int j = i - dp[i-1] -2;
		  if (j+1 >= 0 && charArray[j+1] == '(') {
		        if (j >= 0) dp[i] = dp[j] + dp[i-1] + 2;
		        else dp[i] = dp[i-1] + 2; 
			System.out.println(dp[i]);
		  } else dp[i] = 0;
	    }
	    if (dp[i] > maxi) maxi = dp[i];
	}
	return maxi;       
    }
    public static void main(String[] args) {
  	Solution slu = new Solution();
	System.out.println(slu.longestValidParentheses("()"));
    }
}

