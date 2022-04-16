package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.ListNode;

public class RemoveNthNodeFromEndOfList {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode pointer = head;

    if (pointer.next == null) return null;

    while (true) {
      ListNode subpointer = pointer;

      for (int i = 0; i < n + 1; i++) {
        if (subpointer == null) return head.next;
        subpointer = subpointer.next;
      }

      if (subpointer == null) {
        pointer.next = pointer.next.next;
        return head;
      }
      pointer = pointer.next;
    }
  }

  public ListNode removeNthFromEndAlt(ListNode head, int n) {
    ListNode start = new ListNode(0, head);
    ListNode first = start;
    ListNode second = start;

    for (int i = 0; i < n; i++) {
      first = first.next;
    }

    while (first.next != null) {
      first = first.next;
      second = second.next;
    }

    second.next = second.next.next;
    return start.next;
  }
}
