"You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.

Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to print the modified matrix."

Example 1:

Input: mat = [[0,0]] 
Output: [[0,0]]
Explanation: 

code-------------------------------------------------------------------------------------------------------------------------------
  class Solution {
    public int[][] fillMatrixRows(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    for (int k = 0; k < n; k++) {
                        mat[i][k] = 1;
                    }
                    break;
                }
            }
        }
        return mat;
    }
}
