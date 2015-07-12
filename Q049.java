import java.util.*;
import java.lang.*;

public class Solution {
    public List<String> anagrams(String[] strs) {
        List<String> ans = new ArrayList<String>();  
        if(strs == null || strs.length == 0)  
        return ans;  
        int len = strs.length;
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (int i=0; i<len; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)) {
                List<String> list = new ArrayList<String>();
                list.add(strs[i]);
                map.put(sorted, list);
            } else map.get(sorted).add(strs[i]);
        }
        for (List<String> value: map.values()) {
            if (value.size()>1) ans.addAll(value);
        }
        return ans;
    }       

   public static void main(String[] args) {
       Solution slu = new Solution();
       String[] a = new String[] {"abc", "bca", "aab", "baa", "cba", "xyc"};
       List<String> ans = slu.anagrams(a);
       StdOut.println(Arrays.toString(ans.toArray()));
       
   }
}
