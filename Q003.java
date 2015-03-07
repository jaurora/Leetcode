import java.util.Hashtable;

public class Solution {
    public int lengthOfLongestSubstring(String s) {


        char[] charArray = s.toCharArray();
        int len = charArray.length;
        
         Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
         
         int maxlen = 0;
         int savlen = 0;
         
         for (int i = 0; i < len; i++) {
          
             if (ht.get(charArray[i]) == null) {
                 ht.put(charArray[i], i);
                 if (i == len-1) {
                    savlen = ht.size();
                 }
             } else {
                 if (maxlen < ht.size()) {
                       maxlen = ht.size();               
                 }
                 
                 int rmvfrom = ht.get(charArray[i]);
                 int rmvlens = ht.size() - (i - rmvfrom -1);
                 int cnt = 0;
                 while (cnt < rmvlens) {
                     ht.remove(charArray[rmvfrom]);
                     rmvfrom--;
                     cnt++;
                 }
                    ht.put(charArray[i], i);
             }
         }
         
         if (maxlen < savlen) maxlen = savlen;
         return maxlen;
   

    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        StdOut.println(slu.lengthOfLongestSubstring("pwwkew"));
    }

}
