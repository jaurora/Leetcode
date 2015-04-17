import java.util.*;

public class Solution {
    public int titleToNumber(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        int num = 0;
        int pow = (int) Math.pow(26, len-1);
       for (int i = 0; i < len; i++) {
           StdOut.println(cs[i]-'A'+1);
           num += (cs[i]-'A'+1)*pow;
           pow = pow/26;
        }
       return num;
    }
    
   public static void main(String[] args) {
       Solution slu = new Solution();
       String s = "AB";
       StdOut.println(slu.titleToNumber(s));
   }
}
