package io.acode.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
  Fibonacci target = new Fibonacci();

  @Test
  public void testBottomUp() {
    assertEquals(0, target.bottomUp(0));
    assertEquals(1, target.bottomUp(1));
    assertEquals(1, target.bottomUp(2));
    assertEquals(2, target.bottomUp(3));
    assertEquals(3, target.bottomUp(4));
    assertEquals(5, target.bottomUp(5));
    assertEquals(8, target.bottomUp(6));
  }

  @Test
  public void testTopDown() {
    assertEquals(0, target.topDown(0));
    assertEquals(1, target.topDown(1));
    assertEquals(1, target.topDown(2));
    assertEquals(2, target.topDown(3));
    assertEquals(3, target.topDown(4));
    assertEquals(5, target.topDown(5));
    assertEquals(8, target.topDown(6));
  }
}
