import java.util.Hashtable;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int len = 9;
        boolean valid = true;
        Hashtable<Character, Integer> ht
            = new Hashtable<Character, Integer>();   
     
        for (int i = 0; i < len; i++) {
            ht.clear();
            for (int j = 0; j < len; j++) {
                if (board[i][j] != '.') {
                    if (ht.isEmpty() || ht.get(board[i][j]) == null) {
                        ht.put(board[i][j], 1);
                    } else { valid = false; break; }
                }
            }
        }

        if (!valid) return valid;
        
        for (int i = 0; i < len; i++) {
            ht.clear();
            for (int j = 0; j < len; j++) {
                if (board[j][i] != '.') {
                    if (ht.isEmpty() || ht.get(board[j][i]) == null) {
                        ht.put(board[j][i], 1);
                    } else { valid = false; break; }
                }
            }
        }      

        if (!valid) return valid;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ht.clear();
                for (int ix = 0; ix < 3; ix++) {
                    for (int iy = 0; iy < 3; iy++) {
                        if (board[i*3+ix][j*3+iy] != '.') {
                            if (ht.isEmpty() || ht.get(board[i*3+ix][j*3+iy]) == null) {
                                ht.put(board[i*3+ix][j*3+iy], 1);
                            } else { valid = false; break; }         
                        }
                    }
                }

            }
        }
        return valid;
    }
    
    public static void main(String[] args) { // unit tests (not graded)
        Solution s = new Solution();
        char[][] board = new char[9][9];

        board[0] = "..5.....6".toCharArray();
        board[1] = "....14...".toCharArray();
        board[2] = ".........".toCharArray();
        board[3] = ".....92..".toCharArray();
        board[4] = "5....2...".toCharArray();
        board[5] = ".......3.".toCharArray();
        board[6] = "...54....".toCharArray();
        board[7] = "3.....42.".toCharArray();
        board[8] = "...27.6..".toCharArray();
       
        StdOut.println(s.isValidSudoku(board));
    }
}
