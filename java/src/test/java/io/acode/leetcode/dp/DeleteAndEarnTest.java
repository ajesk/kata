package io.acode.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteAndEarnTest {
  DeleteAndEarn target = new DeleteAndEarn();

  @Test
  void testBasic() {
    assertEquals(1, target.deleteAndEarn(new int[]{1}));
    assertEquals(2, target.deleteAndEarn(new int[]{1, 1}));
  }

  @Test
  void testTwoAdjacentNumbers() {
    assertEquals(2, target.deleteAndEarn(new int[]{2, 1}));
    assertEquals(2, target.deleteAndEarn(new int[]{1, 2}));
  }

  @Test
  void test3Values() {
    assertEquals(6, target.deleteAndEarn(new int[]{3, 4, 2}));
    assertEquals(9, target.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
  }

  @Test
  void testLeetFail() {
    assertEquals(53, target.deleteAndEarn(new int[]{4,10,10,8,1,4,10,9,7,6}));
  }
}
