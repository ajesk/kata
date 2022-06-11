package io.acode.lessons.freecodecamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountConstructTest {
  CountConstruct target = new CountConstruct();

  @Test
  void testBasic() {
    assertEquals(1, target.countConstruct("a", new String[]{"a"}));
    assertEquals(0, target.countConstruct("a", new String[]{"b"}));
  }

  @Test
  void testLongerForm() {
    assertEquals(2, target.countConstruct("catdog", new String[]{"cat", "dog", "ca", "tdog"}));
  }

  @Test
  void testLessonExamples() {
    assertEquals(1, target.countConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
  }

  @Test
  void testLongAsHell() {
    assertEquals(0, target.countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
      new String[]{
        "e",
        "ee",
        "eee",
        "eeee",
        "eeeee",
        "eeeeee",
        "eeeeeee",
        "eeeeeeee",
        "eeeeeeeee",
        "eeeeeeeeee",
      }));
  }
}
