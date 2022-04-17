package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemoveNthNodeFromEndTest {
  RemoveNthNodeFromEndOfList target = new RemoveNthNodeFromEndOfList();

  @Test
  public void testBasic() {
    ListNode head = new ListNode(1);

    assertNull(target.removeNthFromEndAlt(head, 1));
  }

  @Test
  public void testRemoveLastNode() {
    ListNode head = new ListNode(1,2,3,4);
    assertEquals(new ListNode(1,2,3).toString(), target.removeNthFromEndAlt(head, 1).toString());
  }

  @Test
  public void testRemoveSecondLastNode() {
    ListNode head = new ListNode(1,2,3,4);
    assertEquals(new ListNode(1,2,4).toString(), target.removeNthFromEndAlt(head, 2).toString());
  }

  @Test
  public void testRemoveThirdLastNode() {
    ListNode head = new ListNode(1,2,3,4);
    assertEquals(new ListNode(1,3,4).toString(), target.removeNthFromEndAlt(head, 3).toString());
  }

  @Test
  public void removeFirstElement() {
    ListNode head = new ListNode(1,2,3,4);
    assertEquals(new ListNode(2,3,4).toString(), target.removeNthFromEndAlt(head, 4).toString());
  }
}
