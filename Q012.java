public class Solution {
    public String intToRoman(int num) {
    
        String ans = "";  
        String[] ns = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] nt = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int nts = nt.length;

        int remain = num;
        while (remain > 0) {
            int i = 0;
            while (i < nts && remain >= nt[i]) { i++; }
            i--;
            ans = ans + ns[i];
            remain = remain - nt[i];
        }

        return ans;

    }
    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        StdOut.println(slu.intToRoman(1000));
    }

}
