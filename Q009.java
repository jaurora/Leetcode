import java.util.Hashtable;

public class Solution {
    public boolean isPalindrome(int x) {
        boolean isP = true;
        String str = Integer.toString(x);
        char[] charArray = str.toCharArray();
        int len = charArray.length;
        for (int i = 0; i< len/2; i++) {
            if (charArray[i] != charArray[len-1-i]) {
                isP = false;
                break;
            }
        }
        return isP;
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        StdOut.println(slu.isPalindrome(122121));
    }

}
