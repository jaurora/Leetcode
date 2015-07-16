import java.util.*;
import java.lang.*;

/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */

public class Solution {
    public int maxPoints(Point[] points) {
        int npts = points.length;
        if (npts == 0 || npts == 1) return npts;
        HashMap<Float, Integer> map = new HashMap<Float, Integer>();

        int mp = 0;
        for (int i=0; i<npts; i++) {
            map.clear();
            int dup = 0;
            for (int j=0; j<npts; j++) {
                if (i == j) continue;
                if (points[i].x == points[j].x && points[i].y == points[j].y) { dup++; continue; }
                float s = ((float) points[i].y - points[j].y)/(points[i].x-points[j].x);
                if (!map.containsKey(s)) map.put(s, 1);
                else map.put(s, map.get(s)+1);
            }
            if (dup+1 > mp) mp = dup+1;
            Collection<Integer> col = map.values();
            Iterator<Integer> it = col.iterator();
            while (it.hasNext()) {
                Integer val = (Integer) it.next();
                if (val.intValue()+dup+1 > mp) mp = val.intValue()+dup+1;
            }
        }
        return mp;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       Point[] pts = new Point[3];
       pts[0] = new Point(1,1);
       pts[1] = new Point(1,1);
       pts[2] = new Point(1,1);
       System.out.println(slu.maxPoints(pts));
   }
}


