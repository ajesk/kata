package io.acode.codewars;

import org.junit.jupiter.api.Test;

import static io.acode.codewars.BouncingBall.bouncingBall;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BouncingBallTest {
  @Test
  public void testBasic() {
    assertEquals(-1, bouncingBall(0, .4,1));
    assertEquals(-1, bouncingBall(10, 1,1));
    assertEquals(-1, bouncingBall(10, 0,1));
    assertEquals(-1, bouncingBall(10, .4,11));
    assertEquals(-1, bouncingBall(3, .75,3));
  }

  @Test
  public void test1() {
    assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
  }
  @Test
  public void test2() {
    assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
  }
}
