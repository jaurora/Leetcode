import java.util.*;
import java.lang.*;

public class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        if (s.length() != t.length()) return false;
        for (int i=0; i<s.length(); i++) {
            Character tmp = Character.valueOf(s.charAt(i));
            if (!map.containsKey(tmp)) map.put(tmp, 1);
            else map.put(tmp, map.get(tmp)+1);
        }
        for (int i=0; i<t.length(); i++) {
            Character tmp = Character.valueOf(t.charAt(i));
            if (!map.containsKey(tmp)) return false;
            else {
                int cnt = map.get(tmp);
                if (cnt == 1) map.remove(tmp);
                else map.put(tmp, cnt-1);
            }
        }
        return map.isEmpty();
    }



   public static void main(String[] args) {
       Solution slu = new Solution();
       boolean ans = slu.isAnagram("a", "b");
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


