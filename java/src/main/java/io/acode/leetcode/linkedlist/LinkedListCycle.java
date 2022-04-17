package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;

public class LinkedListCycle {
  public boolean hasCycle(ListNode head) {
    if (head == null) return false;

    ListNode slowCursor = head;
    ListNode fastCursor = head;
    try {
      while (true) {
        slowCursor = slowCursor.next;
        fastCursor = fastCursor.next.next;
        if (fastCursor.equals(slowCursor)) return true;
      }
    } catch (NullPointerException npe) {
      return false;
    }
  }
}
