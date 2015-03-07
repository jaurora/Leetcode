public class Solution {
    public String convert(String s, int nRows) {
        char[] charArray = s.toCharArray();
        int nchar = charArray.length;
        int irow = 0;
        String[] ans = new String[nRows];
        String convert = "";
        for (int i = 0; i< nRows; i++) { ans[i] = ""; }
        int deno = 2 * nRows - 2;
        for (int i = 0; i < nchar; i++) {
            if (deno == 0) {
                irow = 0;
            } else {
                irow = i % deno;
            }
            if (irow < nRows) {
                ans[irow] = ans[irow] + charArray[i];
            } else {
                irow = deno - irow; 
                ans[irow] = ans[irow] + charArray[i];
            }            
        }        
        for (int i = 0; i< nRows; i++) { convert = convert + ans[i]; }
        return convert;
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        StdOut.println(slu.convert("helloworld", 3));
    }


}
