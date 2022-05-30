package io.acode.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

final class WhereIsMyParentTest {
  private static void test(final String expected, final String input) {
    assertEquals(expected, WhereIsMyParent.findChildren(input), "For input \"" + input + '"');
  }

  @Test
  void basicTests() {
    test("AaBb", "abBA");
    test("AaaaaaZzzz", "AaaaaZazzz");
    test("AaBbbCcc", "CbcBcbaA");
    test("FfUuuuXx", "xXfuUuuF");
    test("", "");
  }
}
