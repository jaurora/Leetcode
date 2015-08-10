import java.util.*;
import java.lang.*;


public class Solution {
    public int mySqrt(int x) {
        if (x<0) return -1;
        if (x == 0) return 0;
        long start = 1;
        long end = x/2+1;
        long mid = start;
        while (end>=start) {
            mid = (end + start) /2;
            long mlt = mid*mid;
            long next = (mid+1)*(mid+1);
            if (mlt <= (long) x && next > (long) x) return (int) mid;
            else if (mlt > (long) x) end = mid-1;
            else start = mid+1;
        }
        return 0;
    }
   
   public static void main(String[] args) {
       Solution slu = new Solution();
       int p = slu.mySqrt(2);   
       System.out.println(p);
       //for (int i=0; i<p.size(); i++) { System.out.println(p.get(i).toString()); }
   }
}


