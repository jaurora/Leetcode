import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

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
    public List<Interval> merge(List<Interval> intervals) {
        int num = intervals.size();
        if (num == 0 || num == 1) return intervals;
        List<Interval> ans = new ArrayList<Interval>();
        Collections.sort(intervals, new IntervalComparator());
        
        int start = 0;
        int end = 0;
        for (int i = 0; i < num; i++) {
            Interval intv = intervals.get(i);
            int ns = intv.start;
            int ne = intv.end;
            if (i == 0) { start = ns; end = ne; }

            if (ns <= end && ne > end) {
                end = ne;   
            } else if (ns > end && i != 0 ) {
                Interval tmp = new Interval(start, end);
                ans.add(tmp);
                start = ns;
                end = ne;
            } 
            if (i == num-1) {
                Interval tmp = new Interval(start, end);
                ans.add(tmp);
            }

        }
        return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       List<Interval> intervals = new ArrayList<Interval>();
       Interval i = new Interval(1, 5);
       //Interval j = new Interval(1, 5);
       intervals.add(i);
       //intervals.add(j);
       List<Interval> ans = slu.merge(intervals);
       for (int p = 0; p < ans.size(); p++) {
           StdOut.println(ans.get(p).start);
           StdOut.println(ans.get(p).end);
           StdOut.println("----");
       }
   }
}


class IntervalComparator implements Comparator<Interval> {
	public int compare(Interval i1, Interval i2) {
		return i1.start - i2.start;
	}
}
