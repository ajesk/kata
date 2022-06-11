package io.acode.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {
  private ClimbingStairs target = new ClimbingStairs();

  @Test
  void testBasic() {
    assertEquals(1, target.climbStairs(1));
    assertEquals(2, target.climbStairs(2));
    assertEquals(3, target.climbStairs(3));
    assertEquals(5, target.climbStairs(4));
    assertEquals(8, target.climbStairs(5));
    assertEquals(13, target.climbStairs(6));
    assertEquals(21, target.climbStairs(7));
    assertEquals(34, target.climbStairs(8));
    assertEquals(55, target.climbStairs(9));
  }
}