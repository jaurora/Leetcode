import java.util.*;
import java.lang.*;

public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1 || k== 0) return;
        
        for (int icirc=0; icirc<gcd(n, k); icirc++) {
        
            int pos = (icirc + k) % n;
            int val = nums[icirc];
            while (pos != icirc) {
                int save = nums[pos];
                nums[pos] = val;
                val = save;
                pos = (pos+k) % n;
            }
            nums[pos] = val;
        }
        
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a%b);
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {1, 2};
       slu.rotate(a, 2);
       for (int i = 0; i<a.length; i++) StdOut.println(a[i]);
   }
}
