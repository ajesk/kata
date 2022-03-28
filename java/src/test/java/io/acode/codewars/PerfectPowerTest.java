package io.acode.codewars;

import org.junit.Test;

import static io.acode.codewars.PerfectPower.isPerfectPower;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PerfectPowerTest {
  @Test
  public void baseShouldReturnFalse() {
    assertNull(isPerfectPower(5));
  }

  @Test
  public void testBasic() {
    assertEquals(new int[]{2, 2}, isPerfectPower(4));
  }
}
