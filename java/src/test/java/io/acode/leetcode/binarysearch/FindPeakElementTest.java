package io.acode.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeakElementTest {
  FindPeakElement target = new FindPeakElement();

  @Test
  public void testBasic() {
    assertEquals(1, target.findPeakElement(new int[]{1,2,1}));
  }

  @Test
  public void testLessBasic() {
    assertEquals(2, target.findPeakElement(new int[]{1,2,3,1}));
  }

  @Test
  public void testLeetExample() {
    assertEquals(5, target.findPeakElement(new int[]{1,2,1,3,5,6,4}));
  }

  @Test
  public void testEdgeCases() {
    assertEquals(0, target.findPeakElement(new int[]{2,1}));
    assertEquals(1, target.findPeakElement(new int[]{1,2}));
    assertEquals(0, target.findPeakElement(new int[]{6,5,4,3,2,3,2}));
    assertEquals(2, target.findPeakElement(new int[]{2,3,6}));
  }

  @Test
  public void testSimpleBasic() {
    assertEquals(1, target.findSimplerPeak(new int[]{1,2,1}));
  }

  @Test
  public void testLessBasicSimple() {
    assertEquals(2, target.findSimplerPeak(new int[]{1,2,3,1}));
  }

  @Test
  public void testLeetExampleSimpler() {
    assertEquals(5, target.findSimplerPeak(new int[]{1,2,1,3,5,6,4}));
  }

  @Test
  public void testEdgeCasesSimpler() {
    assertEquals(0, target.findSimplerPeak(new int[]{2,1}));
    assertEquals(1, target.findSimplerPeak(new int[]{1,2}));
    assertEquals(0, target.findSimplerPeak(new int[]{6,5,4,3,2,3,2}));
    assertEquals(2, target.findSimplerPeak(new int[]{2,3,6}));
  }
}
