import java.util.*;

public class Solution {
    public List<Integer> findSubstring(String S, String[] L) {
        int sublen = L[0].length();
        int len = S.length();
        int subnum = L.length;
        
        ArrayList<Integer> ans = new ArrayList<Integer>();        
        Hashtable<String, Integer> table = new Hashtable<String, Integer>();
        Hashtable<String, Integer> ntable = null;

        for (int i = 0; i < subnum; i++) {

            if (table.get(L[i]) == null) {
                table.put(L[i], Integer.valueOf(1));
            } else {
                int tmp = table.get(L[i]).intValue();
                table.put(L[i], Integer.valueOf(tmp+1));
            }
        }

        for (int i = 0; i <= len-sublen*subnum; i++) {
            int j = 1;
            boolean valid = true;
            ntable = (Hashtable<String, Integer>) table.clone();
            
            while (j <= subnum && valid) {
                String str = S.substring(i+sublen*(j-1),i+sublen*j);

                if (ntable.get(str) != null) {
                    int cnt = ntable.get(str).intValue();
                    if (cnt == 1) {
                        ntable.remove(str);
                    } else {
                        ntable.put(str, Integer.valueOf(cnt-1));
                    }
                } else { valid = false; }
                j++;
            }
            if (valid && ntable.isEmpty()) ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution sl = new Solution();
        String s = "a";
        String[] l = {"a"};
        StdOut.println(sl.findSubstring(s, l));
    }
}
