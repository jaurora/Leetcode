public class Solution {
   public int strStr(String haystack, String needle) {
       int ans = 0;
       int lenhay = haystack.length();
       int lenneed = needle.length();
       boolean find = false;
       
       for (int i = 0; i <= lenhay - lenneed; i++) {
           String str = haystack.substring(i, i+lenneed);
           if (str.equals(needle)) {
               ans = i;
               find = true;
               break;
           }
       }
       
       if (find) {
           return ans;  
       } else {
        return -1; }
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        String hay = "hellowordabchapylove";
        String need = "wor";
        StdOut.println(slu.strStr(hay, need));
    }
}
