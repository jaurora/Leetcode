import java.util.*;
import java.lang.*;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int m = matrix.length;
        if (m == 0) return ans;
        int n = matrix[0].length;

        int[][] check = new int[m][n];
        for (int i=0; i<m; i++) for (int j=0; j<n; j++) check[i][j] = 0;
        
        boolean stop = false;
        int i=0, j=0, h=1, change=0, stopcheck=0;
        while (!stop) {
            if (change == 0) {
                ans.add(matrix[i][j]);
                check[i][j] = 1;
            } else { stopcheck=1; change = 0; }

            if (h==1) {
                if (j-1>=0 && check[i][j-1]==0) j--;
                else if (j+1<n && check[i][j+1]==0) j++;
                else if (stopcheck == 1) stop = true;
                else { h=0; change=1; }
            } else {
                if (i-1>=0 && check[i-1][j]==0) i--;
                else if (i+1<m && check[i+1][j]==0) i++;
                else if (stopcheck == 1) stop = true;
                else { h=1; change=1; }
            }  
            stopcheck = 0;
        }  

        //Iterator<Integer> it = ans.iterator();
        //while (it.hasNext()) StdOut.println((Integer) it.next());
        return ans;
    }



   public static void main(String[] args) {
       Solution slu = new Solution();
       int[][] a = new int[2][2];
       a[0][0] = 1;
       a[0][1] = 2;
       a[1][0] = 3;
       a[1][1] = 4;
       slu.spiralOrder(a);
   }
}
