public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int len = prices.length;

        if (len < 2) return profit;

        int i = 0;
        while (i < len-1) {
            if (prices[i] < prices[i+1]) 
                profit += prices[i+1] - prices[i];
            i++;
        }
        return profit;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] x = new int[] {5, 2, 4, 1, 3};
       StdOut.println(slu.maxProfit(x));
   }
}
