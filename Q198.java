public class Solution {
    public int rob(int[] num) {
        int len = num.length;
        int[] dp = new int[len+3];
        int[] addnum = new int[len+3];
        for (int i = 0; i < len+3; i++) {
            if (i < 3) { dp[i] = 0; addnum[i] = 0; } 
            else { addnum[i] = num[i-3]; }
        }
        for (int i = 3; i < len+3; i++) {
            if (dp[i-2] > dp[i-3]) dp[i] = dp[i-2] + addnum[i];
            else dp[i] = dp[i-3] + addnum[i];
            StdOut.println(i);
            StdOut.println(dp[i]);

        }
        
        if (dp[len+1] > dp[len+2]) return dp[len+1];
        else return dp[len+2];
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] num = {6,6,4,8,4,3,3,10};
       StdOut.println(slu.rob(num));
   }
}
