package io.acode.codewars;

import io.acode.util.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HammingTest extends TestUtils {

  @Test
  public void testHamming() {
    assertEquals(1, Hamming.hamming(1));
    assertEquals(2, Hamming.hamming(2));

  }

  @Test
  public void testDividend() {
    assertEquals(1, Hamming.dividends(2, 2));
    assertEquals(3, Hamming.dividends(15, 5));
  }
}
