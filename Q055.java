public class Solution {
    public boolean canJump(int[] A) {
        int len = A.length;
        int[] gd = new int[len];
        int step = 0;
        int i = 0;
        while (i <= step && step < len-1) {
            int tmp = i + A[i];
            if (tmp > step) step = tmp;
            i++;
        }
        if (step > len-1) return false;
        else return true;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] A = {2, 3, 1, 1, 4};
       StdOut.println(slu.canJump(A));
   }
}

