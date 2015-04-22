import java.util.*;

public class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        if (a.length() < b.length()) {
            String x = a;
            a = b;
            b = x;
        }

        int alen = a.length();
        int blen = b.length();
        
        int hold = 0;
        int tmp = 0;
        for (int i = 1; i <= alen; i++) {
            int ca = Integer.valueOf(a.substring(alen-i, alen-i+1));
            int sum = 0;
            if (i <= blen) {
                int cb = Integer.valueOf(b.substring(blen-i, blen-i+1));
                sum = ca + cb + hold;
            }
            else sum = ca + hold;
            tmp = sum % 2;
            hold = (sum - tmp)/2;
            ans = Integer.toString(tmp) + ans;
        }
        if (hold == 1) ans = Integer.toString(hold) + ans;
        return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       StdOut.println(slu.addBinary("11", "1"));
   }
}
