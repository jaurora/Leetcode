import java.util.*;
import java.lang.*;

public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<String>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int len = s.length();
        if (len < 10) return ans;
        for (int i=0; i+9<len; i++) {
            String subs = s.substring(i, i+10);
            int num = str2int(subs);
            System.out.println(len);
            if (!map.containsKey(num)) map.put(num,1);
            else {
                int cnt = map.get(num);
                System.out.println(cnt);
                if (cnt == 1) {
                    map.put(num, 2);
                    ans.add(subs);
                }
            }
        }
        return ans;
    }

    private int str2int(String str) {
        int num = 0;
        char[] ca = str.toCharArray();
        for (int i=0; i<str.length(); i++) {
            num = (num << 3) + (ca[i]&7);
        }
        return num;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       String a = "AAAAAAAAAAA";
       System.out.println(Arrays.toString(slu.findRepeatedDnaSequences(a).toArray()));
   }
}
