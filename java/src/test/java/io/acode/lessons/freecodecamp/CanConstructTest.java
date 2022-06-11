package io.acode.lessons.freecodecamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanConstructTest {
  CanConstruct target = new CanConstruct();

  @Test
  void testBasic() {
    assertTrue(target.canConstruct("", new String[]{"aaa"}));
    assertTrue(target.canConstruct("a", new String[]{"a"}));
  }

  @Test
  void testTwoWords() {
    assertTrue(target.canConstruct("ab", new String[]{"b", "a"}));
    assertFalse(target.canConstruct("ab", new String[]{"b", "c"}));
  }

  @Test
  void testLongWord() {
    assertTrue(target.canConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", new String[]{"b","c","d","e","f","g","a"}));
  }

  @Test
  void testSkateboard() {
    assertFalse(target.canConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
  }

  @Test
  void testRidiculous() {
    assertFalse(target.canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
      new String[]{
        "e",
        "ee",
        "eee",
        "eeee",
        "eeeee",
        "eeeeee"
      }));
  }
}
