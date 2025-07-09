/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

import java.util.*;

public class Solution {
    public ListNode detectCycle(ListNode head) {

        HashSet<ListNode> st = new HashSet<>();

        ListNode ptr = head;

        while (ptr != null) {

            if (st.contains(ptr)) {
                return ptr;
            }

            st.add(ptr);
            ptr = ptr.next;
        }

        return null;
    }
}
// @lc code=end

