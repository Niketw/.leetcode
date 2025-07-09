/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

import java.util.HashMap;

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> mp = new HashMap<>();

        Node ptr = head;
        Node ansptr = null;
        Node ans = null;

        while (ptr != null) {
            if (ansptr == null) {
                ansptr = new Node(ptr.val);
                ans = ansptr;
                mp.put(ptr, ansptr);
            } else {
                ansptr.next = new Node(ptr.val);
                ansptr = ansptr.next;
                mp.put(ptr, ansptr);
            }

            ptr = ptr.next;
        }

        ansptr = ans;

        while (ansptr != null) {
            if (head.random == null) {
                ansptr.random = null;
            } else {
                ansptr.random = mp.get(head.random);
            }

            head = head.next;
            ansptr = ansptr.next;
        }

        return ans;
    }
}
// @lc code=end
