package io.acode.codility;

import io.acode.codility.Elevator;
import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;


public class ElevatorTest {
    Elevator elevator = new Elevator();

    @Test
    public void test1() {
        int[] weights = new int[] {60, 80, 40};
        int[] targetFloors = new int[] {2, 3, 5};
        int totalFloors = 5, capacity = 2, weightCap = 200;
        assertThat(elevator.solution(weights, targetFloors, totalFloors, capacity, weightCap)).isEqualTo(5);
    }

    @Test
    public void test2() {
        int[] weights = new int[] {40, 40, 100, 80, 20};
        int[] targetFloors = new int[] {3, 3, 2, 2, 3};
        int totalFloors = 3, capacity = 5, weightCap = 200;
        assertThat(elevator.solution(weights, targetFloors, totalFloors, capacity, weightCap)).isEqualTo(6);
    }

    @Test
    public void test3() {
        int[] weights = new int[] {40, 40, 100, 200, 20};
        int[] targetFloors = new int[] {3, 3, 2, 2, 3};
        int totalFloors = 3, capacity = 5, weightCap = 200;
        assertThat(elevator.solution(weights, targetFloors, totalFloors, capacity, weightCap)).isEqualTo(7);
    }

    @Test
    public void test4() {
        int[] weights = new int[] {40, 40, 100, 200, 20};
        int[] targetFloors = new int[] {3, 3, 2, 2, 3};
        int totalFloors = 3, capacity = 1, weightCap = 200;
        assertThat(elevator.solution(weights, targetFloors, totalFloors, capacity, weightCap)).isEqualTo(10);
    }
}
