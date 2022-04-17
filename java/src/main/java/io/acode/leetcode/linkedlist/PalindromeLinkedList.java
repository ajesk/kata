package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;

public class PalindromeLinkedList {
  public boolean isPalindrome(ListNode head) {
    ListNode pointer = head;
    ListNode reversePointer = null;

    if (head.next == null) return true;

    while (pointer != null) {
      reversePointer = new ListNode(pointer.val, reversePointer);
      pointer = pointer.next;
    }

    pointer = head;
    while (pointer != null) {
      if (pointer.val != reversePointer.val) return false;
      pointer = pointer.next;
      reversePointer = reversePointer.next;
    }

    return true;
  }
}
