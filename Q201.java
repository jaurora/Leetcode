import java.util.*;
import java.lang.*;


public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if (m==0) return 0;
        int ans = m;
        for (int j=m+1; j<=n; j++) {
            ans = (ans^j);
        }
        return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int ans = slu.rangeBitwiseAnd(5, 7);
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


