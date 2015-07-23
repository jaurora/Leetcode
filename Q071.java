import java.util.*;
import java.lang.*;

public class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<String>();
        int len = path.length();
        String dir = "";
        String up = "..";
        String here = ".";
        String empty = "";
        for (int i=0; i<len; i++) {
            char cur = path.charAt(i);
            if (cur == '/') {
                if (dir.equals(up)) {
                    if (!st.empty()) st.pop();
                } 
                else if (!dir.equals(here) && !dir.equals(empty)) st.push(dir);
                dir = "";
            } else {
                dir += cur;
                if (i == len-1) {
                    if (dir.equals(up)) {
                        if (!st.empty()) st.pop();
                    } else if (!dir.equals(here) && !dir.equals(empty)) st.push(dir);
                }   
            }
        }

        String sp = "";
        String sl = "/";

        if (st.empty()) return sl;

        while (!st.empty()) {
            String tmp = (String) st.pop();
            tmp = sl.concat(tmp);
            sp = tmp.concat(sp);
        }
        return sp;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       String ans = slu.simplifyPath("/.."); 
       System.out.println(ans);

   }
}


