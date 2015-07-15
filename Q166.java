import java.util.*;
import java.lang.*;

public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        if (denominator == 0) return "";
        String ans = "";
        if ((numerator<0) ^ (denominator<0)) ans += "-";
        long nume = Math.abs((long) numerator);
        long deno = Math.abs((long) denominator);
       
        long part = nume/deno;
        long res = (nume % deno)*10;
        ans += String.valueOf(part);
        if (res == 0) return ans;
        ans += ".";

        HashMap<Long, Integer> map = new HashMap<Long, Integer>();

        while (res != 0) {
            if (map.containsKey(res)) {
                int beg = map.get(res);
                ans = ans.substring(0,beg) + "(" + ans.substring(beg,ans.length()) + ")";
                return ans;
            }
            System.out.println(deno);
            part = res/deno;
            map.put(res,ans.length());
            ans += String.valueOf(part);
            res = (res % deno)*10;
        }
        return ans;
    }




   public static void main(String[] args) {
       Solution slu = new Solution();
       System.out.println(slu.fractionToDecimal(-1, -2147483648));
   }
}
