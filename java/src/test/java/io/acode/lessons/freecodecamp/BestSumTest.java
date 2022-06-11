package io.acode.lessons.freecodecamp;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BestSumTest {
  BestSum target = new BestSum();

  public boolean listEquals(List<Integer> l1, List<Integer> l2) {
    return l1.size() == l2.size() && l1.containsAll(l2);
  }

  @Test
  void testBasic() {
    assertEquals(List.of(1), target.bestSum(1, new int[]{1}));
  }

  @Test
  void testSimplePath() {
    assertTrue(listEquals(List.of(1, 2), target.bestSum(3, new int[]{1, 2})));
    assertEquals(List.of(3), target.bestSum(3, new int[]{1, 2, 3}));
  }

  @Test
  void doesNotCompute() {
    assertNull(target.bestSum(3, new int[]{4}));
  }

  @Test
  void testAnotherPath() {
    assertTrue(listEquals(List.of(3, 5), target.bestSum(8, new int[]{3, 2, 5})));
  }

  @Test
  void testShortestPathExample() {
    assertEquals(List.of(7), target.bestSum(7, new int[]{5, 3, 4, 7}));
  }

  @Test
  void testLargeNoCompute() {
    assertNull(target.bestSum(300, new int[]{7, 14}));
  }
}
