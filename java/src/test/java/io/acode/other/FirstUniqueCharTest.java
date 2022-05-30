package io.acode.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueCharTest {
  @Test
  public void testSingleChar() {
    assertEquals('a', FirstUniqueChar.firstUnique("a"));
  }

  @Test
  public void test3Chars() {
    assertEquals('a', FirstUniqueChar.firstUnique("bba"));
  }

  @Test
  public void test5Chars() {
    assertEquals('c', FirstUniqueChar.firstUnique("aabbc"));
  }

  @Test
  public void testMultipleSingleChars() {
    assertEquals('z', FirstUniqueChar.firstUnique("aaabbbcccdddzyx"));
  }
}
