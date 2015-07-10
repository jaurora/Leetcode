import java.util.*;
import java.lang.*;

public class Solution {
    char[][] sboard;
    char[] str;
    int[][] check;
    int m;
    int n;

    public boolean exist(char[][] board, String word) {
        str = word.toCharArray();
        sboard = board;
        int slen = str.length;
        m = sboard.length;
        if (m==0) return false;
        n = sboard[0].length;
        check = new int[m][n];

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) check[i][j] = 0;
        }

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (sboard[i][j] == str[0]) {
                    check[i][j] = 1;
                    if (find(i, j, 1)) return true;
                    check[i][j] = 0;
                }
            }
        }
        return false;
    }

    private boolean find(int i, int j, int ilen) {
        if (ilen == str.length) return true;
        check[i][j] = 1;
        if (i>0 && sboard[i-1][j] == str[ilen] && check[i-1][j]==0) {
            if (find(i-1,j,ilen+1)) return true;
        }
        if (i<m-1 && sboard[i+1][j] == str[ilen] && check[i+1][j]==0) {
            if (find(i+1,j,ilen+1)) return true;
        }
        if (j>0 && sboard[i][j-1] == str[ilen] && check[i][j-1]==0) {          
            if (find(i,j-1,ilen+1)) return true;
        }
        if (j<n-1 && sboard[i][j+1] == str[ilen] && check[i][j+1]==0) {         
            if (find(i,j+1,ilen+1)) return true;
        }  
        check[i][j] = 0;
        return false;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       
       
       //slu.exist(a);
   }
}
