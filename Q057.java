import java.util.ArrayList;
import java.util.List;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int num = intervals.size();
        if (num == 0) {
            intervals.add(newInterval);
            return intervals;
        }
        List<Interval> ans = new ArrayList<Interval>();
        boolean first = true;
        int start = newInterval.start;
        int end = newInterval.end;
        for (int i = 0; i < num; i++) {
            Interval intv = intervals.get(i);
            if (newInterval.start > intv.end) { 
                ans.add(intv);
                if (i == num-1) ans.add(newInterval);
            }
            else if (newInterval.end < intv.start) {  
                if (first) { 
                    ans.add(new Interval(start, end));
                    first = false; 
                }
                ans.add(intv);
            } else {
                if (start  > intv.start) start = intv.start;
                if (end < intv.end) end = intv.end;
                if (i == num-1) ans.add(new Interval(start, end));
            }
        }
        return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       List<Interval> intervals = new ArrayList<Interval>();
       Interval i = new Interval(1, 5);
       Interval j = new Interval(7, 10);
       Interval k = new Interval(11, 13);
       intervals.add(i);
       intervals.add(j);
       //intervals.add(k);
       Interval x = new Interval(2, 9);
       List<Interval> ans = slu.insert(intervals, x);
       for (int p = 0; p < ans.size(); p++) {
           StdOut.println(ans.get(p).start);
           StdOut.println(ans.get(p).end);
           StdOut.println("----");
       }
   }
}

