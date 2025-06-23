
/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start

import java.util.HashSet;

class Solution {

    HashSet<Integer> st = new HashSet<>();

    public int checkNext(int prev) {
        if (st.contains(prev + 1)) {
            return 1 + checkNext(prev + 1);
        }
        return 1;
    }

    public int longestConsecutive(int[] nums) {
        for (int num : nums) {
            st.add(num);
        }

        int longest = 0;
        for (int i : st) {
            if (!st.contains(i - 1)) {
                int count = checkNext(i);
                longest = Math.max(count, longest);
            }
        }

        return longest;
    }
}
// @lc code=end
