import java.util.*;
import java.lang.*;


public class Solution {
    public String reverseWords(String s) {
        String ans = "";
        int start = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') continue;
            if (i == 0 || s.charAt(i-1) == ' ') start = i;
            if (i == s.length()-1 || s.charAt(i+1) == ' ') {
                if (!ans.equals("")) ans = " " + ans;
                ans = s.substring(start,i+1) + ans; 
            }
        }
        return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();

       String ans = slu.reverseWords("the sky is blue");
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


