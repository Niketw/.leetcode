/*
 * @lc app=leetcode id=2965 lang=java
 *
 * [2965] Find Missing and Repeated Values
 */

// @lc code=start

import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        HashSet<Integer> st = new HashSet<>();

        int[] ans = new int[2];
        int n = grid.length;

        for (int[] i : grid) {
            for (int j : i) {
                if (st.contains(j)) {
                    ans[0] = j;
                } else {
                    st.add(j);
                }
            }
        }

        for (int i = 0; i < n * n; i++) {
            if (!st.contains(i + 1)) {
                ans[1] = i + 1;
                break;
            }
        }

        return ans;
    }
}
// @lc code=end

