/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;

        int count = 0;
        ListNode ptr = null, temp = null;
        ptr = head;

        while (ptr != null) {
            ptr = ptr.next;
            count++;
        }

        for (int i = 0; i < k % count; i++) {
            temp = ptr;
            ptr = head;
            while (ptr.next != null) {
                temp = ptr;
                ptr = ptr.next;
            }
            temp.next = null;
            ptr.next = head;
            head = ptr;
        }

        return head;
    }
}
// @lc code=end

