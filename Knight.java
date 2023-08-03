"Given an 8*8 empty chessboard in which a knight is placed at a position (X, Y). Your task is to find the number of positions knight can jump into in a single move.

Note:- Rows and Columns are numbered through 1 to N."

Example 1:

Input: x = 4, y = 5 
Output: 8
Explanation: 

code-------------------------------------------------------------------------------------------------------------------------------------------------------

  class Solution {
    static int[] row = {2, 2, -2, -2, 1, 1, -1, -1};
    static int[] col = {1, -1, 1, -1, 2, -2, 2, -2};
    public int countReachable(int x, int y) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int x1 = x + row[i];
            int y1 = y + col[i];
            if (x1 >= 1 && x1 <= 8 && y1 >= 1 && y1 <= 8) {
                count++;
            }
        }
        return count;
    }
}
