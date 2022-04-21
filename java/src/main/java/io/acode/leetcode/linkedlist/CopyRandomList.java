package io.acode.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {
  public Node copyRandomList(Node head) {
    if (head == null) return null;
    Node copy = new Node(-1);
    Node copyPointer = copy;
    Node pointer = head;
    Map<Node, Node> nodeMapping = new HashMap<>();

    while (pointer != null) {
      copyPointer.next = new Node(pointer.val);
      copyPointer = copyPointer.next;
      nodeMapping.put(pointer, copyPointer);
      pointer = pointer.next;
    }

    copyPointer = copy.next;
    pointer = head;

    while (pointer != null) {
      if (pointer.random != null) {
        copyPointer.random = nodeMapping.get(pointer.random);
      }
      copyPointer = copyPointer.next;
      pointer = pointer.next;
    }

    return copy.next;
  }


  static class Node {
    int val;
    Node next;
    Node random;

    public Node() {
    }

    public Node(int val) {
      this.val = val;
    }

    public Node(int val, Node next) {
      this(val);
      this.next = next;
    }

    @Override
    public String toString() {
      return
        val + "R" +
          (random != null ? String.valueOf(random.val) : "null") +
          "," + next;
    }
  }
}
