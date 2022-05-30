package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveLinkedListElementsTest {
  private RemoveLinkedListElements target = new RemoveLinkedListElements();

  @Test
  public void testBasic() {
    ListNode test = new ListNode(1);
    assertNull(target.removeElements(test, 1));
    assertNull(target.removeElements(null, 983));
  }

  @Test
  public void testRemoveSingleElement() {
    ListNode test = new ListNode(1,2,3,4);
    ListNode test2 = new ListNode(1,2,3,4);
    ListNode test3 = new ListNode(1,2,3,4);
    ListNode test4 = new ListNode(1,2,3,4);
    assertEquals("2,3,4,null", target.removeElements(test, 1).toString());
    assertEquals("1,3,4,null", target.removeElements(test2, 2).toString());
    assertEquals("1,2,4,null", target.removeElements(test3, 3).toString());
    assertEquals("1,2,3,null", target.removeElements(test4, 4).toString());
  }

  @Test
  public void removeAllElements() {
    ListNode test = new ListNode(7,7,7,7,7);
    assertNull(target.removeElements(test, 7));
  }
}
