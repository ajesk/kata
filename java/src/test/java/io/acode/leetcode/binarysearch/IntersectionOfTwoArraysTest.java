package io.acode.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntersectionOfTwoArraysTest {
  IntersectionOfTwoArrays target = new IntersectionOfTwoArrays();

  @Test
  public void testBasic() {
    assertArrayEquals(new int[]{1,2}, target.intersection(new int[]{1,2}, new int[]{1,2}));
    assertArrayEquals(new int[]{1}, target.intersection(new int[]{1}, new int[]{1}));
  }

  @Test
  public void testSingularIntersection() {
    int[] arr1 = new int[]{1,2,3,4,5};
    int[] arr2 = new int[]{3,6,7,8,9};

    assertArrayEquals(new int[]{3}, target.intersection(arr1, arr2));
    assertArrayEquals(new int[]{3}, target.intersection(arr2, arr1));
  }

  @Test
  public void testSingularEndIntersection() {
    int[] arr1 = new int[]{1,2,3,4,5};
    int[] arr2 = new int[]{5,6,7,8,9};

    assertArrayEquals(new int[]{5}, target.intersection(arr1, arr2));
    assertArrayEquals(new int[]{5}, target.intersection(arr2, arr1));
  }

  @Test
  public void testAllButOne() {
    int[] arr1 = new int[]{6,5,3,8,3};
    int[] arr2 = new int[]{7,3,8,5,6,3};

    assertArrayEquals(new int[]{3,5,6,8}, target.intersection(arr1, arr2));
  }

  @Test
  public void testDuplicatesOfTheSameValue() {
    assertArrayEquals(new int[]{2}, target.intersection(new int[]{2,2,2,2,2,2}, new int[]{2,2,2,2,2,2,2,2,2,2}));
  }
}
