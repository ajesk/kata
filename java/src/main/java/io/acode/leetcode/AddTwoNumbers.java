package io.acode.leetcode;

import io.acode.leetcode.datastructures.linkedlist.ListNode;

import java.util.Optional;

public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode currentNode1 = l1;
    ListNode currentNode2 = l2;
    ListNode head = new ListNode(0, null);
    ListNode nextNode = head;

    int overflow = 0;

    while (currentNode1 != null || currentNode2 != null) {
      int sum = Optional.ofNullable(currentNode1)
        .map(x -> x.val)
        .orElse(0) +
        Optional.ofNullable(currentNode2)
          .map(x -> x.val)
          .orElse(0) + overflow;
      if (sum > 9) {
        overflow = 1;
        sum -= 10;
      } else {
        overflow = 0;
      }
      nextNode.next = new ListNode(sum);
      nextNode = nextNode.next;
      currentNode1 = Optional.ofNullable(currentNode1).map(x -> x.next).orElse(null);
      currentNode2 = Optional.ofNullable(currentNode2).map(x -> x.next).orElse(null);
    }

    if (overflow == 1) {
      nextNode.next = new ListNode(overflow);
    }
    return head.next;
  }

  /**
   * Pulled another solution from leetcode
   *
   * Things I did right.
   *  - algorithm is the same
   *
   *  Things incorrectly
   *   - optional checking is less than ideal. Avoid using it in the future.
   *   - a few extra if statements were in there that weren't needed
   */
  public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode();
    ListNode head1 = l1;
    ListNode head2 = l2;
    ListNode curr = dummy;
    int carry = 0;

    while (head1 != null || head2 != null) {
      int x = (head1 != null) ? head1.val : 0;
      int y = (head2 != null) ? head2.val : 0;
      int sum = x + y + carry;
      carry = sum / 10;

      curr.next = new ListNode(sum % 10);
      curr = curr.next;
      if (head1 != null) head1 = head1.next;
      if (head2 != null) head2 = head2.next;

    }
    if (carry > 0) {
      curr.next = new ListNode(carry);
    }
    return dummy.next;

  }
}
