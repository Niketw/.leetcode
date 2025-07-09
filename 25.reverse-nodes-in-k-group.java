/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
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

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ListNode dummy = new ListNode(0);
        ListNode prevTail = dummy;
        ListNode current = head;

        while (current != null) {
            List<ListNode> group = new ArrayList<>();
            ListNode temp = current;
            for (int i = 0; i < k && temp != null; i++) {
                group.add(temp);
                temp = temp.next;
            }

            if (group.size() < k) {
                prevTail.next = current;
                break;
            }

            group.get(k - 1).next = null;
            ListNode reversedHead = reverseList(group.get(0));
            prevTail.next = reversedHead;
            prevTail = group.get(0);
            current = temp;
        }

        return dummy.next;
    }
}
// @lc code=end
