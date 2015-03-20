import java.util.Arrays;

public class Solution {

    public void nextPermutation(int[] num) {
 
        int len = num.length;
        int i = len-1;
        while (i > 0 && num[i] <= num[i-1]) {
            i--;
        }
        
        i--;
        
        StdOut.println(i);
        
        if (i < 0) { Arrays.sort(num); }
        else {
            int j = len-1;
            while (j > i) {
                if (num[j] > num[i]) break;
                j--;
            }

            int tmp = num[i];
            num[i] = num[j];
            num[j] = tmp;
            
            int[] subarr = Arrays.copyOfRange(num, i+1, len);
            Arrays.sort(subarr);
            
            for (int p = i+1; p < len; p++) num[p] = subarr[p-i-1];
        }   
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution sl = new Solution();

        int[] num = {5, 1, 1};
        sl.nextPermutation(num);
        for (int i = 0; i < num.length; i++) StdOut.println(num[i]);


    }
}
