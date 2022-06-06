package io.acode.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumScoreFromMultiplicationTest {
  MaximumScoreFromMultiplication target = new MaximumScoreFromMultiplication();

  @Test
  void testLeetExample() {
    assertEquals(102, target.maximumScore(new int[]{-5, -3, -3, -2, 7, 1}, new int[]{-10, -5, 3, 4, 6}));
  }

  @Test
  void testLeetExample2() {
    assertEquals(14, target.maximumScore(new int[]{1,2,3}, new int[]{3,2,1}));
    assertEquals(14, target.maximumScore(new int[]{2,1,3}, new int[]{3,2,1}));
  }
}
