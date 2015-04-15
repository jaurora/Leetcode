import java.util.Arrays;
public class Solution {
    public int jump(int[] A) {
        int len = A.length;
        int[] gd = new int[len];
        int reach = 0;
        int reachnext = 0;
        int step = 0;
        for (int i = 0; i < len; i++) gd[i] = -1;
        for (int i = 0; i < len; i++) {
            if (i == 0) { 
                gd[i] = 0; 
                reach = A[i]; reachnext = reach;
                step = 1; 
            } else if (i > reach) break;
            
            if (i > 0 && i <= reach) gd[i] = step;
            int jump = A[i]+i;
            if (jump >= len) jump = len-1;
            if (A[i]+i > reachnext) reachnext = A[i]+i;
            if (i == reach) { reach = reachnext; step = gd[i]+1; }
        }
        return gd[len-1];
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] A = {4,1,1,3,1,1,1};
       int ans = slu.jump(A);
       StdOut.println(ans);
   }
}

