import java.util.*;
import java.lang.*;

public class Solution {
    public String minWindow(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        String ans = "";
        int minlen = slen+1;
        if (slen < tlen) return ans;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0; i<t.length(); i++) {
            if (map.containsKey(t.charAt(i))) map.put(t.charAt(i), map.get(t.charAt(i))+1);
            else map.put(t.charAt(i), 1);
        }
   
        HashMap<Character, Integer> check = new HashMap<Character, Integer>();

        int count = 0;
        int left = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (check.containsKey(c)) {
                    check.put(c, check.get(c)+1);
                } else check.put(c, 1);
                if (check.get(c) <= map.get(c)) count++;
            }
      
            if (count == t.length()) {
                char sc = s.charAt(left);
                while (!map.containsKey(sc) || check.get(sc)>map.get(sc)) {
                    if (map.containsKey(sc)) 
                        check.put(sc, check.get(sc)-1);
                    left++;
                    sc = s.charAt(left);
                }
                if (minlen > i-left+1) {
                    minlen = i-left+1;
                    ans = s.substring(left, i+1);
                }
            }
        }
        return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       String a = "bdab";
       String b = "ab";
       System.out.println(slu.minWindow(a, b));
   }
}
