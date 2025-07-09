/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start

import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {

        TreeSet<Integer> st = new TreeSet<>();
        int k;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!st.contains(nums[i])) {
                st.add(nums[i]);
            }
        }

        k = st.size();

        for (int i : st) {
            nums[j++] = i;
        }

        return k;
    }
}
// @lc code=end

