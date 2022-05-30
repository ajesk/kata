package io.acode.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import java.util.Enumeration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInRotatedArrayTest {
  SearchInRotatedArray target = new SearchInRotatedArray();

  @Test
  public void findPivotBasicTest() {
    int[] nums = new int[]{4, 5, 6, 7, 8, 0, 1, 2};
    assertEquals(5, target.findPivot(nums));
  }

  @Test
  public void testAlternatePivot() {
    int[] nums = new int[]{8,9,0,1,2,3,4};
    assertEquals(2, target.findPivot(nums));
  }

  @Test
  public void oneLastPivot() {
    int[] nums = new int[]{8,9,10,11,12,14,16,3,4,6,7};
    assertEquals(7, target.findPivot(nums));
  }

  @Test
  public void noPivot() {
    int[] nums = new  int[]{2,3,4,5,6,7};
    assertEquals(0, target.findPivot(nums));
  }

  @Test
  public void testBasicSearch() {
    assertEquals(-1, target.search(new int[]{1}, 0));
    assertEquals(0, target.search(new int[]{1}, 1));
  }

  @Test
  public void testSimpleSearch() {
    assertEquals(2, target.search(new int[]{4,5,6,1,2}, 6));
  }

  @Test
  public void testTwoNumberSearch() {
    assertEquals(1, target.search(new int[]{1,3}, 3));
  }
}
