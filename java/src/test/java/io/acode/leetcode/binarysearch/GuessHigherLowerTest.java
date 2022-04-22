package io.acode.leetcode.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessHigherLowerTest {
  GuessHigherLower target = new GuessHigherLower();

  @Test
  public void testGuess() {
    target.setPick(15);

    assertEquals(-1, target.guess(16));
    assertEquals(1, target.guess(14));
    assertEquals(0, target.guess(15));
  }

  @Test
  public void testBasic() {
    target.setPick(1);
    assertEquals(1, target.guessNumber(1));
  }

  @Test
  public void testTwoNumbers() {
    target.setPick(2);
    assertEquals(2, target.guessNumber(2));
    target.setPick(1);
    assertEquals(1, target.guessNumber(2));
  }

  @Test
  public void test3Numbers() {
    target.setPick(1);
    assertEquals(1, target.guessNumber(3));
    target.setPick(2);
    assertEquals(2, target.guessNumber(3));
    target.setPick(3);
    assertEquals(3, target.guessNumber(3));
  }

  @Test
  public void testLargeSet() {
    target.setPick(400);
    assertEquals(400, target.guessNumber(1000));
  }

  @Test
  public void testInsaneBullshit() {
    target.setPick(1702766719);
    assertEquals(1702766719,target.guessNumber(2126753390));
  }
}
