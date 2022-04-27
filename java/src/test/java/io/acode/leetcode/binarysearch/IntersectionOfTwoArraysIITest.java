package io.acode.leetcode.binarysearch;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;

public class IntersectionOfTwoArraysIITest {
  IntersectionOfTwoArraysII target = new IntersectionOfTwoArraysII();

  @Test
  public void testIntesection() {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(1,3);
    map.put(2,1);

    int[] arr = new int[]{1,1,2,3};
    target.findIntersection(map, arr);
  }

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

    assertArrayEquals(new int[]{3,3,5,6,8}, target.intersection(arr1, arr2));
  }

  @Test
  public void testDuplicatesOfTheSameValue() {
    assertArrayEquals(new int[]{2,2,2,2,2,2}, target.intersection(new int[]{2,2,2,2,2,2}, new int[]{2,2,2,2,2,2,2,2,2,2}));
  }
}
