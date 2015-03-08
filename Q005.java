import java.util.Arrays;

public class Solution {
    public String longestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int len = charArray.length;
        char[] tmpans = null;
        String ans ="";
        int maxlen = 0;
        int head = 0;
        int dlen = 0;

        for (int i = 0; i < len; i++) {

            // case 1
            int step = 0;
            while (i-step >= 0 && i+step < len
                   && charArray[i-step] == charArray[i+step]) {
                step++;
            }
            step--;
            int slen = 2*step+1;
            if (maxlen < slen) {
                maxlen = slen;
                tmpans = Arrays.copyOfRange(charArray, i-step, i+step+1);
            }

            // case 2
            step = 0;
            while (i-step >= 0 && i+1+step < len
                   && charArray[i-step] == charArray[i+1+step]) {
                step++;
            }
            step--;
            slen = 2*step+2;
            if (maxlen < slen) {
                maxlen = slen;
                tmpans = Arrays.copyOfRange(charArray, i-step, i+step+2);
            }
          
        }
        ans = String.valueOf(tmpans);     
        return ans;
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        StdOut.println(slu.longestPalindrome("bb"));
    }


}
