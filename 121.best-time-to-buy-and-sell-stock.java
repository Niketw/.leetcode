/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {

    public int max(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int least = prices[0];

        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] < least) {
                least = prices[i];
            } else {
                maxProfit = max(maxProfit, prices[i] - least);
            }
        }

        return maxProfit;
    }
}
// @lc code=end

