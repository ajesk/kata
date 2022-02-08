package io.acode.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCountTest {
  @Test
  public void testRun() {
    assertEquals(5, VowelCount.getCount("aeiougggg"));
  }

  @Test
  public void testEmpty() {
    assertEquals(0, VowelCount.getCount(""));
  }
}
