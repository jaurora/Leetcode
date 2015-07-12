import java.util.*;
import java.lang.*;
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public boolean isHappy(int n) {
        List<Integer> check = new ArrayList<Integer>();
        if (n==1) return true;
        int num = n;
        boolean first = true;
        while (num != 1) {
            if (check.contains(num)) return false;
            String str = Integer.valueOf(num).toString();
            int len = str.length();
            check.add(num);
            num = 0;
            for (int i=0; i<len; i++) num += Math.pow(Integer.parseInt(str.substring(i,i+1)),2);
        }
        return true;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       int a = 22;
       System.out.println(slu.isHappy(a));
   }
}
