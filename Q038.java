import java.util.Arrays;
public class Solution {
    public String countAndSay(int n) {
        String s = "";
        if (n == 0) return s;
        for (int i = 1; i <= n; i++) {
            if (i == 1) { s = "1"; continue; }
            char[] cs = s.toCharArray();
            s = "";
            int len = cs.length;
            char c = cs[0];
            int j = 0;
            int cnt = 0;
            while (j < len) {
                if (c == cs[j]) {
                    cnt++;
                    if (j == len-1) s += String.valueOf(cnt) + c;
                } else { s += String.valueOf(cnt) + c; 
                    cnt = 1; c = cs[j]; 
                    if (j == len-1) s += String.valueOf(cnt) + c;
                }
                j++;
            }
        }
        return s;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       String ans = slu.countAndSay(5);
       StdOut.println(ans);
   }
}

