package io.acode.lessons.freecodecamp;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class HowSumTest {
  HowSum target = new HowSum();

  @Test
  void testBasic() {
    Optional<Integer> result = target.howSum(1, new int[]{1}).stream().reduce(Integer::sum);

    assertTrue(result.isPresent());
    assertEquals(1, result.get());
    assertNull(target.howSum(1, new int[]{2}));
  }

  @Test
  void testMultiValue() {
    List<Integer> result = target.howSum(8, new int[]{1, 2, 3});
    Optional<Integer> total = result.stream().reduce(Integer::sum);

    assertTrue(result.size() > 1);
    assertEquals(8, total.get());
  }

  @Test
  void testLessonExample() {
    List<Integer> result = target.howSum(7, new int[]{5, 3, 4, 7});
    Optional<Integer> total = result.stream().reduce(Integer::sum);

    assertTrue(result.size() >= 1);
    assertEquals(7, total.get());
  }

  @Test
  void testLargeAndInCharge() {
    assertNull(target.howSum(300, new int[]{7, 14}));
  }
}
