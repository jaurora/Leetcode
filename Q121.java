import java.util.*;

public class Solution {
    public int maxProfit(int[] prices) {
	int len = prices.length;
	int[] dp = new int[len];
	int maxi = 0;
	int tmpbuy = 0;
	
	for (int i = 0; i < len; i++) {
	    if (i == 0) {
		dp[i] = 0;
		tmpbuy = prices[i];
	    } else {
		dp[i] = prices[i] - tmpbuy;
		
		if (prices[i] < tmpbuy) {
		    tmpbuy = prices[i];
		    dp[i] = 0;
		}		
	    }
	    if (maxi < dp[i]) maxi = dp[i];
	}
	return maxi;
    }
    
   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] prices = {2, 3, 2, 5, 1, 6};
       System.out.println(slu.maxProfit(prices));
   }
}
