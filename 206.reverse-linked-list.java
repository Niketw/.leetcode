/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode ptr1 = head, ptr2 = head.next, ptr3 = head.next.next;

        if (ptr3 == null) {
            ptr1.next = null;
            ptr2.next = ptr1;
            return ptr2;
        }

        ptr1.next = null;

        do {
            ptr2.next = ptr1;
            ptr1 = ptr2;
            ptr2 = ptr3;
            ptr3 = ptr3.next;
        } while (ptr3 != null);

        ptr2.next = ptr1;

        return ptr2;
    }
}
// @lc code=end

