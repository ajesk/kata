package io.acode.codewars;

import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

public class QuadribonacciTest {
    Quadribonacci qb = new Quadribonacci();
    private double[] test1 = {1,1,1,1},
        test2 = {0,0,0,0,1},
        test3 = {1,0,0,0,0,0,1},
        test4 = {1,1},
        solution1 = {1,1,1,1,4,7,13,25,49,94},
        solution2 = {0,0,0,0,1,1,2,4,8,16},
        solution3 = {1,0,0,0,0,0,1,2,3,6},
        solution4 = {1,1,2,3,5,8,13,21,34,55};


    @Test
    public void testXbonacci() {
        assertThat(qb.xbonacci(test1, 10)).isEqualTo(solution1);
        assertThat(qb.xbonacci(test2, 10)).isEqualTo(solution2);
        assertThat(qb.xbonacci(test3, 10)).isEqualTo(solution3);
        assertThat(qb.xbonacci(test4, 10)).isEqualTo(solution4);

    }
}
