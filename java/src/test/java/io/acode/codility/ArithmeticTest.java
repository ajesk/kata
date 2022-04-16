package io.acode.codility;

import io.acode.codility.Arithmetic;
import org.junit.Test;

import java.util.Arrays;

public class ArithmeticTest {

    Arithmetic arithmetic = new Arithmetic();
    int[] test = new int[] {-1, 1, 3, 3, 3, 2, 1, 0};

    @Test
    public void testGivenArray() {
        System.out.println(arithmetic.solution(test));
    }

    @Test
    public void getDiffs() {
        System.out.println(Arrays.toString(arithmetic.getDiffs(test).toArray()));
    }

    @Test
    public void getSlices() {
        System.out.println(arithmetic.countSlices(arithmetic.getDiffs(test)));
    }
}
