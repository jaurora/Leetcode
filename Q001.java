import java.util.Hashtable;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] ans = new int[2];
        boolean find = false;
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        table.put(numbers[0], 0);
        int i = 1;
        while (!find && i < len) {
            Integer n = table.get(target - numbers[i]);
            if (n != null) {
                ans[0] = (int) n + 1;
                ans[1] = i + 1;
                find = true;
            }
            table.put(numbers[i], i);
            i++;
        }
        return ans;
    }
}
