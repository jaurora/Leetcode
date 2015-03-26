public class Solution {
    public int searchInsert(int[] A, int target) {
	int len = A.length;
	int i = 0;
	while (i < len && A[i] < target) i++;
	return i;
    }
 
   public static void main(String[] args) {
  	Solution slu = new Solution();
	int[] A = {1, 3, 5, 6 };
   	System.out.println(slu.searchInsert(A, 0));
    }
}
