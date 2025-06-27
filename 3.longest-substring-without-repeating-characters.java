/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int j = 0;
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (mp.containsKey(ch) && mp.get(ch) >= j) {
                j = mp.get(ch) + 1;
            }

            mp.put(ch, i);
            longest = Math.max(longest, i - j + 1);
        }

        return longest;
    }
}

// @lc code=end
