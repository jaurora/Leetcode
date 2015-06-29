import java.util.*;
import java.lang.*;

public class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        int head = 0; 
        int tail = len-1;
        while (tail > head) {
            int mid = (head + tail) / 2;
             if (nums[mid] > nums[head]) {
                if (nums[tail] > nums[mid]) return nums[head];
                head = mid+1;
            } else { 
                 if (mid == head) return Math.min(nums[head], nums[tail]);
                tail = mid; 
            }
        }
        return nums[head];
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {4, 5,6,7,8,9,10, 0, 1, 2};
       StdOut.println(slu.findMin(a));
   }
}
