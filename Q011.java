import java.lang.*;

public class Solution {
    public int maxArea(int[] height) {
        int nPts = height.length;
        int maxarea = 0;
        int tmp = 0;
        
        int i = 0;
        int j = nPts-1;
        while (i < j) {
            tmp = (j-i) * Math.min(height[i], height[j]);
            if (tmp > maxarea) { maxarea = tmp; }
            if (height[i] < height[j]) {
                i++;
            } else { j--; }
        }
        return maxarea;
    }

    public static void main(String[] args) { // unit tests (not graded)
        // Solution slu = new Solution();
        //StdOut.println(slu.maxArea([1,2,3]));
    }

}
