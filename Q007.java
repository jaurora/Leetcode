import java.util.Arrays;

public class Solution {
    public int reverse(int x) {

        String s = "";
        long num = (long) x;
        if (x < 0) { num = -num; }
        if (x == 0) { return 0; }

        long left = num % 10;

        while (left >= 0 && num > 0) {
            s = s + Long.toString(left);
            num = (num - left) / 10;
            left = num % 10;
        }

        if (x < 0) { s = "-" + s; }
        
        long tmp = Long.parseLong(s);
        if (tmp > Integer.MAX_VALUE || tmp < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) tmp;
        }
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        StdOut.println(slu.reverse(-2147483648));
    }

}
