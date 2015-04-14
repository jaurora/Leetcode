public class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        char[] ca = s.toCharArray();
        int ans = 0;
        int backup = 0;
        for (int i = 0; i < len; i++) {
            if (ca[i] == ' ') { 
                if (ans != 0) backup = ans; 
                ans = 0; 
            }
            else ans++;
        }
        
        if (ans == 0) ans = backup;
        return ans;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       String s = "   ";
       StdOut.println(slu.lengthOfLastWord(s));
   }
}

