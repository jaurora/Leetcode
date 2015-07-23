import java.util.*;
import java.lang.*;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n&(n-1)) == 0;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       boolean ans = slu.isPowerOfTwo(8); 
       System.out.println(ans);

   }
}


