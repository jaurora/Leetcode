import java.util.*;
import java.lang.*;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int netgas = 0, curgas = 0;
        for (int i=0; i<gas.length; i++) {
            netgas += gas[i] - cost[i];
            curgas += gas[i] - cost[i];
            if (curgas < 0) {
                curgas = 0;
                start = i+1;
            }
        }
        if (netgas < 0) return -1;
        return start;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[]{2, 5};
       int[] b = new int[]{3, 3};       
       int ans = slu.canCompleteCircuit(a, b);
       System.out.println(ans);
       //while (ans != null) { System.out.println(ans.val); ans = ans.next; }
   }
}


