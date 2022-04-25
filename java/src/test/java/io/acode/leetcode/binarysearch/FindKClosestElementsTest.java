package io.acode.leetcode.binarysearch;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindKClosestElementsTest {
  FindKClosestElements target = new FindKClosestElements();

  @Test
  public void basicTest() {
    assertEquals(List.of(1, 2, 3, 4), target.findClosestElements(new int[]{1, 2, 3, 4}, 4, 1));
    assertEquals(List.of(1), target.findClosestElements(new int[]{1}, 1, 1));
  }

  @Test
  public void testSingularValue() {
    assertEquals(List.of(1), target.findClosestElements(new int[]{1, 2, 3}, 1, 1));
  }

  @Test
  public void testOneOffValue() {
    assertEquals(List.of(2), target.findClosestElements(new int[]{2, 3, 4}, 1, 1));
    assertEquals(List.of(4), target.findClosestElements(new int[]{1, 4, 5}, 1, 3));
    assertEquals(List.of(5), target.findClosestElements(new int[]{1, 4, 5}, 1, 8));
    assertEquals(List.of(1), target.findClosestElements(new int[]{1, 3, 5}, 1, 2));
  }

  @Test
  public void testTwoValues() {
    assertEquals(List.of(1, 2), target.findClosestElements(new int[]{1, 2, 3, 4, 5}, 2, 0));
    assertEquals(List.of(4, 5), target.findClosestElements(new int[]{1, 2, 3, 4, 5}, 2, 6));
    assertEquals(List.of(2, 3), target.findClosestElements(new int[]{1, 2, 3, 4, 5}, 2, 3));
  }

  @Test
  public void testLeet() {
    assertEquals(List.of(25), target.findClosestElements(new int[]{1, 10, 15, 25, 35, 45, 50, 59}, 1, 30));
  }

  @Test
  public void basicTestSliding() {
    assertEquals(List.of(1, 2, 3, 4), target.slidingWindowTechnique(new int[]{1, 2, 3, 4}, 4, 1));
    assertEquals(List.of(1), target.slidingWindowTechnique(new int[]{1}, 1, 1));
  }

  @Test
  public void testSingularValueSliding() {
    assertEquals(List.of(1), target.slidingWindowTechnique(new int[]{1, 2, 3}, 1, 1));
  }

  @Test
  public void testOneOffValueSliding() {
    assertEquals(List.of(2), target.slidingWindowTechnique(new int[]{2, 3, 4}, 1, 1));
    assertEquals(List.of(4), target.slidingWindowTechnique(new int[]{1, 4, 5}, 1, 3));
    assertEquals(List.of(5), target.slidingWindowTechnique(new int[]{1, 4, 5}, 1, 8));
    assertEquals(List.of(1), target.slidingWindowTechnique(new int[]{1, 3, 5}, 1, 2));
  }

  @Test
  public void testTwoValuesSliding() {
    assertEquals(List.of(1, 2), target.slidingWindowTechnique(new int[]{1, 2, 3, 4, 5}, 2, 0));
    assertEquals(List.of(4, 5), target.slidingWindowTechnique(new int[]{1, 2, 3, 4, 5}, 2, 6));
    assertEquals(List.of(2, 3), target.slidingWindowTechnique(new int[]{1, 2, 3, 4, 5}, 2, 3));
  }

  @Test
  public void testLeetSliding() {
    assertEquals(List.of(25), target.slidingWindowTechnique(new int[]{1, 10, 15, 25, 35, 45, 50, 59}, 1, 30));
  }
}
