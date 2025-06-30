/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
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
class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr.next != null) {
            fastPtr = fastPtr.next;
            slowPtr = slowPtr.next;

            if (fastPtr.next != null) {
                fastPtr = fastPtr.next;
            }
        }

        return slowPtr;
    }
}
// @lc code=end

