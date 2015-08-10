import java.util.*;
import java.lang.*;


public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
        int sign = 1;
        if (dividend < 0) sign = -sign;
        if (divisor < 0) sign = -sign;
        
        long dd = Math.abs((long) dividend);
        long ds = Math.abs((long) divisor);
        long dsave = ds;
        long c = 1;

        while(dd > ds) {
            ds = ds<<1;
            c = c<<1;
        }
        
        long res = 0;
        while (dd >= dsave) {
            while (dd >= ds) {
                dd -= ds;
                res += c;
            }
            ds = ds>>1;
            c = c>>1;
        }
        
        if (sign < 0) res = -res;
        if (res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) res;
    }
   
   public static void main(String[] args) {
       Solution slu = new Solution();
       int p = slu.divide(0,1);   
       //System.out.println(p);
       //for (int i=0; i<p.size(); i++) { System.out.println(p.get(i).toString()); }
   }
}


