package io.acode.leetcode.graph;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class EvaluateDivisionTest {
  EvaluateDivision target = new EvaluateDivision();

  @Test
  public void testBasic() {
    assertArrayEquals(new double[]{1}, target.calcEquation(
      List.of(List.of("a", "a")),
      new double[]{1},
      List.of(List.of("a", "a"))
    ), 0.01);
  }

  @Test
  public void testSingleValEquationWithUnknownValues() {
    assertArrayEquals(new double[]{-1}, target.calcEquation(
      List.of(List.of("a", "a")),
      new double[]{1},
      List.of(List.of("a", "b"))
    ), 0.01);
  }

  @Test
  public void testDoubleValueEquation() {
    assertArrayEquals(new double[]{0.5, 2.0}, target.calcEquation(
      List.of(List.of("a", "b")),
      new double[]{0.5},
      List.of(List.of("a", "b"), List.of("b", "a"))
    ), 0.01);
  }

  @Test
  public void testThreeeValueEquation() {
    assertArrayEquals(new double[]{0.5, 2.0, 0.4}, target.calcEquation(
      List.of(List.of("a", "b"), List.of("b", "c")),
      new double[]{0.5, 2.5},
      List.of(List.of("a", "b"), List.of("b", "a"), List.of("c", "b"))
    ), 0.01);
  }

  @Test
  public void leetBasic() {
    assertArrayEquals(new double[]{6.0, 0.5, -1.0, 1.0, -1.0}, target.calcEquation(
      List.of(List.of("a", "b"), List.of("b", "c")),
      new double[]{2.0, 3.0},
      List.of(List.of("a", "c"), List.of("b", "a"), List.of("a", "e"), List.of("a", "a"), List.of("x", "x"))
    ), 0.01);
  }
}
