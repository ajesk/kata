package io.acode.leetcode.dp;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordBreakTest {
  WordBreak target = new WordBreak();

  @Test
  void testBasic() {
    assertTrue(target.wordBreak("a", List.of("a")));
  }

  @Test
  void test2Letter() {
    assertTrue(target.wordBreak("ab", List.of("a", "b")));
    assertTrue(target.wordBreak("ab", List.of("b", "a")));
    assertTrue(target.wordBreak("ab", List.of("ab")));
    assertFalse(target.wordBreak("ab", List.of("c", "a")));
  }

  @Test
  void testPerfTest() {
    assertFalse(target.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
      List.of(
        "a",
        "aa",
        "aaa",
        "aaaa",
        "aaaaa",
        "aaaaaa",
        "aaaaaaa",
        "aaaaaaaa",
        "aaaaaaaaa"
      )));
  }
}
