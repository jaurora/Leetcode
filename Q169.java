import java.util.*;

public class Solution {
    public int majorityElement(int[] num) {
        Arrays.sort(num);
        return num[num.length/2];
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
   }
}
