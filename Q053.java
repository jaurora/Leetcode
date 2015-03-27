public class Solution {
    public int maxSubArray(int[] A) {
	int len = A.length;
	int[] dp = new int[len];
	int maxi = 0;
	for (int i = 0; i < len; i++) {
	    if (i == 0) { 
		dp[i] = A[i];
		maxi = dp[i];
	    } else {
		if (dp[i-1] > 0) dp[i] = A[i] + dp[i-1];
		else dp[i] = A[i];
	    }
	    if (maxi < dp[i]) maxi = dp[i];
	}
	return maxi;
    }
 
   public static void main(String[] args) {
  	Solution slu = new Solution();
	int[] A = {-2, 1, -3, 4, -1,2,1,-5,4};
   	System.out.println(slu.maxSubArray(A));
    }
}
