package io.acode.leetcode;

import io.acode.leetcode.datastructures.linkedlist.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {

  private AddTwoNumbers target = new AddTwoNumbers();

  @Test
  public void basicTest() {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
    ListNode l3 = new ListNode(3);

    assertEquals(new ListNode(3).toString(), target.addTwoNumbers2(l1, l2).toString());
    assertEquals(new ListNode(4).toString(), target.addTwoNumbers2(l1, l3).toString());
  }

  @Test
  public void test2ValuesInEachNode() {
    ListNode l1 = new ListNode(1, 1);
    ListNode l2 = new ListNode(2, 2);

    assertEquals(new ListNode(3, 3).toString(), target.addTwoNumbers2(l1, l2).toString());
  }

  @Test
  public void testDifferentSizedValues() {
    ListNode l1 = new ListNode(1, 1, 1);
    ListNode l2 = new ListNode(2, 2);

    assertEquals(new ListNode(3, 3, 1).toString(), target.addTwoNumbers2(l1, l2).toString());

    ListNode l3 = new ListNode(1, 1);
    ListNode l4 = new ListNode(2, 2, 2);

    assertEquals(new ListNode(3, 3, 2).toString(), target.addTwoNumbers2(l3, l4).toString());
  }

  @Test
  public void testOverflowingNumbers() {
    ListNode l1 = new ListNode(9, 1);
    ListNode l2 = new ListNode(2, 2);

    assertEquals(new ListNode(1, 4).toString(), target.addTwoNumbers2(l1, l2).toString());
  }

  @Test
  public void testLeetCodeTests() {
    assertEquals(
      new ListNode(7, 0, 8).toString(),
      target.addTwoNumbers2(
        new ListNode(2, 4, 3),
        new ListNode(5, 6, 4)
      ).toString());

    assertEquals(
      new ListNode(0).toString(),
      target.addTwoNumbers2(
        new ListNode(0),
        new ListNode(0)
      ).toString());

    assertEquals(
      new ListNode(8,9,9,9,0,0,0,1).toString(),
      target.addTwoNumbers2(
        new ListNode(9,9,9,9,9,9,9),
        new ListNode(9,9,9,9)
      ).toString());
  }
}