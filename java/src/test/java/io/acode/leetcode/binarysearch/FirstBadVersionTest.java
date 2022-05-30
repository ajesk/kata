package io.acode.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstBadVersionTest {
  FirstBadVersion target = new FirstBadVersion();

  @Test
  public void testIsBad() {
    target.setBad(1);
    assertTrue(target.isBadVersion(1));
    assertTrue(target.isBadVersion(2));
    assertFalse(target.isBadVersion(0));
  }

  @Test
  public void testSimpleBad() {
    target.setBad(1);
    assertEquals(1, target.firstBadVersion(1));
  }

  @Test
  public void testTwoVersions() {
    target.setBad(2);
    assertEquals(2, target.firstBadVersion(2));
    target.setBad(1);
    assertEquals(1, target.firstBadVersion(2));
  }

  @Test
  public void testThreeVersions() {
    target.setBad(1);
    assertEquals(1, target.firstBadVersion(3));
    target.setBad(2);
    assertEquals(2, target.firstBadVersion(3));
    target.setBad(3);
    assertEquals(3, target.firstBadVersion(3));
  }

  @Test
  public void testFourVersions() {
    target.setBad(3);
    assertEquals(3, target.firstBadVersion(6));
  }
}
