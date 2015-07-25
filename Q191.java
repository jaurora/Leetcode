import java.util.*;
import java.lang.*;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        for (int i=0; i<32; i++) {
            ans += n&1;
            n = n>>>1;
        }
        return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int ans = slu.hammingWeight(11); 
       System.out.println(ans);
   }
}


