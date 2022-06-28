package io.acode.leetcode.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {
  LongestPalindrome target = new LongestPalindrome();

  @Test
  void testBasic() {
    assertEquals(1, target.longestPalindrome("a"));
    assertEquals(1, target.longestPalindrome("ab"));
    assertEquals(2, target.longestPalindrome("aa"));
  }

  @Test
  void testSingleOdd() {
    assertEquals(7, target.longestPalindrome("aabbccd"));
  }

  @Test
  void testLeet() {
    assertEquals(7, target.longestPalindrome("abccccdd"));
  }
}
