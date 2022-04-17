package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;


public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    if (head == null) return null;
    ListNode current = head.next;
    ListNode last = head;
    if (current == null) return head;

    last.next = null;
    while (true) {
      ListNode next = current.next; // store next node
      current.next = last; // set next node equal to last
      last = current; // move last pointer to next node
      if (next == null) return current; // if you reach the end of the list return
      current = next; // move current point to stored next node
    }
  }
}
