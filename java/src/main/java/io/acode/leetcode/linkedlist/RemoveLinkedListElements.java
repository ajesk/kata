package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;

public class RemoveLinkedListElements {
  public ListNode removeElements(ListNode head, int val) {
    if (head == null) return null;
    if (head.val != val) {
      head.next = removeElements(head.next, val);
      return head;
    }
    return removeElements(head.next, val);
  }
}
