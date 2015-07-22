import java.util.*;
import java.lang.*;

public class Solution {
    public int compareVersion(String version1, String version2) {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        int pre = 0;
        for (int i=0; i<version1.length(); i++) {

            if (version1.charAt(i) == '.') {
                if (i == pre) l1.add(0);
                else l1.add(Integer.parseInt(version1.substring(pre, i)));
                pre = i+1;
            }
            if (i == version1.length()-1) {
                l1.add(Integer.parseInt(version1.substring(pre, i+1)));
            }
        }

        pre = 0;
        for (int i=0; i<version2.length(); i++) {
            if (version2.charAt(i) == '.') {
                if (i == pre) l2.add(0);
                else l2.add(Integer.parseInt(version2.substring(pre, i)));
                pre = i+1;
            }
            if (i == version2.length()-1) l2.add(Integer.parseInt(version2.substring(pre, i+1)));
        }    


        int cnt = 0;
        while (cnt < Math.max(l1.size(), l2.size())) {
            int v1 = 0, v2 = 0;
            if (cnt < l1.size()) v1 = l1.get(cnt);
            if (cnt < l2.size()) v2 = l2.get(cnt);            
            if (v1 > v2) return 1;
            if (v1 < v2) return -1;
            cnt++;
        }
        return 0;
    }



   public static void main(String[] args) {
       Solution slu = new Solution();
       int ans = slu.compareVersion("1.0", "1.2"); 
       System.out.println(ans);

   }
}


