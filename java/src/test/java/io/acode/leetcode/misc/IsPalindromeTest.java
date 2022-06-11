package io.acode.leetcode.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsPalindromeTest {
  IsPalindrome target = new IsPalindrome();

  @Test
  void testBasic() {
    assertTrue(target.isPalindrome(" "));
    assertTrue(target.isPalindrome("a"));
  }

  @Test
  void testTwoChars() {
    assertTrue(target.isPalindrome("aa"));
    assertFalse(target.isPalindrome("ab"));
  }

  @Test
  void testLeetCases() {
    assertTrue(target.isPalindrome("racecar"));
    assertTrue(target.isPalindrome("tacocat"));
    assertFalse(target.isPalindrome("race a car"));
    assertTrue(target.isPalindrome("amanaplanacanalpanama"));
    assertTrue(target.isPalindrome("A man, a plan, a canal: Panama"));
  }
}
