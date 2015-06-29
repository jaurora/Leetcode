import java.util.*;
import java.lang.*;

public class Solution {
    public int firstMissingPositive(int[] nums) {

        int len = nums.length;

        for (int i = 0; i<len; i++) {
            
            while (nums[i] != i+1) {

                if (nums[i] <= 0 || nums[i] > len) break;
                if (nums[i] == nums[nums[i]-1]) break;

                int tmp = nums[i];
                nums[i] = nums[tmp-1];
                nums[tmp-1] = tmp;
            }
        }

        for (int i = 0; i<len; i++) if (nums[i] != i+1) return i+1;
        
        return len+1; 
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {3, 4, -1, 1};
       StdOut.println(slu.firstMissingPositive(a));
   }
}
