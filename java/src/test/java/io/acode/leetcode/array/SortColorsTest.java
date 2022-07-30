package io.acode.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortColorsTest {

  SortColors target = new SortColors();

  @Test
  void testBasic() {
    int[] testArr = new int[]{0};
    target.sortColors(testArr);
    assertArrayEquals(new int[]{0}, testArr);

    testArr = new int[]{1};
    target.sortColors(testArr);
    assertArrayEquals(new int[]{1}, testArr);

    testArr = new int[]{2};
    target.sortColors(testArr);
    assertArrayEquals(new int[]{2}, testArr);
  }

  @Test
  void testNoSort() {
    int[] test = new int[]{1, 2};
    target.sortColors(test);
    assertArrayEquals(new int[]{1, 2}, test);

    test = new int[]{1, 1};
    target.sortColors(test);
    assertArrayEquals(new int[]{1, 1}, test);
  }

  @Test
  void testSimpleSort() {
    int[] test = new int[]{2, 1};
    target.sortColors(test);
    assertArrayEquals(new int[]{1, 2}, test);
  }

  @Test
  void testSort3() {
    int[] test = new int[]{2, 0, 1};
    target.sortColors(test);
    assertArrayEquals(new int[]{0, 1, 2}, test);
  }

  @Test
  void testLeet() {
    int[] test = new int[]{2, 0, 2, 1, 1, 0};
    target.sortColors(test);
    assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, test);
  }
}
