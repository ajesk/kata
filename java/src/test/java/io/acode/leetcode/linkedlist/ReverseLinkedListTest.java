package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReverseLinkedListTest {
  ReverseLinkedList target = new ReverseLinkedList();

  @Test
  public void testBasic() {
    assertNull(target.reverseList(null));
    assertEquals(new ListNode(1).toString(), target.reverseList(new ListNode(1)).toString());
  }

  @Test
  public void test2NodeList() {
    assertEquals(new ListNode(1, 2).toString(), target.reverseList(new ListNode(2, 1)).toString());
  }

  @Test
  public void test3NodeList() {
    assertEquals(new ListNode(1, 2, 3).toString(), target.reverseList(new ListNode(3, 2, 1)).toString());
  }
}
