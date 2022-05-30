package io.acode.codewars;

import org.junit.jupiter.api.Test;

import static io.acode.codewars.FindTheUniqueNumber.findUniq;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheUniqueNumberTest {
  private final double precision = 0.0000000000001;

  @Test
  public void testBasic() {
    assertEquals(1, findUniq(new double[]{0, 1, 0}), precision);
    assertEquals(2, findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
  }
}
