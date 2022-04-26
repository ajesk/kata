package io.acode.leetcode.misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PoxXofNTest {
  PowXofN target = new PowXofN();
  double baseDelta = 0.0001;

  @Test
  public void testBasic() {
    assertEquals(1, target.myPow(2, 0), baseDelta);
    assertEquals(2, target.myPow(2, 1), baseDelta);
    assertEquals(0, target.myPow(0, 50000000), baseDelta);
  }

  @Test
  public void testPositivePow() {
    assertEquals(4, target.myPow(2, 2), baseDelta);
    assertEquals(8, target.myPow(2, 3), baseDelta);
    assertEquals(1024, target.myPow(2, 10), baseDelta);
    assertEquals(9, target.myPow(3, 2), baseDelta);
  }

  @Test
  public void testLeetPositive() {
    assertEquals(9.261, target.myPow(2.1, 3), baseDelta);
  }

  @Test
  public void testNegative() {
    assertEquals(0.5, target.myPow(2, -1), baseDelta);
    assertEquals(0.25, target.myPow(2, -2), baseDelta);
    assertEquals(0.125, target.myPow(2, -3), baseDelta);
    assertEquals(0.3333333, target.myPow(3, -1), baseDelta);
  }
}
