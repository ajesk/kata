package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeSortedLinkedListsTest {
  MergeSortedLinkedLists target = new MergeSortedLinkedLists();

  @Test
  public void testBasic() {
    assertNull(target.mergeTwoLists(null, null));
  }

  @Test
  public void testSingleValues() {
    assertEquals("1,null", target.mergeTwoLists(new ListNode(1), null).toString());
    assertEquals("2,null", target.mergeTwoLists(null, new ListNode(2)).toString());
  }

  @Test
  public void testTwoValues() {
    assertEquals("1,2,null", target.mergeTwoLists(new ListNode(1), new ListNode(2)).toString());
  }

  @Test
  public void testThreeValues() {
    assertEquals("1,2,3,null", target.mergeTwoLists(new ListNode(1,3), new ListNode(2)).toString());
    assertEquals("1,2,3,null", target.mergeTwoLists(new ListNode(1,2,3), null).toString());
  }

  @Test
  public void testAllSameValues() {
    assertEquals("7,7,7,7,7,7,7,null", target.mergeTwoLists(new ListNode(7,7,7,7,7,7,7), null).toString());
    assertEquals("7,7,7,7,7,7,7,null", target.mergeTwoLists(null, new ListNode(7,7,7,7,7,7,7)).toString());
  }
}
