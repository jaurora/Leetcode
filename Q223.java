import java.util.*;
import java.lang.*;

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area = (C-A)*(D-B) + (G-E)*(H-F);
        if (E>=C || A>=G || B>=H || F>=D) return area;
        
        int top = Math.min(D, H);
        int bottom = Math.max(B, F);
        int left = Math.max(A, E);
        int right = Math.min(C, G);
        
        return area-(top-bottom)*(right-left);
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       //boolean ans = slu.isPowerOfTwo(8); 
       //System.out.println(ans);

   }
}


