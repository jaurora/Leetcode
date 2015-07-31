import java.util.*;
import java.lang.*;


public class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) return 0;
        int ans = 0;
        Stack<String> st = new Stack<String>();         
        String operators = "+-*/";
        for (int i =0; i<tokens.length; i++) {
            if (!operators.contains(tokens[i])) st.push(tokens[i]);
            else {
                int a = Integer.valueOf(st.pop());
                int b = Integer.valueOf(st.pop());
                if (tokens[i].equals("+")) ans = b+a;
                else if (tokens[i].equals("-")) ans = b-a; 
                else if (tokens[i].equals("*")) ans = b*a;
                else ans = b/a;
                st.push(String.valueOf(ans));
            }
        }
        return Integer.valueOf(st.pop());
    }

   public static void main(String[] args) {
       Solution slu = new Solution();

       int ans = slu.evalRPN(new String[] {"4","-2","/","2","-3","-","-"});
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


