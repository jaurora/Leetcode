import java.util.*;
import java.lang.*;

public class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;

        int start = 0;
        int end = len-1;

        while (start < end) {
            int mid = start + (end-start)/2;
            if ( (mid == 0 || nums[mid] > nums[mid-1]) &&
                 (mid == len-1 || nums[mid] > nums[mid+1]) ) return mid;
            
            if (mid > 0 && nums[mid] < nums[mid-1]) end = mid-1;
            else start = mid+1;
        }

        return start;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {0, 1, 9, 2, 7, 10};
       StdOut.println(slu.findPeakElement(a));
   }
}
