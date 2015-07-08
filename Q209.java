import java.util.*;
import java.lang.*;

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        if (len < 1) return 0;
  
        int start=0, end=0, ans=len+1;
        int sum = 0;

        while (end < len) {
            while (sum<s && end<len) {
                sum += nums[end];
                end++;
            }
            while (sum>=s && start<end) {
                ans = Math.min(ans, end-start);
                sum -= nums[start];
                start++;
            }
        }
        
        if (ans == len+1) return 0;
        else return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {1,1};
       int ans = slu.minSubArrayLen(2, a);
       StdOut.println(ans);
   }
}
