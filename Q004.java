public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int m = A.length;
        int n = B.length;
        int now = 0;
        int pre = 0;
        double ans = 0.0;
        
        int median = (m+n)/2;
        int ia = -1;
        int ib = -1;
        int cnt = 0;
        
        while (cnt <= median) {
            pre = now;
            if (ia < m-1 && ib < n-1) {
                if (A[ia+1] <= B[ib+1]) {
                    ia++;
                    now = A[ia];
                } else {
                    ib++;       
                    now = B[ib];
                }
                cnt++;
            } else {
                if (ia == m-1) {
                    ib++;
                    now = B[ib];
                    cnt++;
                } else {
                    ia++;
                    now = A[ia];
                    cnt++;
                }
            }
        }

       if ((m+n)%2 == 1) {
           ans = (double) now;
       } else {
           ans = (double) now + (double) pre;
           ans = ans/2.;
       }
     
      return ans;               
        
    }

    public static void main(String[] args) { // unit tests (not graded)
        int[] A = new int[]{1};
        int[] B = new int[]{};

        Solution slu = new Solution();
        StdOut.println(slu.findMedianSortedArrays(A, B));
    }


}
