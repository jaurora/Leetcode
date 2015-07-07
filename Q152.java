import java.util.*;
import java.lang.*;

public class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        if (len < 1) return 0;
        int dpp = nums[0];
        int dpm = nums[0];
        int max = nums[0];

        for (int i = 1; i < len; i++) {
            int save_dpp = dpp;
            dpp = Math.max(Math.max(dpp*nums[i], nums[i]), dpm*nums[i]);
            dpm = Math.min(Math.min(save_dpp*nums[i], nums[i]), dpm*nums[i]);
            max = Math.max(max, dpp);
            StdOut.println(max);
            StdOut.println(dpp);
            StdOut.println(dpm);
        }
        return max;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {2, -5, -2, -4, 3};
       StdOut.println(slu.maxProduct(a));
   }
}
