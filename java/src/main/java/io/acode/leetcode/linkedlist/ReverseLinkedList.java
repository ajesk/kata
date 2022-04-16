package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.ListNode;

import java.util.Stack;

public class ReverseLinkedList {
  Stack<ListNode> nodes = new Stack<>();

  public ListNode reverseList(ListNode head) {
    if (head == null) return null;
    ListNode current = head;

    while (current != null) {
      nodes.push(current);
      current = current.next;
    }

    ListNode newHead = nodes.pop();
    ListNode chainer = newHead;
    while (!nodes.empty()) {
//        chainer.next =
    }
    return null;
  }
}
