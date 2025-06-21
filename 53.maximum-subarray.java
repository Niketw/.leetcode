/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start

import static java.lang.Integer.max;

class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = max(sum + nums[i], nums[i]);
            maxSum = max(sum, maxSum);
        }

        return maxSum;
    }
}
// @lc code=end

