package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;

public class MyLinkedList {
  ListNode head = null;
  ListNode tail = null;
  int count = 0;

  public MyLinkedList() {

  }

  public int get(int index) {
    try {
      return getNode(index).val;
    } catch (NullPointerException npe) {
      return -1;
    }
  }

  public ListNode getNode(int index) {
    ListNode cursor = head;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return cursor;
  }

  public void addAtHead(int val) {
    ListNode newNode = new ListNode(val, head);
    head = newNode;
    if (tail == null) {
      tail = newNode;
    }
    count++;
  }

  public void addAtTail(int val) {
    ListNode newNode = new ListNode(val);

    if (tail != null) {
      tail.next = newNode;
    }
    tail = newNode;

    if (head == null) {
      head = tail;
    }
    count++;
  }

  public void addAtIndex(int index, int val) {
    if (index == 0) {
      addAtHead(val);
      return;
    }

    if (index == count) {
      addAtTail(val);
      return;
    }

    try {
      ListNode last = getNode(index - 1);
      last.next = new ListNode(val, last.next);
      count++;
    } catch (
      NullPointerException npe) {
    }
  }

  public void deleteHead() {
    head = head.next;
  }

  public void deleteAtIndex(int index) {
    try {
      if (index == 0) {
        deleteHead();
        return;
      }

      ListNode last = getNode(index - 1);
      last.next = last.next.next;
      if (index == count - 1) {
        tail = last;
      }
      count--;
    } catch (NullPointerException npe) {
    }
  }
}
