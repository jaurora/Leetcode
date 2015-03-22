import java.util.*;
public class Solution {

    public List<List<Integer>> permute(int[] num) {
        return enumerate(num);
    }

    private List<List<Integer>> enumerate(int[] arr) {
         List<List<Integer>> list = new ArrayList<List<Integer>>();
         int len = arr.length;
         for (int i = 0; i < len; i++) {

             if (len > 1) {
                 int[] subarr = new int[len-1];
                 for (int j = 0; j < len; j++) {
                     if (j < i) subarr[j] = arr[j];
                     if (j > i)  subarr[j -1] = arr[j];
                 }
                 List<List<Integer>> sublist = enumerate(subarr);
                 
                 int size = sublist.size();
                 for (int p = 0; p < size; p++) {
                     List<Integer>  ll = sublist.get(p);
                     ll.add(arr[i]);
                     list.add(ll);
                 }
             } else {  
                 List<Integer> sublist = new ArrayList<Integer>();
                 sublist.add(arr[0]);
                 list.add(sublist);
             }
         }
             return list;
    }
        
    public static void main(String[] args) { // unit tests (not graded)
        Solution s = new Solution();

        int[] A = {1, 2, 3, 4};
        List<List<Integer>> list = s.permute(A);
        Iterator it = list.iterator();
        while(it.hasNext()) StdOut.println(it.next());
    }
}
