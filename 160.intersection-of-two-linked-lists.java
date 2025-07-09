/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> st = new HashSet<>();

        while (headA != null) {
            st.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (st.contains(headB)) {
                return headB;
            }
            
            headB = headB.next;
        }

        return null;
    }
}
// @lc code=end
