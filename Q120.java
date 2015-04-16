import java.util.*;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int nRows = triangle.size();
        List<Integer> l = null;
        for (int i = nRows-1; i >=0; i--) {
            if (i == nRows-1) l = triangle.get(i);
            else {
                List<Integer> cur = triangle.get(i);
                for (int j = 0; j <= i; j++) {
                    cur.set(j, Math.min(l.get(j), l.get(j+1)));
                }
                l = cur;
            }
        }
        return l.get(0);
    }
    
   public static void main(String[] args) {
       Solution slu = new Solution();
       List<Integer> t = new ArrayList<Integer>();
       t.add(10);
       List<List<Integer>> tr = new ArrayList<List<Integer>>();
       tr.add(t);
       int m = slu.minimumTotal(tr);
       StdOut.println(m);
   }
}

