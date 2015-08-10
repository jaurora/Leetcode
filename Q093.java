import java.util.*;
import java.lang.*;


public class Solution {
    String str;
    List<String> ans = new ArrayList<String>();
    public List<String> restoreIpAddresses(String s) {
        str = s;
        add(new ArrayList<String>(), 0);
        return ans;
    }

    private void add(List<String> ls, int i) {

        if (ls.size()==4) {
            if (i==str.length()) {
                String ss = ls.get(0);
                for (int q=1; q<4; q++) ss += '.'+ls.get(q);
                ans.add(ss);
            }
        } else if (ls.size()<4) {
            int lim = 3;
            if (i+1<=str.length() && str.substring(i,i+1).equals("0")) lim=1;

            for (int p=1; p<=lim; p++) {
                if (i+p > str.length()) break;
                if (p==3 && Integer.parseInt(str.substring(i,i+p))>255) break;
            
                List<String> newls = new ArrayList<String>(ls);
                newls.add(str.substring(i,i+p));
                add(newls, i+p);
            }
        }
    }
    
   public static void main(String[] args) {
       Solution slu = new Solution();
       String ss = "010010";
       List<String> p = slu.restoreIpAddresses(ss);
       for (int i=0; i<p.size(); i++) { System.out.println(p.get(i)); }
   }
}


