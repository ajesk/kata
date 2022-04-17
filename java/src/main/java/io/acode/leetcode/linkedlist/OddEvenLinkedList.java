package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;

public class OddEvenLinkedList {

  public ListNode oddEvenList(ListNode head) {
    if (head == null) return null;

    ListNode pointer = head;
    ListNode oddHead = new ListNode();
    ListNode oddPointer = oddHead;
    ListNode evenHead = new ListNode();
    ListNode evenPointer = evenHead;

    int index = 1;
    while (pointer != null) {
      if (index % 2 == 0) {
        evenPointer.next = new ListNode(pointer.val);
        evenPointer = evenPointer.next;
      } else {
        oddPointer.next = new ListNode(pointer.val);
        oddPointer = oddPointer.next;
      }
      pointer = pointer.next;
      index++;
    }
    oddPointer.next = evenHead.next;
    return oddHead.next;
  }
}
