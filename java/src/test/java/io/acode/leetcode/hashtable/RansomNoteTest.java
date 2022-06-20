package io.acode.leetcode.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RansomNoteTest {
  RansomNote target = new RansomNote();

  @Test
  void testBasic() {
    assertTrue(target.canConstruct("a", "a"));
    assertFalse(target.canConstruct("a", "b"));
    assertFalse(target.canConstruct("aa", "a"));
  }

  @Test
  void test3Char() {
    assertTrue(target.canConstruct("aa", "aab"));
  }
}
