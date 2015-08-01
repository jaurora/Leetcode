import java.util.*;
import java.lang.*;


public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = 1;
        for (int i=1; i<len; i++) left[i] = left[i-1]*nums[i-1];
        right[len-1] =1;
        for (int i=len-2; i>=0; i--) right[i] = right[i+1]*nums[i+1];
        int[] product = new int[len];
        for (int i=0; i<len; i++) product[i] = right[i]*left[i];
        return product;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();

       int[] ans = slu.productExceptSelf(new int[]{1, 2});
       System.out.println(Arrays.toString(ans));
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


