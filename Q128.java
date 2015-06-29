import java.util.*;
import java.lang.*;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int max = 0;
        for (int i : nums) set.add(i);
        
        for (int i : nums) {
            int left = i-1;
            int right = i+1;
            int cnt = 1;
            while (set.contains(left)) {
                cnt++;
                set.remove(left);
                left--;
            }
            while (set.contains(right)) {
                cnt++;
                set.remove(right);
                right++;
            }
            if (cnt > max) max = cnt;
        }
        return max;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {4, 5, 2, 3, 9, 1};
       StdOut.println(slu.longestConsecutive(a));
   }
}
