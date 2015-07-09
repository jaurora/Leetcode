import java.util.*;
import java.lang.*;

public class Solution {
    private List<List<Integer>> ans = new ArrayList<List<Integer>>();
    private int[] num;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        num = nums;
        Arrays.sort(num);
        List<Integer> ls = new ArrayList<Integer>();
        ans.add(ls);
        for (int i=0; i<num.length; i++) {
            if (i>0 && num[i] == num[i-1]) continue;
            addsubset(ls, i);          
        }
        return ans;
    }

    private void addsubset(List<Integer> list, int index) {
        List<Integer> tmp = new ArrayList<Integer>(list);
        tmp.add(num[index]);
        ans.add(tmp);
        int idx = index+1;
        while (idx < num.length) {
            if (idx > index+1 && num[idx-1] == num[idx]) {idx++; continue;}
            addsubset(tmp, idx);
            idx++;
        }
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {1};
       slu.subsetsWithDup(a);
   }
}
