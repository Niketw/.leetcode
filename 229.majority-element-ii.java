/*
 * @lc app=leetcode id=229 lang=java
 *
 * [229] Majority Element II
 */

// @lc code=start

import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i : nums) {
            if (mp.containsKey(i)) {
                mp.replace(i, mp.get(i) + 1);
            } else {
                mp.put(i, 1);
            }
        }

        for (int key : mp.keySet()) {
            if (mp.get(key) > nums.length / 3) {
                ans.add(key);
            }
        }

        return ans;
    }
}
// @lc code=end

