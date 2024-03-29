package io.acode.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LargeFactorialTest {

  @Test
  void testFactorial() {
    assertEquals("1",LargeFactorial.Factorial(1));
    assertEquals("2",LargeFactorial.Factorial(2));
    assertEquals("6",LargeFactorial.Factorial(3));
    assertEquals("24",LargeFactorial.Factorial(4));
    assertEquals("120",LargeFactorial.Factorial(5));
    assertEquals("362880",LargeFactorial.Factorial(9));
  }

  @Test
  void testBigFactorial() {
    assertEquals("1307674368000", LargeFactorial.Factorial(15));
    assertEquals("15511210043330985984000000", LargeFactorial.Factorial(25));
  }

  @Test
  void testNegatives() {
    assertNull(LargeFactorial.Factorial(-1));
    assertNull(LargeFactorial.Factorial(-10));
  }
}
