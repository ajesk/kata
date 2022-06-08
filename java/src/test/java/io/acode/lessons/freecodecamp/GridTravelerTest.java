package io.acode.lessons.freecodecamp;

import io.acode.lessons.freecodecamp.GridTraveler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GridTravelerTest {
  GridTraveler target = new GridTraveler();

  @Test
  void testSimple() {
    assertEquals(1, target.gridTraveler(1,1));
    assertEquals(1, target.gridTraveler(3,1));
    assertEquals(1, target.gridTraveler(1,4));
    assertEquals(0, target.gridTraveler(0,1));
    assertEquals(0, target.gridTraveler(1,0));
  }

  @Test
  void test3By2() {
    assertEquals(3, target.gridTraveler(3, 2));
    assertEquals(3, target.gridTraveler(2, 3));
  }

  @Test
  void testSquare() {
    assertEquals(2, target.gridTraveler(2,2));
    assertEquals(6, target.gridTraveler(3,3));
    assertEquals(5430134, target.gridTraveler(15,15));
  }
}
