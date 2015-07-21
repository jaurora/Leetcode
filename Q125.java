import java.util.*;
import java.lang.*;


public class Solution {
    public boolean isPalindrome(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;

        if (len < 2) return true;
        int x1 = 0;
        int x2 = len-1;
        while (true) {
            while (cs[x1]<'0' || (cs[x1]>'9' && cs[x1]<'A') || (cs[x1]>'Z' && cs[x1]<'a') || cs[x1]>'z') {
                x1++; 
                if (x1 == x2) return true;
            }
            while (cs[x2]<'0' || (cs[x2]>'9' && cs[x2]<'A') || (cs[x2]>'Z' && cs[x2]<'a') || cs[x2]>'z') { 
                x2--;
                if (x1 == x2) return true;
            }
            if (x2 < x1) break;
            System.out.println(cs[x1]);
            System.out.println(cs[x2]);
            if (cs[x1] != cs[x2] && Math.abs(cs[x1]-cs[x2]) != 32) return false;
            x1++;
            x2--;
        }
        return true;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       String s = "`l;`` 1o1 ??;l`";
       boolean ans = slu.isPalindrome(s);
       System.out.println(ans);
   }
}


