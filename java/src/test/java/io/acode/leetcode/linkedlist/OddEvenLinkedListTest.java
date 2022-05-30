package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OddEvenLinkedListTest {
  OddEvenLinkedList target = new OddEvenLinkedList();

  @Test
  public void testBasic() {
    assertNull(target.oddEvenList(null));
    assertEquals("1,null", target.oddEvenList(new ListNode(1)).toString());
  }

  @Test
  public void test2Nodes() {
    assertEquals("2,1,null", target.oddEvenList(new ListNode(2, 1)).toString());
  }

  @Test
  public void threeNodes() {
    assertEquals("1,3,2,null", target.oddEvenList(new ListNode(1,2,3)).toString());

  }
}
