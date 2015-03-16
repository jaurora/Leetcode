public class Solution {
    public int removeElement(int[] A, int elem) {
        int len = A.length;
        int newlen = len; 
        int count = 0;
        int excnt = 0;
        while (excnt <= len) {
            if (A[count] == elem) {
                A[count] = A[newlen-1];
                newlen--;
            } else {
                count++;
            }
            excnt++;
        }
        return count;
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        int[] A = {1,2,3,4,5,6,1,3};
        StdOut.println(slu.removeElement(A,1));
    }
}
