/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode ans = null;
        ListNode head = null;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                if (ans == null) {
                    ans = new ListNode(list1.val);
                    head = ans;
                } else {
                    ans.next = new ListNode(list1.val);
                    ans = ans.next;
                }

                list1 = list1.next;

            } else {
                if (ans == null) {
                    ans = new ListNode(list2.val);
                    head = ans;
                } else {
                    ans.next = new ListNode(list2.val);
                    ans = ans.next;
                }

                list2 = list2.next;
            }
        }

        while (list1 != null) {
            if (ans == null) {
                ans = new ListNode(list1.val);
                head = ans;
            } else {
                ans.next = new ListNode(list1.val);
                ans = ans.next;
            }
            list1 = list1.next;
        }

        while (list2 != null) {
            if (ans == null) {
                ans = new ListNode(list2.val);
                head = ans;
            } else {
                ans.next = new ListNode(list2.val);
                ans = ans.next;
            }
            list2 = list2.next;
        }

        return head;
    }
}

// @lc code=end

