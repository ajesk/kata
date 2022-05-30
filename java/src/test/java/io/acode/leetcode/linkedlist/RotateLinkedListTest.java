package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RotateLinkedListTest {
  RotateLinkedList target = new RotateLinkedList();

  @Test
  public void testBasic() {
    assertNull(target.rotateRight(null, 0));
    assertEquals("1,null", target.rotateRight(new ListNode(1), 1).toString());
  }

  @Test
  public void testTwoNodes() {
    assertEquals("2,1,null", target.rotateRight(new ListNode(1, 2), 1).toString());
  }

  @Test
  public void testThreeNodes() {
    assertEquals("3,1,2,null", target.rotateRight(new ListNode(1,2,3), 1).toString());
  }

  @Test
  public void testRoundabout() {
    assertEquals("2,0,1,null", target.rotateRight(new ListNode(0,1,2), 4).toString());
  }

  @Test
  public void testLeetExample() {
    assertEquals("4,5,1,2,3,null", target.rotateRight(new ListNode(1,2,3,4,5), 2).toString());
  }
}
