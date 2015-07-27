import java.util.*;
import java.lang.*;

public class Solution {
    public String multiply(String num1, String num2) {
        if (num1 == "0" || num2 == "0") return "0";
        int len1 = num1.length(), len2 = num2.length();
        String n1 = new StringBuilder(num1).reverse().toString();
        String n2 = new StringBuilder(num2).reverse().toString();        
        String s = "";
        int[] ans = new int[len1+len2];
        for (int i=0; i<len1+len2; i++) ans[i]=0;
            
        for (int i=0; i<len1; i++) {
            int add = 0;
            int p1 = n1.charAt(i)-'0';
            for (int j=0; j<len2; j++) {
                int p2 = n2.charAt(j)-'0';
                int mp = p1*p2+add;
                ans[i+j] += mp%10;
                add = mp/10;
                if (ans[i+j]>=10) { ans[i+j] -=10; add += 1; }
            }
            ans[i+len2] += add;
        }
      
        int flag = 0;
        for (int i=len1+len2-1; i>=0; i--) {
            if (flag == 0) {
                if (ans[i] == 0 && i>0) continue;
                else flag = 1;
            }
            s += String.valueOf(ans[i]).toString();
        }
        return s;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();

       System.out.println(slu.multiply("0", "0"));
   }
}


