import java.util.Hashtable;

public class Solution {
    public int atoi(String str) {
        int len = str.length();
        int ans = 0;
        if (len > 0) { 
            char[] charArray = str.toCharArray();
            Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();

            for (int i = 0; i < 10; i++) {
                table.put((char) (i+48), i);
            }

            boolean end = false;
            boolean start = false;
            boolean pos = true;
            int i = 0;
            while (i < len && !start) {
                if (charArray[i] != ' ') { start = true; }
                i++;
            }

            if (start) {
                i--;
                if (charArray[i] == '+') {
                    pos = true; 
                    i++;
                } else {
                    if (charArray[i] == '-') {
                        pos = false;
                        i++;
                    } else {
                        if (table.get(charArray[i]) != null) {
                            pos = true;
                        }
                    }
                }
                int head = i;
                while (i < len && !end) {
                    if (table.get(charArray[i]) == null) {
                        end = true;
                    }
                    i++;
                }

                if (end) i--;
                int tail = i;
           
                if (tail - head > 0) {

                    String anstr = str.substring(head, tail);
                    if (!pos) { anstr = "-" + anstr; }
                    long tmp = 0;
                    if (tail - head < 14) {
                        tmp = Long.parseLong(anstr);
                        if (tmp > Integer.MAX_VALUE) { tmp = Integer.MAX_VALUE; }
                        if (tmp < Integer.MIN_VALUE) { tmp = Integer.MIN_VALUE; } 
                    } else { 
                        if (pos) { 
                            tmp = Integer.MAX_VALUE;
                        } else {
                            tmp = Integer.MIN_VALUE;
                        }
                    }
                    ans = (int) tmp;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        StdOut.println(slu.atoi("-9223372036854775809"));
    }

}
