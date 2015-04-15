import java.util.*;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> l = new ArrayList<Integer>();
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        if (numRows == 0) return l;
        for (int i = 0; i < numRows; i++) {
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
            ll.add(tmp);
            l = new ArrayList<Integer>(tmp);
            StdOut.println(l);
        }
        return ll;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       List<List<Integer>> t = new ArrayList<List<Integer>>();
       t = slu.generate(5);
       //StdOut.println(ans);
   }
}

