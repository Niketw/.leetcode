/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                mp.replace(nums[i], mp.get(nums[i]) + 1);
            } else {
                mp.put(nums[i], 1);
            }
        }

        for (int i : mp.keySet()) {
            if (mp.get(i) > nums.length / 2) {
                return i;
            }
        }

        return -1;
    }
}
// @lc code=end

