package io.acode.codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ValidateCreditCardTest {

  @Test
  public void testDoubleUp() {
    List<Integer> start = Arrays.asList(1, 2, 3);
    List<Integer> end = ValidateCreditCard.doubleUp(start);
    assertEquals(1, end.get(0).intValue());
    assertEquals(4, end.get(1).intValue());
    assertEquals(3, end.get(2).intValue());
  }

  @Test
  public void testInvalid() {
    assertFalse(ValidateCreditCard.validate("891"));
    assertFalse(ValidateCreditCard.validate("123"));
    assertFalse(ValidateCreditCard.validate("922030"));
    assertFalse(ValidateCreditCard.validate("8675309"));
    assertFalse(ValidateCreditCard.validate("92"));
    assertFalse(ValidateCreditCard.validate("1"));
  }

  @Test
  public void testValid() {
    assertTrue(ValidateCreditCard.validate("91"));
    assertTrue(ValidateCreditCard.validate("26"));
    assertTrue(ValidateCreditCard.validate("2121"));
    assertTrue(ValidateCreditCard.validate("2626262626262626"));
    assertTrue(ValidateCreditCard.validate("912030"));
    assertTrue(ValidateCreditCard.validate("1230"));
    assertTrue(ValidateCreditCard.validate("4111111111111111"));
  }
}
