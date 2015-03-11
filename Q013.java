public class Solution {
    public int romanToInt(String s) {
    
        int ans = 0;          
        char[] charArray = s.toCharArray();
        int len = charArray.length;

        int pre = 0;
        for (int i = 0; i < len; i++) {
            int tmp = 0;
            switch (charArray[i]) {
            case 'I': 
                tmp = 1;
                break;
                
            case 'V': 
                tmp = 5;
                break;
                
            case 'X': 
                tmp = 10;
                break;  
                
            case 'L': 
                tmp = 50;
                break;
                
            case 'C': 
                tmp = 100;
                break;
                
            case 'D': 
                tmp = 500;
                break;
                
            case 'M': 
                tmp = 1000;
                break;     
            default: 
                tmp = 0;    
                break;
            }

            if (tmp <= pre || i == 0) { 
                ans = ans + tmp; 
            } else {
                ans = ans - 2*pre + tmp;
            }
            pre = tmp;
        }
        return ans;
    }

    public static void main(String[] args) { // unit tests (not graded)
        Solution slu = new Solution();
        StdOut.println(slu.romanToInt("MCMXCVI"));
    }

}
