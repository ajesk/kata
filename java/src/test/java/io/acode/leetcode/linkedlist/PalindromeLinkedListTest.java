package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeLinkedListTest {
  PalindromeLinkedList target = new PalindromeLinkedList();

  @Test
  public void testBasic() {
    assertTrue(target.isPalindrome(new ListNode(1)));
  }

  @Test
  public void twoNodePalindrome() {
    assertTrue(target.isPalindrome(new ListNode(2, 2)));
  }

  @Test
  public void twoNodeNoPalindrome() {
    assertFalse(target.isPalindrome(new ListNode(1,2)));
  }

  @Test
  public void threeNodePalindrome() {
    assertTrue(target.isPalindrome(new ListNode(1,2,1)));
  }

  @Test
  public void threeNodeNoPalindrome() {
    assertFalse(target.isPalindrome(new ListNode(1,2,3)));
  }
}
