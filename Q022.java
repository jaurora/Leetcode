import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<String> ans = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        int nl = n;
        int nr = n;
        addParent(nl, nr, "");
        return ans;
    }


    private void addParent(int nl, int nr, String str) {
        String lp = "(";
        String rp = ")";
        String addstr = str;

        if (nl <= nr) {

            if (nl > 0) {
                addstr = str + lp;
                addParent(nl-1, nr, addstr);
            }


            if (nr > 0) {
                addstr = str + rp;
                addParent(nl, nr-1, addstr);               
            }
            
            if (nr == 0) {
                ans.add(str);
            }
        }
    }



    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        StdOut.println(slu.generateParenthesis(3));
    }

}
