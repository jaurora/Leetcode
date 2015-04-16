import java.util.*;

public class Solution {
    public List<Integer> plusOne(List<Integer> digits) {
        int len = digits.size();
        int add = 1;
        int i = len-1;
        while (add == 1 && i >= 0) {
            int get = digits.get(i);
            if ( get != 9) {
                digits.set(i, get+add);
                add = 0;
            } else digits.set(i, 0);
            i--;
        }
        if (add == 1) { digits.add(1); Collections.reverse(digits); }
        return digits;
    }
    
   public static void main(String[] args) {
       Solution slu = new Solution();
       List<Integer> t = new ArrayList<Integer>();
       t.add(9);
       t.add(9);
       t.add(9);
       StdOut.println(slu.plusOne(t));
   }
}

