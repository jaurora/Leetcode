import java.util.*;
import java.lang.*;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 1 || len == 2) return len;

        int flag = 2;
        int next = 0;
        int head = Integer.MAX_VALUE;
        int cnt = 0;

        for (int i = 0; i < len; i++) {
            if (flag == 1 && nums[i] != head) {
                nums[next] = nums[i];
                head = nums[i];
                next++;
            } else if (flag == 1 && nums[i] == head) {
                nums[next] = nums[i];
                flag = 2;
                next++;
            } else if (flag == 2 && nums[i] != head) {
                head = nums[i];
                nums[next] = nums[i];
                next++;
                flag = 1;
            }
        }
        return next;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {1,1,1,1, 1, 2,2,3};
       StdOut.println(slu.removeDuplicates(a));
   }
}
