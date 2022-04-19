package io.acode.leetcode.linkedlist;

import java.util.Arrays;

public class FlattenMultiLevelLinkedList {
  public Node flatten(Node head) {
    if (head == null) return null;

    Node pointer = head;
    while (pointer != null) {
      if (pointer.child != null) {
        Node childList = flatten(pointer.child);
        Node nextPlaceholder = pointer.next;
        pointer.next = childList;
        childList.prev = pointer;
        pointer.child = null;
        while (pointer.next != null) {
          pointer = pointer.next;
        }
        pointer.next = nextPlaceholder;
        if (pointer.next != null) pointer.next.prev = pointer;
      }
      pointer = pointer.next;
    }

    return head;
  }

  /**
   * custom for this test
   */
  static class Node {
    public int val = 0;
    public Node next;
    public Node prev;
    public Node child;

    public Node(int... nodeVals) {
      if (nodeVals.length > 0) val = nodeVals[0];
      if (nodeVals.length > 1) next = new Node(Arrays.copyOfRange(nodeVals, 1, nodeVals.length));
    }

    public Node(int val, Node next) {
      this.val = val;
      this.next = next;
    }

    public Node(int val, Node child, Node next) {
      this.val = val;
      this.next = next;
      this.child = child;
    }

    @Override
    public String toString() {
      return val + "," + next;
    }
  }
}
