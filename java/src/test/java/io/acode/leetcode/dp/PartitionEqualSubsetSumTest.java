package io.acode.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PartitionEqualSubsetSumTest {
  PartitionEqualSubsetSum target = new PartitionEqualSubsetSum();

  @Test
  void testBasic() {
    assertFalse(target.canPartition(new int[]{1}));
    assertTrue(target.canPartition(new int[]{1, 1}));
  }

  @Test
  void testLeet() {
    assertTrue(target.canPartition(new int[]{1,5,11,5}));
    assertTrue(target.canPartition(new int[]{1,2,3,5,17,6,14,12,6}));
    assertFalse(target.canPartition(new int[]{1,2,5}));
    assertFalse(target.canPartition(new int[]{1,2,3,5}));
    assertFalse(target.canPartition(new int[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,99,97}));
  }
}