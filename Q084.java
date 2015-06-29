import java.util.*;
import java.lang.*;

public class Solution {
    public int largestRectangleArea(int[] height) {
        int len = height.length;
        Stack<Integer> st = new Stack<Integer>();
        st.push(-1);
        int maxi = 0;
        int top = -1;

        for (int i = 0; i <= len; i++) {
            top = st.peek();
            while ( i == len || (top >= 0 && height[i] < height[top])) {
                int bar = st.pop();
                if (st.isEmpty()) break;
                int ln = st.peek();
                int rn = i;
                int area = (rn-ln-1) * height[bar];
                if (area > maxi) maxi = area;
                top = st.peek();
            }

            if (i<len) st.push(i);
        }
        return maxi;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {1};
       StdOut.println(slu.largestRectangleArea(a));
   }
}
