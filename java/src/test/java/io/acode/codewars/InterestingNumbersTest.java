package io.acode.codewars;

import io.acode.util.TestUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InterestingNumbersTest extends TestUtils {

  @Test
  public void testFollowedByZeroes() {
    assertTrue(InterestingNumbers.followedByZeroes(1000000));
    assertTrue(InterestingNumbers.followedByZeroes(600000));
    assertFalse(InterestingNumbers.followedByZeroes(1000001));
    assertFalse(InterestingNumbers.followedByZeroes(1234675432));
  }

  @Test
  public void testAllTheSame() {
    assertTrue(InterestingNumbers.allTheSame(111111));
    assertTrue(InterestingNumbers.allTheSame(555555));
    assertFalse(InterestingNumbers.allTheSame(1234567));
    assertFalse(InterestingNumbers.allTheSame(11111112));
  }

  @Test
  public void isIncrementing() {
    assertTrue(InterestingNumbers.isIncrementing(1234));
    assertTrue(InterestingNumbers.isIncrementing(7890));
    assertFalse(InterestingNumbers.isIncrementing(1235));
    assertFalse(InterestingNumbers.isIncrementing(98765432));
    assertFalse(InterestingNumbers.isIncrementing(9999997));
  }

  @Test
  public void testIsDecrementing() {
    assertTrue(InterestingNumbers.isDecrementing(9876));
    assertTrue(InterestingNumbers.isDecrementing(3210));
    assertFalse(InterestingNumbers.isDecrementing(1234));
    assertFalse(InterestingNumbers.isDecrementing(2464));
  }

  @Test
  public void testIsPalindrome() {
    assertTrue(InterestingNumbers.isPalindrome(12321));
    assertTrue(InterestingNumbers.isPalindrome(234432));
    assertFalse(InterestingNumbers.isPalindrome(1010101010));
    assertFalse(InterestingNumbers.isPalindrome(7654322));
  }

  @Test
  public void testOutOfBounds() {
    assertEquals(1, InterestingNumbers.isInteresting(99, new int[]{}));
    assertEquals(0, InterestingNumbers.isInteresting(1000000000, new int[]{}));
  }

  @Test
  public void testIsMatchingNumber() {
    List<Integer> coolNumberBro = new ArrayList<>();
    coolNumberBro.add(256);
    coolNumberBro.add(1337);
    assertTrue(InterestingNumbers.interestingNumber(256, coolNumberBro));
    assertTrue(InterestingNumbers.interestingNumber(1337, coolNumberBro));
    assertFalse(InterestingNumbers.interestingNumber(34854, coolNumberBro));
  }

  @Test
  public void testIsInteresting() {
    assertEquals(0, InterestingNumbers.isInteresting(3, new int[]{1337, 256}));
    assertEquals(1, InterestingNumbers.isInteresting(1336, new int[]{1337, 256}));
    assertEquals(2, InterestingNumbers.isInteresting(1337, new int[]{1337, 256}));
    assertEquals(0, InterestingNumbers.isInteresting(11208, new int[]{1337, 256}));
    assertEquals(1, InterestingNumbers.isInteresting(11209, new int[]{1337, 256}));
    assertEquals(2, InterestingNumbers.isInteresting(11211, new int[]{1337, 256}));
  }

  @Test
  public void testCWValues() {
    assertEquals(1, InterestingNumbers.isInteresting(109, new int[]{}));
    assertEquals(1, InterestingNumbers.isInteresting(110, new int[]{}));
    assertEquals(1, InterestingNumbers.isInteresting(442, new int[]{}));
    assertEquals(1, InterestingNumbers.isInteresting(9999997, new int[]{}));
    assertEquals(1, InterestingNumbers.isInteresting(119, new int[]{}));
    assertEquals(1, InterestingNumbers.isInteresting(120, new int[]{}));
  }
}
