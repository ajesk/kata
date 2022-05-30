package io.acode.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
