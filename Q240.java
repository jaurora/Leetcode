import java.util.*;
import java.lang.*;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        if (target < matrix[0][0] || target > matrix[m-1][n-1]) return false;
        int y = n-1;
        for (int  x=0; x<m; x++) {
            while (y >=0 && matrix[x][y] > target) y--;
            if (matrix[x][y] == target) return true;
        }
        return false;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[][] a = new int[1][2];
       a[0][0] = -1;
       a[0][1] = 3;
       boolean ans = slu.searchMatrix(a, 3);
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


