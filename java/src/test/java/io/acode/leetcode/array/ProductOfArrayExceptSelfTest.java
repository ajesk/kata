package io.acode.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayExceptSelfTest {
  ProductOfArrayExceptSelf target = new ProductOfArrayExceptSelf();

  @Test
  void testBasic() {
    assertArrayEquals(new int[]{24, 12, 8, 6}, target.productExceptSelf(new int[]{1, 2, 3, 4}));
    assertArrayEquals(new int[]{0, 0, 9, 0, 0}, target.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
  }
}
