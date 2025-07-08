/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumList = null, newNode = null;
        ListNode ptr = null;
        int carry = 0, digit;

        while (l1 != null && l2 != null) {
            digit = carry + l1.val + l2.val;
            if (digit > 9) {
                newNode = new ListNode(digit % 10);
                carry = digit / 10;
            } else {
                newNode = new ListNode(digit);
                carry = 0;
            }

            if (ptr == null) {
                sumList = newNode;
                ptr = newNode;
            } else {
                ptr.next = newNode;
                ptr = ptr.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            digit = carry + l1.val;
            if (digit > 9) {
                newNode = new ListNode(digit % 10);
                carry = digit / 10;
            } else {
                newNode = new ListNode(digit);
                carry = 0;
            }

            ptr.next = newNode;
            ptr = ptr.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            digit = carry + l2.val;
            if (digit > 9) {
                newNode = new ListNode(digit % 10);
                carry = digit / 10;
            } else {
                newNode = new ListNode(digit);
                carry = 0;
            }

            ptr.next = newNode;
            ptr = ptr.next;
            l2 = l2.next;
        }

        if (carry != 0) {
            ptr.next = new ListNode(carry);
        }

        return sumList;
    }
}
// @lc code=end

