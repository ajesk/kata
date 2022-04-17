package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedListCycleTest {
  LinkedListCycle target = new LinkedListCycle();

  @Test
  public void testBasic() {
    assertFalse(target.hasCycle(new ListNode(1)));
    assertFalse(target.hasCycle(null));
  }

  @Test
  public void testSimpleCycle() {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2, node1);
    node1.next = node2;

    assertTrue(target.hasCycle(node2));
  }

  @Test
  public void longNoCycle() {
    ListNode test = new ListNode(1,
      new ListNode(2, new ListNode(3,
        new ListNode(4,
          new ListNode(5)))));

    assertFalse(target.hasCycle(test));
  }

  @Test
  public void longCycle() {
    ListNode cycleNode = new ListNode(4);

    ListNode test = new ListNode(1,
      new ListNode(2, new ListNode(3,
        new ListNode(4,
         cycleNode))));
    cycleNode.next = test.next.next;

    assertTrue(target.hasCycle(test));
  }
}
