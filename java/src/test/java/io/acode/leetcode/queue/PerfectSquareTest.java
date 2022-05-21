package io.acode.leetcode.queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PerfectSquareTest {
  PerfectSquare target = new PerfectSquare();

  @Test
  public void testBasic() {
    assertEquals(1, target.numSquares(1));
    assertEquals(1, target.numSquares(4));
    assertEquals(1, target.numSquares(9));
  }

  @Test
  public void testDoubleUp() {
    assertEquals(2, target.numSquares(2));
    assertEquals(2, target.numSquares(5));
    assertEquals(2, target.numSquares(8));
    assertEquals(2, target.numSquares(18));
    assertEquals(2, target.numSquares(13));
  }

  @Test
  public void testTriple() {
    assertEquals(3, target.numSquares(12));
    assertEquals(3, target.numSquares(11));
  }

  @Test
  public void leetTimeLimitExceeded() {
    assertEquals(4, target.numSquares(7168));
  }
}
