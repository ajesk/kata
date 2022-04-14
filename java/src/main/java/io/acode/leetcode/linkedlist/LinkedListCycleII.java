package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.ListNode;

public class LinkedListCycleII {
  public ListNode detectCycle(ListNode head) {
    if (head == null) return null;

    ListNode superSlowCursor = head;
    ListNode slowCursor = head;
    ListNode fastCursor = head;
    try {
      while (true) {
        slowCursor = slowCursor.next;
        fastCursor = fastCursor.next.next;
        if (superSlowCursor.equals(slowCursor)) return superSlowCursor;
        if (fastCursor.equals(slowCursor)) superSlowCursor = superSlowCursor.next;
      }
    } catch (NullPointerException npe) {
      return null;
    }
  }

  public ListNode detectCycle2(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    ListNode res = head;
    while(fast != null && fast.next != null){
      fast = fast.next.next;
      slow = slow.next;
      //slow and fast meet
      if(slow == fast){
        //here res  = head
        while(slow != res){
          slow = slow.next;
          res = res.next;
        }

        if(slow == res){
          return res;
        }
      }
    }
    return null;
  }
}
