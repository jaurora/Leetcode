import java.util.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers 
            = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!numbers.contains(nums[i])) {
                numbers.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;       
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {1, 2, 3,1};
       StdOut.println(slu.containsDuplicate(a));
   }
}
