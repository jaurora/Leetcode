import java.util.*;
import java.lang.*;


public class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;
        int mini = nums[0];
        int maxi = nums[0];
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > maxi) maxi = nums[i];
            if (nums[i] < mini) mini = nums[i];
        }

        int len =  (maxi-mini)/(nums.length-1)+1;
        int nBs = (maxi-mini)/len+1;
        int[][] bucket = new int[nBs][3];
        for (int i=0; i<nBs; i++) for (int j=0; j<3; j++) { bucket[i][j] = 0;}
 
        for (int i=0; i<nums.length; i++) {
            int ip = (nums[i]-mini)/len;
            if (bucket[ip][0] == 1) {
                if (nums[i] < bucket[ip][1]) bucket[ip][1] = nums[i];
                if (nums[i] > bucket[ip][2]) bucket[ip][2] = nums[i]; 
            } else {
                bucket[ip][0] = 1;
                bucket[ip][1] = nums[i];
                bucket[ip][2] = nums[i];
            }      
        }
        
        int ans = bucket[0][2] - bucket[0][1];
        int pre = bucket[0][2];
        for (int ib=1; ib<nBs; ib++) {

            if (bucket[ib][0] == 0) continue;
            int gap = bucket[ib][2] - bucket[ib][1];
            if (ans < gap) ans = gap;
            gap = bucket[ib][1] - pre;
            if (ans < gap) ans = gap;
            pre = bucket[ib][2];
        }
        return ans;     
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int ans = slu.maximumGap(new int[]{100, 3, 2, 1});
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


