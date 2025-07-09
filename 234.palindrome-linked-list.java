/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.*;

class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ArrayList<Integer> arr = new ArrayList<>();

        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }

        int n = arr.size();

        for (int i = 0; i < n / 2; i++) {

            if (arr.get(i) != arr.get(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end

