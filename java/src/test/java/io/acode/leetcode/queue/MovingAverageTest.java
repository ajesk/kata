package io.acode.leetcode.queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovingAverageTest {

  public void assertDEquals(double d1, double d2) {
    assertEquals(d1, d2, 0.00001);
  }

  @Test
  public void testBasic() {
    MovingAverage test = new MovingAverage(1);
    assertDEquals(1, test.next(1));
    assertDEquals(2, test.next(2));
    assertDEquals(3, test.next(3));
  }

  @Test
  public void test2Values() {
    MovingAverage test = new MovingAverage(2);
    assertDEquals(1, test.next(1));
    assertDEquals(1.5, test.next(2));
    assertDEquals(2.5, test.next(3));
  }

  @Test
  public void test3Values() {
    MovingAverage test = new MovingAverage(3);
    assertDEquals(1, test.next(1));
    assertDEquals(2, test.next(3));
    assertDEquals(3, test.next(5));
    assertDEquals(3, test.next(1));
    assertDEquals(2.33333, test.next(1));
    assertDEquals(1, test.next(1));
  }
}