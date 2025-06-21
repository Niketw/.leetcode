/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

import java.util.*;

// @lc code=start
class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        if (numRows == 1) {
            return triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(1).add(1);
        triangle.get(1).add(1);

        if (numRows == 2) {
            return triangle;
        }

        for (int i = 2; i < numRows; i++) {
            triangle.add(new ArrayList<>());
            triangle.get(i).add(1);

            for (int j = 1; j < triangle.get(i - 1).size(); j++) {
                triangle.get(i).add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }

            triangle.get(i).add(1);
        }

        return triangle;
    }
}
// @lc code=end

