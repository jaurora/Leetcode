import java.util.*;
import java.lang.*;


public class Solution {
    private int m, n;
    private int[][] used;
    public int numIslands(char[][] grid) {
        m = grid.length;
        if (m==0) return 0;
        n = grid[0].length;
        if (n==0) return 0;
        used = new int[m][n];
        for (int i=0; i<m; i++) for (int j=0; j<n; j++) used[i][j]=0;
        int ans = 0;
        
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (used[i][j] == 1) continue;
                if (grid[i][j] == '1') { dfs(grid, i, j); ans++; }
                else used[i][j] = 1;
            }
        }
        return ans;
    }
    
    private void dfs(char[][] grid, int i, int j) {
        if (i<0 || i>=m || j<0 || j>=n) return;
        if (used[i][j] ==  1) return;
        if (grid[i][j] == '1') {
            used[i][j] = 1;
            dfs(grid, i-1, j);
            dfs(grid, i+1, j);
            dfs(grid, i, j-1);
            dfs(grid, i, j+1);
        } 
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       char[][] a = new char[2][1];
       a[0][0] = '1';
       a[1][0] = '1';
       int ans = slu. numIslands(a);
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


