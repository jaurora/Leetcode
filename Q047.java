import java.util.*;
import java.lang.*;


public class Solution {
    private int[] used;
    private int[] num;
    private List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        num = nums;
        Arrays.sort(num);
        int len = num.length;
        used = new int[len];
        for (int i=0; i<len; i++) used[i] = 0;
        pm(new ArrayList<Integer>());
        return ans;
    }

    private void pm(List<Integer> ls) {
        for (int i=0; i<num.length; i++) {
            if (used[i] == 1) continue;
            if (i>0 && used[i-1]== 0 && num[i] == num[i-1]) continue;
            List<Integer> nls = new ArrayList<Integer>(ls);
            nls.add(num[i]);
            used[i] = 1;
            if (nls.size() == num.length) ans.add(nls);
            pm(nls);
            used[i] = 0;
        }
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       List<List<Integer>> ans = slu.permuteUnique(new int[] {1, 1, 2});
       //System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


