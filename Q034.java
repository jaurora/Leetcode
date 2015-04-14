import java.util.Arrays;
public class Solution {
    public int[] searchRange(int[] A, int target) {
        int len = A.length;
        int[] range = {-1, -1};
        int head = 0;
        int tail = len-1;
        int mid  = 0;
        if (target < A[0] || target > A[len-1]) return range;

        while (tail >= head) {
            if (target == A[mid]) break; 
            else if (target < A[mid]) tail = mid-1;
            else head = mid+1;
            mid = (head + tail)/2;
        }
        
        if (A[mid] == target) {
            int search = mid;
            while (search >=0 && A[search] == target) {range[0] = search; search--; }
            search = mid;
            while (search < len && A[search] == target) {range[1] = search; search++; }
        }
        return range;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] A = {0,0,2,3,4,4,4,5};
       int[] ans = slu.searchRange(A, 5);
       StdOut.println(Arrays.toString(ans));
   }
}

