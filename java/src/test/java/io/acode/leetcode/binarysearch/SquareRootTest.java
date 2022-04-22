package io.acode.leetcode.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareRootTest {
  SquareRoot target = new SquareRoot();

  @Test
  public void basicTest() {
    assertEquals(0, target.mySqrt(0));
    assertEquals(1, target.mySqrt(1));
  }

  @Test
  public void testSmol() {
    assertEquals(1, target.mySqrt(2));
  }

  @Test
  public void testEvenRoots() {
    assertEquals(2, target.mySqrt(4));
    assertEquals(3, target.mySqrt(9));
    assertEquals(4, target.mySqrt(16));
    assertEquals(5, target.mySqrt(25));
  }

  @Test
  public void testOffRoots() {
    assertEquals(2, target.mySqrt(5));
    assertEquals(3, target.mySqrt(10));
    assertEquals(4, target.mySqrt(18));
  }

//  @Test
  public void testWtf() {
    assertEquals(1, target.mySqrt(2147395599));
  }
}
