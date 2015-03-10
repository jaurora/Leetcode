public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        int AnsLen = 0;
        char[] AnsPrefix = null;
         
        for (int j = 0; j < size; j++) {
            String s = strs[j];
            char[] charArray = s.toCharArray();
            int len = s.length();
            if (j == 0) { 
                AnsLen = len;
                AnsPrefix = charArray;
            }
            
            int tmplen = Math.min(AnsLen, len);
            AnsLen = tmplen;
            
            int p = 0;
            boolean end = false;
            while (p < tmplen && !end) {

                if (p == tmplen-1) {
                    AnsLen = p+1;
                    end = true;
                }

                if (AnsPrefix[p] != charArray[p]) { 
                    AnsLen = p;
                    end = true; }                
                p++;
            }
        }
       
        if (size > 0 && AnsLen > 0) {
            return strs[0].substring(0,AnsLen);
        } else { return ""; }

    }
    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        String[] strs = {"a", "ab"};
        StdOut.println(slu.longestCommonPrefix(strs));
    }

}
