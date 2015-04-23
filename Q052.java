import java.util.*;

public class Solution {
    private int cnt = 0;
    private int nn = 0;

    public int totalNQueens(int n) {
        List<Integer> lp = new ArrayList<Integer>();
        if (n == 2 || n == 3) return cnt;
        nn = n;

        if (n == 1) return 1;

        addqueen(lp,0);
        return cnt;
    }


    private void addqueen(List<Integer> lp, int row) {
        double one = 1.0;
        for (int i = 0; i < nn; i++) {
            if (row == 0) {
                List<Integer> tmp = new ArrayList<Integer>(lp);
                tmp.add(i);
                addqueen(tmp, row+1); 
            } else {
                int valid = 1;
                for (int j = 0; j < row; j++) {
                    Integer py = lp.get(j);
                    if (py.intValue() == i || Math.abs((double) (py-i)/(j-row)) == one) { valid = 0; break; } 
                }
                
                if (valid == 1) {
                    List<Integer> tmp = new ArrayList<Integer>(lp);
                    tmp.add(i);
                    if (row < nn-1) addqueen(tmp, row+1); 
                    else cnt++;          
                }       
            }
        }
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       StdOut.println(slu.totalNQueens(4));
   }
}
