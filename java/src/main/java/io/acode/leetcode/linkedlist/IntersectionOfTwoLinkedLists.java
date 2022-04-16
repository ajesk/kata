package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.ListNode;

public class IntersectionOfTwoLinkedLists {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode pointerA = headA;
    ListNode pointerB = headB;
    int aCount = 0;
    int bCount = 0;

    while (pointerA != null) {
      aCount++;
      pointerA = pointerA.next;
    }

    while (pointerB != null) {
      bCount++;
      pointerB = pointerB.next;
    }
    pointerA = headA;
    pointerB = headB;

    if (aCount > bCount) {
      for (int i = 0; i < aCount - bCount; i++) {
        pointerA = pointerA.next;
      }
    } else if (bCount > aCount) {
      for (int i = 0; i < bCount - aCount; i++) {
        pointerB = pointerB.next;
      }
    }

    while (pointerA != null && pointerB != null) {
      if (pointerA==pointerB) return pointerA;
      pointerA = pointerA.next;
      pointerB = pointerB.next;
    }

    return null;
  }
}
