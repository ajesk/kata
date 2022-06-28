package io.acode.leetcode.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {
  LongestSubstringWithoutRepeatingCharacters target = new LongestSubstringWithoutRepeatingCharacters();

  @Test
  void testBasic() {
    assertEquals(1, target.lengthOfLongestSubstring("a"));
    assertEquals(1, target.lengthOfLongestSubstring("aa"));
  }

  @Test
  void testTwoChars() {
    assertEquals(2, target.lengthOfLongestSubstring("ab"));
    assertEquals(2, target.lengthOfLongestSubstring("aba"));
  }

  @Test
  void test3Distinct() {
    assertEquals(3, target.lengthOfLongestSubstring("abc"));
    assertEquals(3, target.lengthOfLongestSubstring("acbc"));
    assertEquals(3, target.lengthOfLongestSubstring("acbca"));
    assertEquals(3, target.lengthOfLongestSubstring("abcabcbb"));
  }

  @Test
  void testLeet() {
    assertEquals(1, target.lengthOfLongestSubstring("bbbbbb"));
    assertEquals(3, target.lengthOfLongestSubstring("pwwkew"));
  }


  @Test
  void testBasic2() {
    assertEquals(1, target.lengthOfLongestSubstring2("a"));
    assertEquals(1, target.lengthOfLongestSubstring2("aa"));
  }

  @Test
  void testTwoChars2() {
    assertEquals(2, target.lengthOfLongestSubstring2("ab"));
    assertEquals(2, target.lengthOfLongestSubstring2("aba"));
  }

  @Test
  void test3Distinct2() {
    assertEquals(3, target.lengthOfLongestSubstring2("abc"));
    assertEquals(3, target.lengthOfLongestSubstring2("acbc"));
    assertEquals(3, target.lengthOfLongestSubstring2("acbca"));
    assertEquals(3, target.lengthOfLongestSubstring2("abcabcbb"));
  }

  @Test
  void testLeet2() {
    assertEquals(1, target.lengthOfLongestSubstring2("bbbbbb"));
    assertEquals(3, target.lengthOfLongestSubstring2("pwwkew"));
  }
}
