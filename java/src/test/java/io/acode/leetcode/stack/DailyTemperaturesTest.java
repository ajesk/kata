package io.acode.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DailyTemperaturesTest {
  DailyTemperatures target = new DailyTemperatures();

  @Test
  public void testBasic() {
    assertArrayEquals(new int[]{0}, target.dailyTemperatures(new int[]{42}));
  }

  @Test
  public void testAllDecline() {
    assertArrayEquals(new int[]{0,0}, target.dailyTemperatures(new int[]{2,1}));
  }

  @Test
  public void testAllIncline() {
    assertArrayEquals(new int[]{1,1,1,0}, target.dailyTemperatures(new int[]{1,2,3,4}));
  }

  @Test
  public void testLastIsOnlyIncrease() {
    assertArrayEquals(new int[]{4,3,2,1,0}, target.dailyTemperatures(new int[]{9,8,7,6,10}));
  }

  @Test
  public void testLeetScenario() {
    assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, target.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}));
    assertArrayEquals(new int[]{1,1,1,0}, target.dailyTemperatures(new int[]{30,40,50,60}));
    assertArrayEquals(new int[]{1,1,0}, target.dailyTemperatures(new int[]{30,60,90}));
  }
}
