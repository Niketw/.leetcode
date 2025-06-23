/*
 * @lc app=leetcode id=493 lang=java
 *
 * [493] Reverse Pairs
 */

// @lc code=start
class Solution {

    int count = 0;

    public void findReversePairs(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (right - left) / 2 + left;

        findReversePairs(nums, left, mid);
        findReversePairs(nums, mid + 1, right);

        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            count += j - (mid + 1);
        }

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] l = new int[n1];
        int[] r = new int[n2];

        for (int i = 0; i < n1; i++) {
            l[i] = nums[left + i];
        }

        for (int i = 0; i < n2; i++) {
            r[i] = nums[mid + 1 + i];
        }

        int i = 0;
        j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (l[i] < r[j]) {
                nums[k] = l[i];
                i++;
            } else {
                nums[k] = r[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            nums[k] = l[i];
            i++;
            k++;
        }

        while (j < n2) {
            nums[k] = r[j];
            j++;
            k++;
        }



    }

    public int reversePairs(int[] nums) {

        findReversePairs(nums, 0, nums.length - 1);
        return count;
    }
}
// @lc code=end
