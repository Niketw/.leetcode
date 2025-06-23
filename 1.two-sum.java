/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        // difference (target - nums[i]) -> i map
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (!mp.containsKey(nums[i])) {
                mp.put(target - nums[i], i);
            } else {
                ans[0] = mp.get(nums[i]);
                ans[1] = i;

                return ans;
            }
        }

        return null;
    }
}
// @lc code=end

