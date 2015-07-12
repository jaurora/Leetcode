import java.util.*;
import java.lang.*;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if (n==0) return matrix;
        int [][] check = new int[n][n];
        for (int i=0; i<n; i++) for (int j=0; j<n; j++) check[i][j] = 0;
        boolean stop = false;
        int i=0, j=0, h=1, change=0, num=1, stopcheck=0;
        while (!stop) {
            if (change == 0) {
                matrix[i][j] = num;
                check[i][j] = 1;
                num++;
            } else { stopcheck=1; change = 0; }

            if (h==1) {
                if (j-1>=0 && check[i][j-1]==0) j--;
                else if (j+1<n && check[i][j+1]==0) j++;
                else if (stopcheck == 1) stop = true;
                else { h=0; change=1; }
            } else {
                if (i-1>=0 && check[i-1][j]==0) i--;
                else if (i+1<n && check[i+1][j]==0) i++;
                else if (stopcheck == 1) stop = true;
                else { h=1; change=1; }
            }  
            stopcheck = 0;
        }  
        return matrix;
    }        

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[][] a = slu.generateMatrix(0);
   }
}
