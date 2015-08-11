import java.util.*;
import java.lang.*;


public class Solution {

    public List<String> wordBreak(String s, Set<String> wordDict) {
        if (s == null || s.length()==0) return new ArrayList<String>();
        int len = s.length();
        boolean[] check = new boolean[len+1];
        check[0] = true;
            
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        Iterator<String> it = wordDict.iterator();
        while (it.hasNext()) {
            int n = it.next().length();
            if (mini>n) mini=n;
            if (maxi<n) maxi=n;
        }


        for (int i=1; i<=len; i++) {
            for (int j=Math.max(0,i-maxi); j<=Math.max(0,i-mini); j++) {
                String tmp = s.substring(j, i);
                if (check[j] && wordDict.contains(tmp)) check[i] = true;
            }
        }
        if (!check[len]) return new ArrayList<String>();

        List<List<String>> words = new ArrayList<List<String>>();
        for (int i=0; i<=len; i++) words.add(new ArrayList<String>());
        words.get(0).add("");

        for (int i=1; i<=len; i++) {
            for (int j=Math.max(0,i-maxi); j<=Math.max(0,i-mini); j++) {
                String tmp = s.substring(j, i);
                if (check[j] && wordDict.contains(tmp)) {
                    for (String str: words.get(j)) {
                        if (str.equals("")) words.get(i).add(tmp);
                        else words.get(i).add(str+" "+tmp);
                    }
                }
            }
        }
        return words.get(len);
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       String ss = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
       Set<String> set = new HashSet<String>();
       set.add("a");
       set.add("aa");
       set.add("aaa");
       set.add("aaaa");
       set.add("aaaaa");
       set.add("aaaaaa");
       set.add("aaaaaaa");
       set.add("aaaaaaaa");
       set.add("aaaaaaaaa");
       set.add("aaaaaaaaaa");
      
       List<String> p = slu.wordBreak(ss, set);
       for (int i=0; i<p.size(); i++) { System.out.println(p.get(i)); }
   }
}


