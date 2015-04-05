import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.TreeSet;

public class Solution {
    public List<String> wordBreak(String s, Set<String> dict) {
        int len  = s. length();
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        List<Integer> check = new ArrayList<Integer>();
        List<String> ans = new ArrayList<String>();

        check.add(-1);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < check.size(); j++) {
                Integer p = check.get(j);

                if (dict.contains(s.substring(p+1,i+1))) {

                    if (p.intValue() == -1) {
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(i); check.add(i); ll.add(tmp);
                        if (i == len-1) ans.add(s);

                    } else {
                        
                        List<Integer> tmp = new ArrayList<Integer>();
                        for (Integer x: ll.get(j-1)) tmp.add(x);

                        tmp.add(i); check.add(i); ll.add(tmp);

                        if (i == len-1) {
                            String news = "";
                            int head = 0;
                            for (Integer q: tmp) {
                                if (head != 0) news = news + " ";
                                news = news + s.substring(head, q.intValue()+1);
                                head = q.intValue()+1;
                            }
                            ans.add(news);
                        }
                    }
                }
            }     
        }
        return ans;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       //String s = "catsanddog";
       String s = "aaaaaaa";
       Set<String> st = new TreeSet<String>();
       st.add("aaa");
       st.add("aaaa");       
       //st.add("cat");
       //st.add("cats");
       //st.add("and");
       //st.add("dog");
       //st.add("sand");
       for (String x: slu.wordBreak(s,st)) {
           System.out.println(x);
       }
   }
}
