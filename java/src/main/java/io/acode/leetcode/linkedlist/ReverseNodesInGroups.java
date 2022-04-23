package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 *
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not
 * a multiple of k then left-out nodes in the end should remain as it is.
 *
 * You may not alter the values in the nodes, only nodes itself may be changed.
 *
 * Only constant memory is allowed.
 *
 * For example,
 * Given this linked list: 1->2->3->4->5
 *
 * For k = 2, you should return: 2->1->4->3->5
 *
 * For k = 3, you should return: 3->2->1->4->5
 */
public class ReverseNodesInGroups {

    /**
     * This is not an optimal solution just a simple one. The biggest boon would be gained by doing away with the
     * group collection and writing directly to the head.
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode seed = new ListNode(0), currentNode = seed;
        List<Integer> group = new ArrayList<>();

        while (head != null) {
            // Take k values from head and shift
            for (int i = 0; i < k; i++) {
                if (head == null) break;

                group.add(head.val);
                head = head.next;
            }

            // Put k values into new object
            if (group.size() == k) {
                while (!group.isEmpty()) {
                    currentNode.next = new ListNode(group.remove(group.size() - 1));
                    currentNode = currentNode.next;
                }
            } else {
                while (!group.isEmpty()) {
                    currentNode.next = new ListNode(group.remove(0));
                    currentNode = currentNode.next;
                }
            }
        }

        return seed.next;
    }
}
