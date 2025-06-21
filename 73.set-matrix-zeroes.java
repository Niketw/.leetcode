/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
import java.util.*;

class Solution {

    public void setRowZero(int[][] matrix, int row) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }

    public void setColZero(int[][] matrix, int col) {
        for (int[] matrix1 : matrix) {
            matrix1[col] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {
        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        for (int i : zeroRows)
        {
            setRowZero(matrix, i);
        }

        for (int j : zeroCols)
        {
            setColZero(matrix, j);
        }
    }
}
// @lc code=end

