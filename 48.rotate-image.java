

/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */
// @lc code=start
class Solution {

    public void transpose(int[][] matrix) {

        int temp;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void flip(int[][] matrix) {

        int temp;

        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                temp = matrix1[j];
                matrix1[j] = matrix1[matrix[0].length - j - 1];
                matrix1[matrix[0].length - j - 1] = temp;
            }
        }
    }

    public void rotate(int[][] matrix) {
        transpose(matrix);
        flip(matrix);
    }
}
// @lc code=end

