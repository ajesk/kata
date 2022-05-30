package io.acode.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepUpTest {
  StepUp su = new StepUp();

  @Test
  public void testBasicNumbers() {
    assertEquals(1, su.calculateMoves(1));
    assertEquals(2, su.calculateMoves(2));
  }

  @Test
  public void testComplexMoves() {
    assertEquals(3,su.calculateMoves(3));
    assertEquals(5,su.calculateMoves(4));
    assertEquals(8,su.calculateMoves(5));
    assertEquals(13, su.calculateMoves(6));
  }
}
