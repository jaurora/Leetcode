import java.util.Stack;
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        char[] charArray = s.toCharArray();
        int len = charArray.length;
        boolean valid = true;

        Character d1 = new Character('(');
        Character d2 = new Character('[');
        Character d3 = new Character('{');


        for (int i = 0; i < len; i++) {
            char tmp = charArray[i];
            if (tmp == '(' || tmp == '[' || tmp == '{') st.push(Character.valueOf(tmp));
            
            
            if (tmp == ')') {
                if (st.empty() || !d1.equals(st.pop()) ) {
                    valid = false;
                    break; }}


            if (tmp == ']') {
                if (st.empty() || !d2.equals(st.pop()) ) {
                    valid = false;
                    break; }}

            if (tmp == '}') {
                if (st.empty() || !d3.equals(st.pop()) ) {
                    valid = false;
                    break; }}
        }
        return valid;
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        StdOut.println(slu.isValid("]"));
    }
}
