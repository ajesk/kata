package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;

public class MergeSortedLinkedLists {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode mergedList = new ListNode();
    ListNode mergedPointer = mergedList;
    ListNode pointer1 = list1;
    ListNode pointer2 = list2;

    while (pointer1 != null || pointer2 != null) {
      if (pointer2 != null && (pointer1 == null || pointer2.val < pointer1.val)) {
        mergedPointer.next = new ListNode(pointer2.val);
        pointer2 = pointer2.next;
      } else {
        mergedPointer.next = new ListNode(pointer1.val);
        pointer1 = pointer1.next;
      }
        mergedPointer = mergedPointer.next;
    }


    return mergedList.next;
  }
}
