import java.util.*;
import java.lang.*;

public class Solution {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] dp1 = new int[nums.length];
        for (int i=0; i<nums.length-1; i++) {
            int x1  = i-2;
            int x2 = i-3;
            int y1 = 0;
            int y2 = 0;
            if (x1 >= 0) y1 = dp1[x1];
            if (x2 >= 0) y2 = dp1[x2];
            dp1[i] = Math.max(y1, y2) + nums[i];
        }
        int m1 = 0;
        if (nums.length-2>=0) m1 = Math.max(m1, dp1[nums.length-2]);
        if (nums.length-3>=0) m1 = Math.max(m1, dp1[nums.length-3]);
     
        int[] dp2 = new int[nums.length];
        for (int i=1; i<nums.length; i++) {
            int x1  = i-2;
            int x2 = i-3;
            int y1 = 0;
            int y2 = 0;
            if (x1 >= 1) y1 = dp2[x1];
            if (x2 >= 1) y2 = dp2[x2];
            dp2[i] = Math.max(y1, y2) + nums[i];
        }
        int m2 = 0;
        if (nums.length-1>0) m1 = Math.max(m1, dp2[nums.length-1]);
        if (nums.length-2>0) m1 = Math.max(m1, dp2[nums.length-2]);

        return Math.max(m1, m2);
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {2, 7, 9, 3, 1};
       int ans = slu.rob(a);
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


