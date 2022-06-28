package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;

public class MiddleOfLinkedList {
  public ListNode middleNode(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    boolean moveSlow = false;
    while (fast != null) {
      fast = fast.next;
      if (moveSlow) slow = slow.next;
      moveSlow = !moveSlow;
    }
    return slow;
  }
}
