package io.acode.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {
  ValidParentheses target = new ValidParentheses();

  @Test
  public void testBasic() {
    assertTrue(target.isValid(""));
  }

  @Test
  public void testOddNumberOfCharactersFalse() {
    assertFalse(target.isValid("{"));
    assertFalse(target.isValid("{}{"));
    assertFalse(target.isValid("}{{{{"));
  }

  @Test
  public void testSimpleValidCase() {
    assertTrue(target.isValid("{}"));
    assertTrue(target.isValid("[]"));
    assertTrue(target.isValid("()"));
  }

  @Test
  public void testMismatchedPairs() {
    assertFalse(target.isValid("{)"));
    assertFalse(target.isValid("(]"));
    assertFalse(target.isValid("[)"));
  }

  @Test
  public void testNestedPairs() {
    assertTrue(target.isValid("{{{}}}"));
    assertTrue(target.isValid("{{[]}}"));
    assertTrue(target.isValid("{([])}"));
  }

  @Test
  public void testSubsequentPairs() {
    assertTrue(target.isValid("{}[]()"));
  }

  @Test
  public void moreClosingThanOpening() {
    assertFalse(target.isValid("{}}}"));
  }
}
