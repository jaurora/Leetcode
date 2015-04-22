import java.util.*;

public class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int i = 0;
        int j = len-1;
        int area = 0;
        int sum = 0;
        int level = 0;
        while (i <= j) {
            if (Math.min(height[i], height[j]) > level) {
                int nlevel = Math.min(height[i], height[j]);
                area += (nlevel - level) * (j-i+1);  
                level = nlevel;
            }
            if (height[i] <= height[j]) {
                sum += height[i]; i++;
            } else {sum += height[j]; j--;}
                 
        }
        return area-sum;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] x = {0,1,0,2,1,0,1,3,2,1,2,1};
       StdOut.println(slu.trap(x));
   }
}
