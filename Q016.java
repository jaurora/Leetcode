import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] num, int target) {
        int len = num.length;
        Arrays.sort(num);
        boolean  first = true;
        int min = 0;
        int ans = 0;

        int pre = num[0];

        for (int i = 0; i < len-2; i++) {
            if (i != 0 && num[i] == pre) continue;

            int head = i+ 1;
            int tail = len-1;
            while (tail > head) {
                int sum = num[i] + num[head] + num[tail];
                int dist = sum - target;
                
                if (first) {
                    min = Math.abs(dist);
                    ans = sum;
                    first = false;
                }
 
                if (Math.abs(dist) < min) {
                    min = Math.abs(dist);
                    ans = sum;
                }
                if (dist > 0) tail--;
                else head++;
            }

            pre = num[i];
        }
        
        return ans;
   
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        int[] S = {-1, 2, 1, -4};
        StdOut.println(slu.threeSumClosest(S, 1));
    }

}
