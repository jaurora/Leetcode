import java.util.*;
import java.lang.*;

public class Solution {
    private int[] arr;
    private boolean find = false;
    private int x;
    public boolean search(int[] nums, int target) {
        int len = nums.length;
        arr = Arrays.copyOf(nums, len);
        x = target;
        binary(0, len-1);
        return find;
    }

    private void binary(int start, int end) {
        if (start > end) return;
        int mid = start + (end-start)/2;
        if (arr[mid] == x) {
            find = true;
            return;
        }
        if (arr[mid] > arr[start]) {
            if (x > arr[mid]) binary(mid+1, end);
            else {
                if (x >= arr[start]) binary(start, mid-1);
                else binary(mid+1, end);
            }
        } else if (arr[mid] < arr[start]) {
            if (x < arr[mid]) binary(start, mid-1);
            else {
                if (x >= arr[start]) binary(start, mid-1);
                else binary(mid+1, end);
            } 
        } else {
            binary(start, mid-1);
            binary(mid+1, end);
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {1,3,1, 1,1};
       boolean ans = slu.search(a, 3);
       StdOut.println(ans);
   }
}
