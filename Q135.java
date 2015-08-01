import java.util.*;
import java.lang.*;


public class Solution {
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] cnt = new int[len];
        cnt[0] = 1;
        for (int i=1; i<len; i++) {
            if (ratings[i] > ratings[i-1]) cnt[i] = cnt[i-1]+1;
            else cnt[i] = 1;
        }
        for (int i=len-2; i>=0; i--) {
            if (ratings[i] > ratings[i+1] && cnt[i] <= cnt[i+1]) cnt[i] = cnt[i+1]+1;
        }
        int ans = 0;
        for (int i=0; i<len; i++) ans += cnt[i];
        return ans;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();

       int ans = slu.candy(new int[]{1, 2});
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


