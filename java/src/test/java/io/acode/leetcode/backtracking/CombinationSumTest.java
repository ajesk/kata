package io.acode.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {
  CombinationSum target = new CombinationSum();

  @Test
  void testLeet() {
    assertEquals(2, target.combinationSum(new int[]{2, 3, 6, 7}, 7).size());
  }

  @Test
  void testLeet2() {
    assertEquals(3, target.combinationSum(new int[]{2, 3, 5}, 8).size());
  }

  @Test
  void testLeet3() {
    assertEquals(0, target.combinationSum(new int[]{2}, 1).size());
  }

  @Test
  void testTLE() {
    assertFalse(target.combinationSum(new int[]{100, 200, 4, 12}, 400).isEmpty());
  }
}
