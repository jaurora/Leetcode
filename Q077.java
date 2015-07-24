import java.util.*;
import java.lang.*;

public class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    int nn = 0;
    public List<List<Integer>> combine(int n, int k) {
        nn = n;
        for (int i=1; i<=n; i++) {
            List<Integer> l = new ArrayList<Integer>();
            l.add(i);
            add(l, i+1, k-1);
        }
        return ans;
    }

    private void add(List ls, int start, int res) {
        if (res == 0) ans.add(ls);
        for (int i=start; i<=nn; i++) {
            List<Integer> l = new ArrayList<Integer>(ls);
            l.add(i);
            add(l, i+1, res-1);
        }
    }
    


   public static void main(String[] args) {
       Solution slu = new Solution();
       List<List<Integer>> ans = slu.combine(4,2); 
       for (int i=0; i<ans.size();i++)
           System.out.println(Arrays.toString(ans.get(i).toArray()));
   }
}


