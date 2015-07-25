import java.util.*;
import java.lang.*;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for (int i=0; i<32; i++) {
            ans = ans << 1;
            if ((n&1) == 1) ans = ans+1;
            n = n >> 1;
        }
        return ans;
    }



   public static void main(String[] args) {
       Solution slu = new Solution();
       int ans = slu.reverseBits(43261596); 
       System.out.println(ans);
   }
}


