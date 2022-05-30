package io.acode.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

  @Test
  public void testFactorial() {
    Factorial factor = new Factorial();
    assertEquals(1, factor.factorial(1));
    assertEquals(2, factor.factorial(2));
    assertEquals(6, factor.factorial(3));
    assertEquals(24, factor.factorial(4));
    assertEquals(120, factor.factorial(5));
    assertEquals(720, factor.factorial(6));
    assertEquals(5040, factor.factorial(7));
    assertEquals(40320, factor.factorial(8));
    assertEquals(362880, factor.factorial(9));
    assertEquals(3628800, factor.factorial(10));
    assertEquals(39916800, factor.factorial(11));
    assertEquals(479001600, factor.factorial(12));
    assertEquals(-1, factor.factorial(21));
  }
}
