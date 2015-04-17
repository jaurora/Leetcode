import java.util.*;

public class Solution {
    public int trailingZeroes(int n) {
        if (n == 0) return 0;
        int num = 0;
        long d = 5;
        while (n >= d) {
            num += n/d;
            d *= 5;
            StdOut.println(d);
        }
        return num;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       StdOut.println(slu.trailingZeroes(2147483647));
   }
}
