import java.util.*;
import java.lang.*;

public class Solution {
    private char[][] bd;
    public void solveSudoku(char[][] board) {
        bd = board;
        solve(0, 0);
    }

    private boolean solve(int i, int j) {
        int idx = i*9+j;
        int nxt = idx+1;
        if (idx >= 81) return true;
        int ii = nxt/9;
        int jj  = nxt - ii*9;
        if (bd[i][j] != '.') return solve(ii, jj);
        else {
            for (int p=1; p<=9; p++)  {
                bd[i][j]= (char) ('0'+p);
                if (c1(i, j) && c2(i, j) && c3(i, j)) {
                    if (solve(ii, jj)) return true;                    
                }
            }
            bd[i][j]= '.';
            return false;
        }
    }

    private boolean c1(int i, int j) {
        for (int p=0; p<9; p++) {
            if (p != j && bd[i][p] == bd[i][j]) return false; 
        }
        return true;
    }

    private boolean c2(int i, int j) {
        for (int p=0; p<9; p++) {
            if (p != i && bd[p][j] == bd[i][j]) return false; 
        }
        return true;
    }

    private boolean c3(int i, int j) {
        int xb = i/3*3;
        int yb = j/3*3;
        for (int p=xb; p<xb+3; p++) {
            for (int q=yb; q<yb+3; q++) {
                if (p != i && q != j && bd[p][q] == bd[i][j]) return false;
            }
        }
        return true;
    }



   public static void main(String[] args) {
       Solution slu = new Solution();
       char[][] a = new char[9][9];
       a[0] = "..9748...".toCharArray();
       a[1] = "7........".toCharArray();
       a[2] = ".2.1.9...".toCharArray();
       a[3] = "..7...24.".toCharArray();
       a[4] = ".64.1.59.".toCharArray();
       a[5] = ".98...3..".toCharArray();
       a[6] = "...8.3.2.".toCharArray();       
       a[7] = "........6".toCharArray();
       a[8] = "...2759..".toCharArray();
       
       slu.solveSudoku(a);
       //System.out.println(ans);
       for (int i=0; i<9; i++) { System.out.println(Arrays.toString(a[i])); }
   }
}


