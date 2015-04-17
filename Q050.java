import java.util.*;

public class Solution {
    public double pow(double x, int n) {
        if (n == 0) return 1;
        double one = 1.0;
        if (x == one) return one;
        if (x == -one) {
            if (n % 2 == 0) return one; 
            else return -one;
        }

        if (n > 0) return mul(x, n);
        else {
            return 1./mul(x, -n);
        }
    }

    private double mul(double x, int p) {
        if (p == 1) return x;
        double ans = 0.0;
        if (p % 2 == 0)  {
            double tmp = mul(x,p/2);
            ans = tmp * tmp;
        } else {
            double tmp = mul(x,(p-1)/2);
            ans = tmp*tmp*x;
        }
        return ans;       
    }

        
   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] A = {10,1,2,7,6,1,5};
       StdOut.println(slu.pow(-1, -2147483648));
   }
}
