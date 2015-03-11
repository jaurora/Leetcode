import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        int size = num.length;

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        int i = 0;
        int pre = 0;
        while (i < size-2) {
            if (i == 0) {
                pre = num[i]; 
            } else {
                if (num[i] == pre && pre != 0) { i++; continue; }
            }

            int head = i+1;
            int tail = size-1;
            while(tail > head) {
                
                if (num[tail] < 0) { break; }
                if (num[i] > 0) { break; }
                
                int sum = num[i] + num[head] + num[tail];
                
                if (sum > 0) {
                    tail--;
                } else {
                    if (sum < 0) {
                        head++;
                    } else {
                        List<Integer> innerList = new ArrayList<Integer>(3);
                        innerList.add(num[i]);
                        innerList.add(num[head]);
                        innerList.add(num[tail]);

                        if (!list.contains(innerList)) {
                            list.add(innerList);
                        }
                        head++;
                    }    
                }
            }
            pre = num[i];
            i++;
        }
        return list;        
    }
    

 
    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        int[] a = {-1,0,1,2,-1,-4};
        StdOut.println(slu.threeSum(a));
    }

}
