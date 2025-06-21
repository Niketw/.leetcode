/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom) {
            int midVert = (bottom + top) / 2;

            if (matrix[midVert][0] > target) {
                bottom = midVert - 1;
            } else if (matrix[midVert][0] < target) {
                top = midVert + 1;
            } else {
                return true;
            }
        }

        int rowToSearch = (top + bottom) / 2;

        while (left <= right) {
            int midHor = (left + right) / 2;

            if (matrix[rowToSearch][midHor] == target) {
                return true;
            } else if (matrix[rowToSearch][midHor] < target) {
                left = midHor + 1;
            } else {
                right = midHor - 1;
            }
        }

        return false;
    }
}

// @lc code=end

