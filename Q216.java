import java.util.*;

public class Solution {
    private List<List<Integer>> ans = new ArrayList<List<Integer>>();
    private int kk = 0;
    public List<List<Integer>> combinationSum3(int k, int n) {
        kk = k;
        List<Integer> sl = new ArrayList<Integer>();
        add(sl, n, 1);
        return ans;
    }

    private void add(List<Integer> list, int left, int snum) {

        if (left == 0 && list.size() == kk) ans.add(list); 
        
        if (left >= snum && list.size() < kk) {
            for (int i = snum; i < 10; i++) {
                if (i <= left) {
                    List<Integer> newlist = new ArrayList<Integer>(list);
                    newlist.add(i);
                    add(newlist, left-i, i+1);
                }
            }
        }
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       List<List<Integer>> t = slu.combinationSum3(3, 9);
       for (int j = 0; j < t.size(); j++) {
           StdOut.println(t.get(j));
       }
   }
}
