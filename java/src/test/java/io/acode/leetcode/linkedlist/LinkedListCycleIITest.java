package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LinkedListCycleIITest {
  LinkedListCycleII target = new LinkedListCycleII();

  @Test
  public void testBasic() {
    assertNull(target.detectCycle2(new ListNode(1)));
    assertNull(target.detectCycle2(null));
  }

  @Test
  public void testMultipleNodesNoCycle() {
    ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
    assertNull(target.detectCycle2(node));
  }

  @Test
  public void testSingleCycle() {
    ListNode cycleNode = new ListNode(2);
    ListNode testNode = new ListNode(1, cycleNode);
    cycleNode.next = new ListNode(3,
      new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, cycleNode)))));

    assertEquals(cycleNode.val, target.detectCycle2(testNode).val);
  }

}
