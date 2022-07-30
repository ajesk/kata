package io.acode.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsIsomorphicTest {
  IsIsomorphic target = new IsIsomorphic();

  @Test
  void testBasic() {
    assertTrue(target.isIsomorphic("a", "b"));
    assertTrue(target.isIsomorphic("ab", "cd"));
  }

  @Test
  void testMultimapConflict() {
    assertTrue(target.isIsomorphic("ab", "ca"));
    assertFalse(target.isIsomorphic("aa", "cb"));
  }

  @Test
  void testLeet() {
    assertTrue(target.isIsomorphic("egg", "add"));
    assertFalse(target.isIsomorphic("foo", "bar"));
    assertTrue(target.isIsomorphic("paper", "title"));
    assertFalse(target.isIsomorphic("badc", "baba"));
  }
}
