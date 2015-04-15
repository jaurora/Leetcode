import java.util.*;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> tmp = new ArrayList<Integer>();
            if (i == 0) tmp.add(1);
            else {              
                for (int j = 0; j <= i; j++) {
                    int sum = 0;
                    if (j-1 >= 0) sum += l.get(j-1);
                    if (j < i) sum += l.get(j);
                    tmp.add(sum);
                }
            }
            l = tmp;
        }
        StdOut.println(l);
        return l;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       List<Integer> t = new ArrayList<Integer>();
       t = slu.getRow(0);
       //StdOut.println(ans);
   }
}

