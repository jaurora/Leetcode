import java.util.*;
import java.lang.*;

public class Solution {
   
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();
        int len = nums.length;
        if (len==0) return ans;
        int head = nums[0];
        int pre = head;
        for (int i=1; i<len; i++) {
            int cur = nums[i];
            if (cur == pre+1) {
                pre = cur;
            } else {
                if (pre == head) ans.add(String.valueOf(head));
                else {
                    String str = String.valueOf(head)+"->"+String.valueOf(pre);
                    ans.add(str);
                }
                head = cur;
                pre = cur;
            }

        }
        
        if (pre == head) ans.add(String.valueOf(head));
        else {
            String str = String.valueOf(head)+"->"+String.valueOf(pre);
            ans.add(str);
        }
        return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {1, 3};
       slu.summaryRanges(a);
   }
}
