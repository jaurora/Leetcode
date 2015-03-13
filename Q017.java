import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        char[] charArray = digits.toCharArray();
        int nChars = charArray.length;
        String[] str = null;
        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < nChars; i++) {
            switch(charArray[i]) {
            case('2'):
                char[] letters2 = {'a', 'b', 'c'};
                str = add(str, letters2);
                break;
            case('3'):
                char[] letters3 = {'d', 'e', 'f'};
                str = add(str, letters3);   
                break;             
            case('4'):
                char[] letters4 = {'g', 'h', 'i'};
                str = add(str, letters4);
                break;
            case('5'):
                char[] letters5 = {'j', 'k', 'l'};
                str = add(str, letters5);
                break;
            case('6'):
                char[] letters6 = {'m', 'n', 'o'};
                str = add(str, letters6);
                break;
            case('7'):
                char[] letters7 = {'p', 'q', 'r', 's'};
                str = add(str, letters7);
                break;
            case('8'):
                char[] letters8 = {'t', 'u', 'v'};
                str = add(str, letters8);
                break;
            case('9'):
                char[] letters9 = {'w', 'x', 'y', 'z'};
                str = add(str, letters9);
                break;
            }
        }

        if (str == null) {
            return ans;
        } else {
            int len = str.length;
            for (int i = 0; i < len; i++) 
                ans.add(str[i]);
            return ans;
        }
    }


    private String[] add(String[] str, char[] c){
        int clen = c.length;
        String[] newStr = null;

        if (str == null) {
            newStr = new String[clen];   
            for (int i = 0; i < clen; i++) 
                newStr[i] = String.valueOf(c[i]);
        } else {
            int len = str.length;
            newStr = new String[clen*len];
            for (int i = 0; i < clen; i++) {
                for (int j = 0; j < len; j++) {
                    newStr[i*len+j] = str[j] + String.valueOf(c[i]);
                }
            }
        }
     
        return  newStr;
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        String s = "";
        StdOut.println(slu.letterCombinations(s));
    }

}
