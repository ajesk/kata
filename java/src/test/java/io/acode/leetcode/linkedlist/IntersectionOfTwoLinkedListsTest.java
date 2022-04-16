package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.ListNode;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class IntersectionOfTwoLinkedListsTest {
  IntersectionOfTwoLinkedLists target = new IntersectionOfTwoLinkedLists();

  @Test
  public void testBasicNoLink() {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    assertNull(target.getIntersectionNode(a, b));
  }

  @Test
  public void testBasicLink() {
    ListNode link = new ListNode(3);
    ListNode a = new ListNode(1, link);
    ListNode b = new ListNode(2, link);

    assertEquals(link, target.getIntersectionNode(a, b));
  }

  @Test
  public void testNoLinkUneven() {
    ListNode a = new ListNode(1, new ListNode(2));
    ListNode b = new ListNode(3);

    assertNull(target.getIntersectionNode(a, b));
  }

  @Test
  public void testEvenLink() {
    ListNode link = new ListNode(2, 3, 4, 5);
    ListNode a = new ListNode(1, new ListNode(2, link));
    ListNode b = new ListNode(3, new ListNode(4, link));

    assertEquals(link, target.getIntersectionNode(a, b));
  }

  @Test
  public void testUnevenLink() {
    ListNode link = new ListNode(5, 6, 7);
    ListNode a = new ListNode(1, link);
    ListNode b = new ListNode(2, new ListNode(3, link));

    assertEquals(link, target.getIntersectionNode(a, b));
  }

  @Test
  public void testExactSame() {
    ListNode link = new ListNode(1);
    assertEquals(link, target.getIntersectionNode(link, link));
  }

  @Test
  public void testConfusingLeet() {
    ListNode link = new ListNode(8,4,5);
    ListNode a = new ListNode(4, new ListNode(1, link));
    ListNode b = new ListNode(5, new ListNode(6, new ListNode(1, link)));

    assertEquals(link, target.getIntersectionNode(a, b));
  }
}
