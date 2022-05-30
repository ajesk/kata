package io.acode.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthTribonacciTest {
  NthTribonacci target = new NthTribonacci();

  @Test
  public void testBasic() {
    assertEquals(0, target.tribonacci(0));
    assertEquals(1, target.tribonacci(1));
    assertEquals(1, target.tribonacci(2));
    assertEquals(2, target.tribonacci(3));
    assertEquals(4, target.tribonacci(4));
    assertEquals(7, target.tribonacci(5));
    assertEquals(13, target.tribonacci(6));
    assertEquals(24, target.tribonacci(7));
    assertEquals(1389537, target.tribonacci(25));
  }
}
