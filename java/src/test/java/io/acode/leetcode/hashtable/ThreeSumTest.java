package io.acode.leetcode.hashtable;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {
  ThreeSum target = new ThreeSum();

  @Test
  void testBasic() {
    assertEquals(emptyList(), target.threeSum(new int[]{}));
    assertEquals(emptyList(), target.threeSum(new int[]{0}));
    assertEquals(1, target.threeSum(new int[]{1, 0, -1}).size());
    assertEquals(1, target.threeSum(new int[]{1, -1, 0}).size());
    assertEquals(emptyList(), target.threeSum(new int[]{1, -1, -1}));
  }

  @Test
  void test3ValuesMatching() {
    assertEquals(List.of(List.of(-5, 3, 2)), target.threeSum(new int[]{3, 2, -5}));
  }

  @Test
  void testWorstCaseScenario() {
    assertEquals(1, target.threeSum(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}).size());
  }

  @Test
  void testLeetScenario() {
    assertEquals(2, target.threeSum(new int[]{-1, 0, 1, 2, -1, -4}).size());
  }
}
