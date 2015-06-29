import java.util.*;
import java.lang.*;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int im = 0;
        int in = 0;

        int[] nums0 = Arrays.copyOf(nums1, m);

        for (int i=0; i<m+n; i++) {
            if (im == m) { nums1[i] = nums2[in]; in++; }
            else if (in == n) { nums1[i] = nums0[im]; im++; }
            else if (nums0[im] >   nums2[in]) { nums1[i] = nums2[in]; in++; }
            else { nums1[i] = nums0[im]; im++; }
            //StdOut.println(nums1[i]);
        }        
    }
    
   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] a = new int[] {1, 4, 5, 0 , 0 ,0};
       int[] b = new int[] {0, 2, 3};
       slu.merge(a, 3, b, 3);
       StdOut.println(Arrays.toString(a));
   }
}
