import java.util.*;

public class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        if (row == 0) return 0;
        int col = grid[0].length;
        if (col == 0) return 0;

        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int up = 0;
                int le = 0;
                boolean upfind = false;
                boolean lefind = false;
                if (i > 0) { up = dp[i-1][j]; upfind = true; }
                if (j > 0) { le = dp[i][j-1]; lefind = true; }
                if (upfind && lefind) {
                    dp[i][j] = grid[i][j] +  Math.min(up, le);
                } else if (!upfind && lefind) {
                    dp[i][j] = grid[i][j] + le;
                } else if (upfind && !lefind) {
                    dp[i][j] = grid[i][j] + up;
                } else { dp[i][j] = grid[i][j]; }
            }
        }
        return dp[row-1][col-1];
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       //System.out.println(slu.climbStairs(3));
   }
}
