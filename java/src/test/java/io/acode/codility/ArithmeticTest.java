package io.acode.codility;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ArithmeticTest {

    Arithmetic arithmetic = new Arithmetic();
    int[] test = new int[] {-1, 1, 3, 3, 3, 2, 1, 0};

    @Test
    void testGivenArray() {
        System.out.println(arithmetic.solution(test));
    }

    @Test
    void getDiffs() {
        System.out.println(Arrays.toString(arithmetic.getDiffs(test).toArray()));
    }

    @Test
    void getSlices() {
        System.out.println(arithmetic.countSlices(arithmetic.getDiffs(test)));
    }
}
