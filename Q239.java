import java.util.*;
import java.lang.*;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        Deque<Integer> dp = new ArrayDeque<Integer>();
        int[] ans = new int[nums.length-k+1];
        for (int i=0; i<nums.length; i++) {
            if (dp.peekLast() != null && dp.peekLast().intValue() < i-k+1) dp.pollLast();
            while (dp.peekFirst() != null && nums[dp.peekFirst().intValue()] < nums[i]) dp.pollFirst(); 
            while (dp.peekLast() != null && nums[dp.peekLast().intValue()] < nums[i]) dp.pollLast();       
            Integer x = dp.peekLast();
            dp.push(i);
            if (i >= k-1) {
                if (x == null) ans[i-k+1] = nums[i];
                else ans[i-k+1] = nums[x.intValue()];
            }
        }
        return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] ans = slu.maxSlidingWindow(new int[]{9,10,9,-7,-4,-8,2,-6}, 5);
       System.out.println(Arrays.toString(ans));
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


