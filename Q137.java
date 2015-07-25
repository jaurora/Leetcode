import java.util.*;
import java.lang.*;

public class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int[] arr = new int[32];
        int len = nums.length;
        for (int j=0; j<len; j++) {
            for (int i=0; i<32; i++) {
                arr[i] += (nums[j]>>i)&1;
            }
        }
        
        for (int i=0; i<32; i++) {
            ans += (arr[i]%3) <<i;
        }
        return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] nums = new int[] {1,1,7,1 };
       int ans = slu.singleNumber(nums); 
       System.out.println(ans);
   }
}


