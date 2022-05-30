package io.acode.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsPerfectSquareRootTest {
  IsPerfectSquareRoot target = new IsPerfectSquareRoot();

  @Test
  public void testBasic() {
    assertTrue(target.isPerfectSquare(1));
  }

  @Test
  public void testIsSquare() {
    assertTrue(target.isPerfectSquare(4));
    assertTrue(target.isPerfectSquare(9));
    assertTrue(target.isPerfectSquare(16));
    assertTrue(target.isPerfectSquare(25));
  }

  @Test
  public void testIsNotSquare() {
    assertFalse(target.isPerfectSquare(3));
    assertFalse(target.isPerfectSquare(10));
    assertFalse(target.isPerfectSquare(22));
    assertFalse(target.isPerfectSquare(26));
  }

  @Test
  public void testLeet() {
    assertTrue(target.isPerfectSquare(808201));
    assertTrue(target.isPerfectSquare(2147395600));
  }
}
