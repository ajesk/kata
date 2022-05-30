package io.acode.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SearchRangeTest {
  SearchRange target = new SearchRange();

  @Test
  public void testBasic() {
    assertArrayEquals(new int[]{-1, -1}, target.searchRange(new int[]{}, 3));
    assertArrayEquals(new int[]{0, 0}, target.searchRange(new int[]{1}, 1));
    assertArrayEquals(new int[]{-1, -1}, target.searchRange(new int[]{1}, 0));
  }

  @Test
  public void testNotFound() {
    assertArrayEquals(new int[]{-1, -1}, target.searchRange(new int[]{1, 2, 3, 4, 5, 6}, 20));
  }

  @Test
  public void testBasicRange() {
    assertArrayEquals(new int[]{1, 2}, target.searchRange(new int[]{1, 2, 2, 3}, 2));
  }

  @Test
  public void assertLargeRange() {
    assertArrayEquals(new int[]{1, 9}, target.searchRange(new int[]{0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10}, 5));
  }

  @Test
  public void testRangeOnEnd() {
    assertArrayEquals(new int[]{2, 3}, target.searchRange(new int[]{1, 2, 3, 3}, 3));
  }

  @Test
  public void testRangeOnBeginning() {
    assertArrayEquals(new int[]{0, 1}, target.searchRange(new int[]{1, 1, 3, 3}, 1));
  }

  @Test
  public void testOnlyNot() {
    assertArrayEquals(new int[]{-1,-1}, target.searchRange(new int[]{2,2}, 1));
  }

  @Test
  public void testOnlyVal() {
    assertArrayEquals(new int[]{0, 1}, target.searchRange(new int[]{2, 2}, 2));
  }
}
