import java.util.*;

public class Solution {
    public void sortColors(int[] A) {
        int len = A.length;
        int ptr = 0;
        int white = 0;
        int red = len-1;
        int i = 0;
        int tmp = 0;
        while (i <len) {
            switch (A[i]) {
            case 0:
                if (i > white) {
                    tmp = A[i];
                    A[i] = A[white];
                    A[white] = tmp;
                    white++;
                } else i++;
                break;
            case 2:
                if (i < red) {
                    tmp = A[i];
                    A[i] = A[red];
                    A[red] = tmp;
                    red--;
                } else i++;
                break;
            case 1:
                i++;
                break;
            }
        }
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] x = {2, 1, 1, 0, 1, 2, 2, 0, 1, 0};
       slu.sortColors(x);
   }
}
