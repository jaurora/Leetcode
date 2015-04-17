import java.util.*;

public class Solution {
    int[] arr;
    int tar;

    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> save = new ArrayList<List<Integer>>();
        tar = target;
        Arrays.sort(candidates);
        arr = candidates;
        combination(0, save);
        return ans;
    }

    private void combination(int start, List<List<Integer>> save) {
        if (save.size() == 0) {
            for (int i = start; i < arr.length; i++) {
                if (arr[i] <= tar) {
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(arr[i]);
                    if (arr[i] == tar) ans.add(tmp);
                    else {
                        save.add(tmp);
                        combination(i, save);
                    }
                }
            }
        } else {
            for (int p = 0; p < save.size(); p++) {
                List<Integer> tmp = save.remove(p);
                for (int i = start; i < arr.length; i++) {
                    if (sum(tmp)+arr[i] < tar) {
                        List<Integer> ntmp = new ArrayList<Integer>(tmp);
                        ntmp.add(arr[i]);
                        save.add(ntmp);
                        combination(i, save);
                    } else if (sum(tmp) + arr[i] == tar) {
                        List<Integer> ntmp = new ArrayList<Integer>(tmp);
                        ntmp.add(arr[i]);
                        ans.add(ntmp);
                    }
                }
            }
        }
    }


    private int sum(List<Integer> ls) {
        int sum = 0;
        for (int i = 0; i < ls.size(); i++) {
            sum += ls.get(i);
        }
        return sum;
    }


        
   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] A = {2, 7, 3, 6};
       List<List<Integer>> ans = slu.combinationSum(A, 7);
       for (int i = 0; i < ans.size(); i++) StdOut.println(ans.get(i));

   }
}
