import java.util.*;
import java.lang.*;


public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int num1 = 0, num2 = 0;
        int cnt1 = 0, cnt2 = 0;
        for (int i=0; i<nums.length; i++) {
            if (cnt1 == 0) {
                num1 = nums[i];
                cnt1++;
            } else if (nums[i] == num1) cnt1++;
            else if (cnt2 == 0) {
                num2 = nums[i];
                cnt2++;
            } else if (nums[i] == num2) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == num1) cnt1++;
            if (nums[i] == num2) cnt2++;
        }
        if (cnt1 > nums.length/3) ans.add(num1);
        if (num1 != num2 && cnt2 > nums.length/3) ans.add(num2);
        return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {0, 0, 0, 0};
       List<Integer> ans = slu. majorityElement(a);
       System.out.println(Arrays.toString(ans.toArray()));
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


