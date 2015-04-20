import java.util.*;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = 0;
        boolean find = false;
        if (m > 0) n = matrix[0].length;
        int mid = 0;
        int head = 0;
        int end = m-1;
        while (end >= head) {
            mid = (head + end) /2;
            if (target == matrix[mid][0]) break;
            else if (target > matrix[mid][0]) head = mid+1;
            else end = mid-1;
        }
        
        int cmid = 0;
        if (matrix[mid][0] == target) return true;
        else {
            if (end >= 0) { 
                mid = end;
                head = 0; end = n-1;
                while (end >= head) {
                    cmid = (head + end) /2;
                    if (target == matrix[mid][cmid]) { find = true; break; }
                    else if (target > matrix[mid][cmid]) head = cmid+1;
                    else end = cmid-1;
                }
            }
        } 
        return find;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       int[][] x = {
           {1} };

       StdOut.println(slu.searchMatrix(x, 0));
   }
}
