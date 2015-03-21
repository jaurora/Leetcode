public class Solution {
    public int search(int[] A, int target) {
        int len = A.length;
        int left = 0; 
        int right = len-1;
        while (left <= right) {
            int m = (left + right) / 2;
            if (A[m] == target) return m;
            else if (A[m] >= A[left]) {
                if (A[left] <= target && target < A[m]) right = m-1;
                else left = m+1;
            }
            else 
                if (A[m] < target && target <= A[right]) left = m+1;
                else right = m-1;
        }
        return -1;
    }



    public static void main(String[] args) { // unit tests (not graded)
        Solution s = new Solution();

        int[] A = {1, 2, 3};
        StdOut.println(s.search(A, 1));
    }
}
