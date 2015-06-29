import java.util.*;
import java.lang.*;

public class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        return findMin(nums, 0, len-1);
    }                                              
  
    private int findMin(int[] num, int start, int end) {
        if (start == end) return num[start];
        if (start == end-1) return Math.min(num[start], num[end]);
        if (num[start] < num[end]) return num[start];

        int mid = start + (end-start)/2;
        if (num[mid] > num[start]) return findMin(num, mid+1, end);
        else if (num[mid] == num[start]) return Math.min(findMin(num, mid+1, end), findMin(num, start, mid));
        else return findMin(num, start, mid);
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {10, 1, 10, 10, 10};
       StdOut.println(slu.findMin(a));
   }
}
