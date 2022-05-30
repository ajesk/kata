package io.acode.codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadribonacciTest {
    Quadribonacci qb = new Quadribonacci();
    private final double[] test1 = {1,1,1,1};
    private final double[] test2 = {0,0,0,0,1};
    private final double[] test3 = {1,0,0,0,0,0,1};
    private final double[] test4 = {1,1};
    private final double[] solution1 = {1,1,1,1,4,7,13,25,49,94};
    private final double[] solution2 = {0,0,0,0,1,1,2,4,8,16};
    private final double[] solution3 = {1,0,0,0,0,0,1,2,3,6};
    private final double[] solution4 = {1,1,2,3,5,8,13,21,34,55};


    @Test
    public void testXbonacci() {
        assertEquals(Arrays.toString(solution1), Arrays.toString(qb.xbonacci(test1, 10)));
        assertEquals(Arrays.toString(solution2), Arrays.toString(qb.xbonacci(test2, 10)));
        assertEquals(Arrays.toString(solution3), Arrays.toString(qb.xbonacci(test3, 10)));
        assertEquals(Arrays.toString(solution4), Arrays.toString(qb.xbonacci(test4, 10)));
    }
}
