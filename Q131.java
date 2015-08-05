import java.util.*;
import java.lang.*;

public class Solution {
    private String str;
    private List<List<String>> ans = new ArrayList<List<String>>();
    public List<List<String>> partition(String s) {
        str = s;
        for (int i=0; i<s.length(); i++)
            add(new ArrayList<String>(), 0, i);
        return ans;
    }

    private void add(List<String> list, int start, int end) {
        String tmp = str.substring(start, end+1);
        if (check(tmp)) {
            List<String> nl = new ArrayList<String>(list);
            nl.add(tmp);
            if (end == str.length()-1) ans.add(nl);
            else for (int j=end+1; j<str.length(); j++) add(nl, end+1, j);
        }
    }

    private boolean check(String str) {
        int i = 0; 
        int j = str.length()-1;
        while (j>=i && str.charAt(i) == str.charAt(j)) {
            i++; j--;
        }
        if (j<i) return true;
        else return false;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       String s = "aab";
       List<List<String>> ans = slu.partition(s);
       //System.out.println(ans);
       for (int i=0; i<ans.size(); i++) { System.out.println(Arrays.toString(ans.get(i).toArray())); }
   }
}


