package io.acode.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
  BinarySearch target = new BinarySearch();

  @Test
  public void testBasic() {
    assertEquals(-1, target.search(new int[]{1,2,3}, 4));
  }

  @Test
  public void simpleSearch() {
    assertEquals(0, target.search(new int[]{1,2,3}, 1));
    assertEquals(1, target.search(new int[]{1,2,3}, 2));
    assertEquals(2, target.search(new int[]{1,2,3}, 3));
  }

  @Test
  public void testLargerValueSet() {
    assertEquals(3, target.search(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 4));
  }

  @Test
  public void testIterativeBasic() {
    assertEquals(-1, target.iterativeSearch(new int[]{1,2,3}, 4));
  }

  @Test
  public void simpleIterativeSearch() {
    assertEquals(0, target.iterativeSearch(new int[]{1,2,3}, 1));
    assertEquals(1, target.iterativeSearch(new int[]{1,2,3}, 2));
    assertEquals(2, target.iterativeSearch(new int[]{1,2,3}, 3));
  }

  @Test
  public void testIterativeLargerValueSet() {
    assertEquals(3, target.iterativeSearch(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 4));
  }

  @Test
  public void testRecursiveBasic() {
    assertEquals(-1, target.recursiveSearch(new int[]{1,2,3}, 4));
  }

  @Test
  public void simpleRecursiveSearch() {
    assertEquals(0, target.recursiveSearch(new int[]{1,2,3}, 1));
    assertEquals(1, target.recursiveSearch(new int[]{1,2,3}, 2));
    assertEquals(2, target.recursiveSearch(new int[]{1,2,3}, 3));
  }

  @Test
  public void testRecursiveLargerValueSet() {
    assertEquals(3, target.recursiveSearch(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 4));
  }
}
