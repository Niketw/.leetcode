/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {

        double ans = 1;

        if (x == 1) {
            return 1;
        } else if (n == Integer.MIN_VALUE) {
            if (x == -1) {
                return 1;
            }
            return 0;
        } else if (n == Integer.MAX_VALUE) {
            return x;
        }

        int flip = n;

        n = Math.abs(n);

        for (int i = 0; i < n; i++) {
            ans *= x;
        }

        if (flip < 0) {
            ans = 1 / ans;
        }

        return ans;
    }
}
// @lc code=end

