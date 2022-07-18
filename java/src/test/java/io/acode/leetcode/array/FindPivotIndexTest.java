package io.acode.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPivotIndexTest {
  FindPivotIndex target = new FindPivotIndex();

  @Test
  void testLeet() {
    assertEquals(3, target.pivotIndex(new int[]{1,7,3,6,5,6}));
    assertEquals(-1, target.pivotIndex(new int[]{1,2,3}));
    assertEquals(0, target.pivotIndex(new int[]{2,1,-1}));
  }
}
