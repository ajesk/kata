package io.acode.leetcode.stack;

import io.acode.leetcode.stack.DecodeString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeStringTest {
  private DecodeString target = new DecodeString();

  @Test
  public void testBasic() {
    assertEquals("abc", target.decodeString("abc"));
  }

  @Test
  public void testSimpleLoop() {
    assertEquals("aaa", target.decodeString("3[a]"));
  }

  @Test
  public void testDoubleLoop() {
    assertEquals("aaabb", target.decodeString("3[a]2[b]"));
  }

  @Test
  public void testEmbeddedLoop() {
    assertEquals("aaaaaa", target.decodeString("3[2[a]]"));
  }

  @Test
  public void testMultiLayeredString() {
    assertEquals("abccdbccde", target.decodeString("a2[b2[c]d]e"));
  }

  @Test
  public void testLeet() {
    assertEquals("aaabcbc", target.decodeString("3[a]2[bc]"));
    assertEquals("accaccacc", target.decodeString("3[a2[c]]"));
    assertEquals("abcabccdcdcdef", target.decodeString("2[abc]3[cd]ef"));
  }

  @Test
  public void testLeetcode10() {
    assertEquals("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode",
      target.decodeString("10[leetcode]"));
  }

  @Test
  public void testAnotherLeet() {
    assertEquals("bcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxybcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxdrtrtrtrt",
      target.decodeString("2[20[bc]31[xy]]xd4[rt]"));
  }
}
