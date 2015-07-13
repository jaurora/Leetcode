import java.util.*;
import java.lang.*;
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        if (sc.length != tc.length) return false;
        HashMap<Character, Character> map = new HashMap<Character,Character>();
        int len = sc.length;
        for (int i=0; i<len; i++) {
            if (!map.containsKey(sc[i])) {
                if (map.containsValue(new Character(tc[i]))) return false;
                else map.put(sc[i], tc[i]); 
            } else {
                Character tmp = map.get(sc[i]);
                if (!tmp.equals(new Character(tc[i]))) return false;         
            }
        }
        return true;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       String a = "aa";
       String b = "ab";
       System.out.println(slu.isIsomorphic(a, b));
   }
}
