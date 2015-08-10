import java.util.*;
import java.lang.*;


public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (len < 4) return ans;
        Arrays.sort(nums);
        for (int i=0; i<len-3; i++) {
            if (i>0 && nums[i] == nums[i-1]) continue;
            for (int j=i+1; j<len-2; j++) {
                if (j>i+1 && nums[j] == nums[j-1]) continue;                
                int tar = target-nums[i]-nums[j];
                int start = j+1;
                int end = len-1;
                while (start<end) {
                    if (start>j+1 && nums[start]==nums[start-1]) {
                        start++;
                        continue;
                    }
                    if (nums[start]+nums[end]>tar) end--;
                    else if (nums[start]+nums[end]<tar) start++;
                    else {
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[start]);
                        tmp.add(nums[end]);
                        ans.add(tmp);
                        start++;
                        end--;
                    }
                }
            }
        }
        return ans;
    }
   
   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[]{-1,0,-5,-2,-2,-4,0,1,-2};
       List<List<Integer>> p = slu.fourSum(a, -9);   
       for (int i=0; i<p.size(); i++) { System.out.println(p.get(i).toString()); }
   }
}


