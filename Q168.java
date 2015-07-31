import java.util.*;
import java.lang.*;


public class Solution {
    public String convertToTitle(int n) {
        int res = n;
        String ans = "";
        while (res > 0) {
            int p = res%26;
            if (p==0) p = 26;
            ans = (char) ('A'+p-1) + ans;
            res = (res-p)/26;
        }
        return ans;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       String ans = slu.convertToTitle(26);
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


