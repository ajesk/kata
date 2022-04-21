package io.acode.codewars;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;
import java.util.Map;

public class RainfallTest extends RainfallTestData {

  private void assertFuzzyEquals(double act, double exp) {
    if (!(Math.abs(act - exp) <= 1e-2)) {
      System.out.println("abs(actual - expected) must be <= 1e-2. Expected was " + exp + ", but got " + act);
    }
    assertEquals(exp, act, 1e-2);
  }

  @Test
  public void testCityBreakdownData() {
    Map<String, List<String>> breakdown = Rainfall.cityBreakdown(data);
    assertEquals(10, breakdown.size());
    breakdown.values().forEach(values ->
      assertEquals(12, values.size())
    );
  }

  @Test
  public void testCityBreakdownData1() {
    Map<String, List<String>> breakdown = Rainfall.cityBreakdown(data1);
    assertEquals(10, breakdown.size());
    breakdown.values().forEach(values ->
      assertEquals(12, values.size())
    );
  }

  @Test
  public void testMean() {
    assertFuzzyEquals(Rainfall.mean("London", data), 51.199999999999996);
    assertFuzzyEquals(Rainfall.mean("Beijing", data), 52.416666666666664);
  }

  @Test
  public void testVariance() {
    assertFuzzyEquals(Rainfall.variance("London", data), 57.42833333333374);
    assertFuzzyEquals(Rainfall.variance("Beijing", data), 4808.37138888889);
  }
}
