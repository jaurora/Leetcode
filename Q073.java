import java.util.*;
import java.lang.*;

public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) return;
        int n = matrix[0].length;
        int rowzero = 0;
        int colzero = 0;

        int s=0;
        while (s<n && rowzero==0) {
            if (matrix[0][s] == 0) rowzero=1;
            s++;                                   
        }

        int p=0;
        while (p<m && colzero==0) {
            if (matrix[p][0] == 0) colzero=1;
            p++;
        }

        if (n > 1 && m > 1) {

            for (int i=1; i<m; i++) {
                for (int j=0; j<n; j++) if (matrix[i][j] == 0) matrix[i][0] = 0; }   
            for (int j=1; j<n; j++) {
                for (int i=0; i<m; i++) if (matrix[i][j] == 0) matrix[0][j] = 0; }   
       
            for (int i=1; i<m; i++) {
                if (matrix[i][0] == 0) for (int j=1; j<n; j++) matrix[i][j]=0;
            }

            for (int j=1; j<n; j++) {
                if (matrix[0][j] == 0) for (int i=1; i<m; i++) matrix[i][j]=0; 
            }
        }
        if (colzero == 1) for (int i=0; i<m; i++) matrix[i][0] = 0;
        if (rowzero == 1) for (int j=0; j<n; j++) matrix[0][j] = 0;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[][] a = new int[1][2];
       a[0][1] = 0;
       a[0][0] = 1;
       slu.setZeroes(a);
       //StdOut.println(ans);
   }
}
