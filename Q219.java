import java.util.*;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Hashtable<Integer, Integer> numbers 
            = new Hashtable<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer n = numbers.get(nums[i]);
            if (n == null) {
                numbers.put(nums[i], i);
            } else if (i-n <= k) {
                return true; 
            } else { numbers.put(nums[i], i); }
        }
        return false;       
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {1, 0, 1, 1};
       StdOut.println(slu.containsNearbyDuplicate(a, 1));
   }
}
