public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = 0;
                if (i > 0) { dp[i][j] += dp[i-1][j]; }
                if (j > 0) { dp[i][j] += dp[i][j-1]; }
                if (i == 0 && j == 0) dp[i][j] = 1;
            }
        }
        return dp[m-1][n-1];
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       StdOut.println(slu.uniquePaths(7, 3));
   }
}
