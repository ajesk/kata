package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;
import io.acode.util.TestUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeLinkedListsTest extends TestUtils {
  private ListNode node1;
  private ListNode node2;
  private ListNode node3;

  private MergeLinkedLists mll = new MergeLinkedLists();

  @Before
  public void setUp() {
    node1 = new ListNode(1, 4, 7, 9);
    node2 = new ListNode(3, 5, 8, 12);
    node3 = new ListNode(2, 2, 2);
  }

  @Test
  public void getLowest() {
    assertEquals(1, mll.getLowest(new ListNode[]{node1, node2}));
    assertEquals(2, mll.getLowest(new ListNode[]{node3, node2}));
    assertEquals(3, mll.getLowest(new ListNode[]{node2, node2}));
  }

  @Test
  public void testTwoListsComparison() {
    assertEquals(new ListNode(1, 3, 4, 5, 7, 8, 9, 12).toString(), mll.comparison(new ListNode[]{node1, node2}).toString());
  }

  @Test
  public void testThreeListsComparison() {
    assertEquals(new ListNode(1, 2, 2, 2, 3, 4, 5, 7, 8, 9, 12).toString(), mll.comparison(new ListNode[]{node1, node2, node3}).toString());
  }

  @Test
  public void testTwoListsPriority() {
    assertEquals(new ListNode(1, 3, 4, 5, 7, 8, 9, 12).toString(), mll.priorityQueue(new ListNode[]{node1, node2}).toString());
  }

  @Test
  public void testThreeListsPriority() {
    assertEquals(new ListNode(1, 2, 2, 2, 3, 4, 5, 7, 8, 9, 12).toString(), mll.priorityQueue(new ListNode[]{node1, node2, node3}).toString());
  }
}
