package io.acode.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeIntervalsTest {
  MergeIntervals target = new MergeIntervals();

  @Test
  void testBasic() {
    assertArrayEquals(new int[][]{{1, 2}}, target.merge(new int[][]{{1, 2}}));
  }

  @Test
  void testSingleMerge() {
    assertArrayEquals(new int[][]{{1, 3}}, target.merge(new int[][]{{1, 2}, {2, 3}}));
  }

  @Test
  void testEncasingMerge() {
    assertArrayEquals(new int[][]{{1, 4}}, target.merge(new int[][]{{1, 4}, {2, 3}, {3, 4}}));
  }

  @Test
  void testTermination() {
    assertArrayEquals(new int[][]{{1, 4}}, target.merge(new int[][]{{1, 4}, {2, 3}}));
  }

  @Test
  void testAllSameOrigin() {
    assertArrayEquals(new int[][]{{1, 10}}, target.merge(new int[][]{{1, 2}, {1, 5}, {1, 10}}));
  }

  @Test
  void test2Chains() {
    assertArrayEquals(new int[][]{{1, 3}, {4, 6}}, target.merge(new int[][]{{1, 2}, {2, 3}, {4, 5}, {5, 6}}));
  }

  @Test
  void testOutOfOrder() {
    assertArrayEquals(new int[][]{{1, 3}, {4, 6}}, target.merge(new int[][]{{2, 3}, {5, 6}, {1, 2}, {4, 5}}));
  }

  @Test
  void testLeet() {
    assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, target.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    assertArrayEquals(new int[][]{{1, 5}}, target.merge(new int[][]{{1, 4}, {4, 5}}));
  }
}
