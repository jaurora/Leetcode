import java.util.*;
import java.lang.*;


public class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> left = new ArrayList<Integer>();
        int factor = 1;
        for (int i=1; i<=n; i++) left.add(i);
        for (int i=2; i<n; i++) factor *= i;
        String ans = "";        
        int times = n-1;
        k--;
        while (times >= 0) {
            int p = k/factor;            
            ans += String.valueOf(left.get(p));
            System.out.println(k);
            left.remove(p);
            k = k%factor;
            if (times != 0) factor = factor/times;
            times--;
        }
        return ans;
    }



   public static void main(String[] args) {
       Solution slu = new Solution();
       String ans = slu.getPermutation(3, 2);
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


