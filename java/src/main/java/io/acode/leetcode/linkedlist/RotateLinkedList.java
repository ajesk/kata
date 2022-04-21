package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;

public class RotateLinkedList {

  public ListNode rotateRight(ListNode head, int k) {
    if (head == null) return null;
    ListNode rotated = head;

    ListNode pointer = head;
    int count = 1;

    while (pointer.next != null) {
      pointer = pointer.next;
      count++;
    }

    for (int i = 0; i < (k % count); i++) {
      pointer = rotated;

      if (pointer.next == null) break;
      while (pointer.next.next != null) {
        pointer = pointer.next;
      }

      pointer.next.next = rotated;
      rotated = pointer.next;
      pointer.next = null;
    }

    return rotated;
  }
}
