import java.util.*;

public class Solution {
    public int singleNumber(int[] A) {
        int len = A.length;
        int left = A[0];
        for (int i = 1; i < len; i++) {
            left = left ^ A[i]; 
        }
        return left;
    }
    
   public static void main(String[] args) {
       Solution slu = new Solution();
       int A[] = {1,2,3,4,1,3,2};
       StdOut.println(slu.singleNumber(A));
   }
}
