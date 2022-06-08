package io.acode.lessons.freecodecamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanSumTest {
  private CanSum target = new CanSum();

  @Test
  void testBasic() {
    assertTrue(target.canSum(1, new int[]{1}));
  }

  @Test
  void test2Values() {
    assertTrue(target.canSum(2, new int[]{2, 3}));
    assertTrue(target.canSum(2, new int[]{1, 3}));
    assertFalse(target.canSum(2, new int[]{4, 3}));
  }

  @Test
  void testLessonExample() {
    assertTrue(target.canSum(7, new int[]{2,4,3,7}));
    assertFalse(target.canSum(7, new int[]{2,4}));
    assertFalse(target.canSum(300, new int[]{7, 14}));
  }
}
