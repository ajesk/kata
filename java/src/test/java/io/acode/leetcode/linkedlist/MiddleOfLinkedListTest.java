package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleOfLinkedListTest {
  MiddleOfLinkedList target = new MiddleOfLinkedList();

  @Test
  void testBasic() {
    ListNode single = new ListNode(1);
    assertEquals(single, target.middleNode(single));
  }

  @Test
  void test2Nodes() {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2, node1);

    assertEquals(node1, target.middleNode(node2));
  }

  @Test
  void test3Nodes() {
    assertEquals(2, target.middleNode(new ListNode(1,2,3)).val);
  }

  @Test
  void testLeet() {
    assertEquals(3, target.middleNode(new ListNode(1,2,3,4,5)).val);
    assertEquals(4, target.middleNode(new ListNode(1,2,3,4,5,6)).val);
  }
}
