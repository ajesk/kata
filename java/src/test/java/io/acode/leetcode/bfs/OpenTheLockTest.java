package io.acode.leetcode.bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpenTheLockTest {
  OpenTheLock target = new OpenTheLock();

  @Test
  public void testBasic() {
    assertEquals(0, target.openLock(new String[]{}, "0000"));
  }

  @Test
  public void testSimpleMove() {
    assertEquals(1, target.openLock(new String[]{}, "0001"));
    assertEquals(1, target.openLock(new String[]{}, "0009"));
    assertEquals(1, target.openLock(new String[]{}, "0900"));
    assertEquals(1, target.openLock(new String[]{}, "0001"));
    assertEquals(1, target.openLock(new String[]{}, "0100"));
    assertEquals(1, target.openLock(new String[]{}, "9000"));
  }

  @Test
  public void testDoubleMoveSameDigit() {
    assertEquals(2, target.openLock(new String[]{}, "0002"));
    assertEquals(2, target.openLock(new String[]{}, "0080"));
  }

  @Test
  public void testDoubleMoveTwoDigits() {
    assertEquals(2, target.openLock(new String[]{}, "1100"));
    assertEquals(2, target.openLock(new String[]{}, "1009"));
  }

  @Test
  public void testSimpleBlockedPattern() {
    assertEquals(4, target.openLock(new String[]{"0001"}, "0002"));
  }

  @Test
  public void testImpossible() {
    String[] deadEnds = new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"};

    assertEquals(-1, target.openLock(deadEnds, "8888"));
  }
}
