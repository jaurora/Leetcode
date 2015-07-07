import java.util.*;
import java.lang.*;

public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int xlen = matrix.length;
        if (xlen<1) return 0;
        int ylen = matrix[0].length;
        int[] tmp = new int[ylen];
        int[] ctmp = new int[ylen];
        Stack<Integer> st = new Stack<Integer> ();

        int max = 0;
        st.push(-1);

        for (int i = 0; i < xlen; i++) {
            for (int j = 0; j < ylen; j++) {
                if (i == 0) tmp[j] = 0;
                ctmp[j] = ((matrix[i][j]=='1') ?  1+tmp[j]:0);                
                tmp[j] = ctmp[j];
            }

            for (int j = 0; j <= ylen; j++) {
                Integer ahead = (Integer) st.peek();
                while (ahead.intValue() != -1 && (j==ylen || ctmp[j] < ctmp[ahead])) {
                    Integer bin = (Integer) st.pop();
                    Integer start = (Integer) st.peek();
                    int area = ctmp[bin] * (j-start.intValue()-1);
                    max = ((max >= area) ? max:area);
                    ahead = (Integer) st.peek();
                }
                if (j< ylen) st.push(j);
            }
        }
        return max;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       char[][] a = new char[4][4];
       for (int i=0; i<4; i++) for (int j=0; j<4; j++) a[i][j]='0';

       a[0][0] = '1';
       a[0][2] = '1';
       a[1][0] = '1';
       a[1][2] = '1';
       a[1][3] = '1';
       a[2][0] = '1';
       a[2][2] = '1';
       a[2][3] = '1';
       a[3][0] = '1';
       a[3][1] = '1';
       a[3][2] = '1';
       a[3][3] = '1';
       StdOut.println(slu.maximalRectangle(a));
   }
}
