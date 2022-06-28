package io.acode.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertIntervalTest {
  InsertInterval target = new InsertInterval();

  @Test
  void testBasic() {
    assertArrayEquals(new int[][]{{1, 2}}, target.insert(new int[][]{}, new int[]{1, 2}));
  }

  @Test
  void testValueBelow() {
    assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, target.insert(new int[][]{{3, 4}}, new int[]{1, 2}));
  }

  @Test
  void testValueAbove() {
    assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, target.insert(new int[][]{{1, 2}}, new int[]{3, 4}));
  }

  @Test
  void testAddIntervalInBetween() {
    assertArrayEquals(new int[][]{{1, 2}, {3, 4}, {5, 6}}, target.insert(new int[][]{{1, 2}, {5, 6}}, new int[]{3, 4}));
  }

  @Test
  void testSingleJoin() {
    assertArrayEquals(new int[][]{{1, 4}}, target.insert(new int[][]{{1, 3}}, new int[]{2, 4}));
  }

  @Test
  void testNewIntervalEngulfs() {
    assertArrayEquals(new int[][]{{1, 10}}, target.insert(new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}}, new int[]{1, 10}));
  }

  @Test
  void testLeet() {
    assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, target.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}));
    assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, target.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}));
  }

  @Test
  void testFailure() {
    assertArrayEquals(new int[][]{{0, 5}}, target.insert(new int[][]{{1, 5}}, new int[]{0, 3}));
    assertArrayEquals(new int[][]{{1, 7}}, target.insert(new int[][]{{1, 5}}, new int[]{5, 7}));
  }

  @Test
  void testFailure3() {
    assertArrayEquals(new int[][]{{0, 1}, {2, 5}, {6, 7}, {8, 9}}, target.insert(new int[][]{{2, 5}, {6, 7}, {8, 9}}, new int[]{0, 1}));
  }
}
