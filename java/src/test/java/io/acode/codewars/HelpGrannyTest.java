package io.acode.codewars;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpGrannyTest {
  @Test
  public void verifyCompile() {
    assertEquals(0, HelpGranny.tour(new String[]{}, new String[][]{}, new HashMap<>()));
  }

  @Test
  public void distanceCalculatedShouldBeTheDistanceToOneLocationAndBack() {
    String[][] towns = {{"A1", "X1"}};
    assertEquals(2, HelpGranny.tour(new String[]{"A1"}, towns, Collections.singletonMap("X1", 1.0)));
  }

  @Test
  public void distanceShouldBeTheSumOfTheFirstAndLastLocationPlusTheDistanceBetweenThem() {
    String[][] towns = {{"A1", "X1"}, {"A2", "X2"}};
    Map<String, Double> townsDistance = new HashMap<String, Double>() {{
     put("X1", 1.0);
     put("X2", 2.0);
    }};

    assertEquals(4, HelpGranny.tour(new String[]{"A1", "A2"}, towns, townsDistance));
  }

  @Test
  public void distanceShouldBeTheSumOfTheFirstAndLastLocationPlusTheDistanceBetweenMultipleLocations() {
    String[][] towns = {{"A1", "X1"}, {"A2", "X2"}, {"A3", "X3"}};
    Map<String, Double> townsDistance = new HashMap<String, Double>() {{
      put("X1", 1.0);
      put("X2", 2.0);
      put("X3", 3.0);
    }};

    assertEquals(7, HelpGranny.tour(new String[]{"A1", "A2", "A3"}, towns, townsDistance));
  }

  @Test
  public void distanceShouldBeNothingIfSingleAddressNotFound() {
    assertEquals(0, HelpGranny.tour(new String[]{"A1"}, new String[][]{}, Collections.singletonMap("X1", 1.0)));
  }

  @Test
  public void test1() {
    String[] friends1 = new String[] { "A1", "A2", "A3", "A4", "A5" };
    String[][] fTowns1 = { new String[] {"A1", "X1"}, new String[] {"A2", "X2"}, new String[] {"A3", "X3"},
      new String[] {"A4", "X4"} };
    Map<String, Double> distTable1 = new HashMap<String, Double>();
    distTable1.put("X1", 100.0); distTable1.put("X2", 200.0); distTable1.put("X3", 250.0);
    distTable1.put("X4", 300.0);
    assertEquals(889, HelpGranny.tour(friends1, fTowns1, distTable1));
  }
}
