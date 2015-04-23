import java.util.*;

public class Solution {
    private List<String[]> ans = new ArrayList<String[]>();
    private int nn = 0;
    private char[] empty = null;

    public List<String[]> solveNQueens(int n) {
        List<Integer> lp = new ArrayList<Integer>();
        if (n == 2 || n == 3) return ans;
        nn = n;

        empty = new char[nn];
        for (int i = 0; i<nn; i++) empty[i]= '.';

        if (n == 1) {
            empty[0] = 'Q';
            String[] s = new String[1];
            s[0] = String.valueOf(empty);
            ans.add(s);
            return ans;
        }

        addqueen(lp,0);
        return ans;
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
                    else {
                        String[] s = new String[nn];
                        for (int k = 0; k < nn; k++) {
                            char[] copy = empty.clone();
                            Integer gpy = tmp.get(k);
                            copy[gpy] = 'Q';
                            s[k] = String.valueOf(copy);
                        }
                        ans.add(s);
                    }               
                }       
            }
        }
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       StdOut.println(slu.solveNQueens(4));
   }
}
