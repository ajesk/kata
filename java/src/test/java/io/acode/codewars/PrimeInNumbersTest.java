package io.acode.codewars;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrimeInNumbersTest {

  @Test
  public void factorStringTest() {
    assertEquals("(2**4)", PrimeInNumbers.factorString(2, 4));
    assertEquals("(2)", PrimeInNumbers.factorString(2, 1));
    assertEquals("(2**2)", PrimeInNumbers.factorString(2, 2));
    assertEquals("(4**3)", PrimeInNumbers.factorString(4, 3));

  }

  @Test
  public void decompStringTest() {
    Integer[] ints = {3, 2, 2, 5, 2, 5, 5};
    List<Integer> integers = new ArrayList<>();
    integers.addAll(Arrays.asList(ints));

    String factors = PrimeInNumbers.factorDecompString(integers);
    System.out.println(factors);
    assertEquals("(3)(2**2)(5)(2)(5**2)", factors);
  }

  @Test
  public void isPrime() {
    assertTrue(PrimeInNumbers.isPrime(2));
    assertTrue(PrimeInNumbers.isPrime(3));
    assertTrue(PrimeInNumbers.isPrime(5));
    assertTrue(PrimeInNumbers.isPrime(7));
    assertTrue(PrimeInNumbers.isPrime(17));
    assertTrue(PrimeInNumbers.isPrime(37));
  }

  @Test
  public void factorsTest() {
    assertEquals("(7)(11)", PrimeInNumbers.factors(77));
    assertEquals("(2**2)(3**3)(5)(7)(11**2)(17)", PrimeInNumbers.factors(7775460));
    assertEquals("(7537)(123863)", PrimeInNumbers.factors(933555431));
    assertEquals("(7919)", PrimeInNumbers.factors(7919));
    assertEquals("(3)(17**2)(31)(677)", PrimeInNumbers.factors(18195729));
  }
}
