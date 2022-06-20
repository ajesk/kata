package io.acode.leetcode.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {
  ValidAnagram target = new ValidAnagram();

  @Test
  void testBasic() {
    assertTrue(target.isAnagram("", ""));
    assertTrue(target.isAnagram("a", "a"));
    assertFalse(target.isAnagram("", "a"));
  }

  @Test
  void test2Char() {
    assertTrue(target.isAnagram("ab", "ba"));
    assertFalse(target.isAnagram("ac", "dc"));
    assertFalse(target.isAnagram("xx", "yy"));
  }

  @Test
  void testLeet() {
    assertTrue(target.isAnagram("anagram", "nagaram"));
    assertFalse(target.isAnagram("rat", "car"));
  }
}
