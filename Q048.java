import java.util.*;
import java.lang.*;

public class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;
        int[][] check = new int[n][n];

        for (int i=0; i<n; i++) for (int j=0; j<n; j++) check[i][j]=0;

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1; j++) {
                int tmp = matrix[i][j];
                int newi = j;
                int newj = n-i-1; 
                while (check[newi][newj] == 0){
                    int savevar = matrix[newi][newj];
                    matrix[newi][newj] = tmp;
                    check[newi][newj] = 1;
                  
                    int savei = newi;
                    newi = newj;
                    newj  = n-savei-1;
                    tmp = savevar;
                }
            }
        }
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       int[][] a = new int[2][2];
       a[0][0] = 1;
       a[0][1] = 2;
       a[1][0] = 3;
       a[1][1] = 4;
       slu.rotate(a);
       StdOut.println(a[0][0]);
       StdOut.println(a[0][1]);
       StdOut.println(a[1][0]);
       StdOut.println(a[1][1]);
   }
}
