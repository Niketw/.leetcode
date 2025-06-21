/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {

    public void insertionSort(int array[]) {
        int key;
        int j;

        for (int i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;

        }
    }

    public void sortColors(int[] nums) {
        insertionSort(nums);
    }
}
// @lc code=end

