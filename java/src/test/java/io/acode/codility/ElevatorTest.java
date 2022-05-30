package io.acode.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElevatorTest {
  Elevator elevator = new Elevator();

  @Test
  public void test1() {
    int[] weights = new int[]{60, 80, 40};
    int[] targetFloors = new int[]{2, 3, 5};
    int totalFloors = 5, capacity = 2, weightCap = 200;
    assertEquals(5, elevator.solution(weights, targetFloors, totalFloors, capacity, weightCap));
  }

  @Test
  public void test2() {
    int[] weights = new int[]{40, 40, 100, 80, 20};
    int[] targetFloors = new int[]{3, 3, 2, 2, 3};
    int totalFloors = 3, capacity = 5, weightCap = 200;
    assertEquals(6, elevator.solution(weights, targetFloors, totalFloors, capacity, weightCap));
  }

  @Test
  public void test3() {
    int[] weights = new int[]{40, 40, 100, 200, 20};
    int[] targetFloors = new int[]{3, 3, 2, 2, 3};
    int totalFloors = 3, capacity = 5, weightCap = 200;
    assertEquals(7, elevator.solution(weights, targetFloors, totalFloors, capacity, weightCap));
  }

  @Test
  public void test4() {
    int[] weights = new int[]{40, 40, 100, 200, 20};
    int[] targetFloors = new int[]{3, 3, 2, 2, 3};
    int totalFloors = 3, capacity = 1, weightCap = 200;
    assertEquals(10, elevator.solution(weights, targetFloors, totalFloors, capacity, weightCap));
  }
}
