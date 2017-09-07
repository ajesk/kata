package io.acode.kata;

import java.util.*;
import java.util.stream.IntStream;

/**
 * If you have completed the Tribonacci sequence kata, you would know by now that mister Fibonacci has at least a
 * bigger brother. If not, give it a quick look to get how things work.
 *
 * Well, time to expand the family a little more: think of a Quadribonacci starting with a signature of 4 elements and
 * each following element is the sum of the 4 previous, a Pentabonacci (well Cinquebonacci would probably sound a bit
 * more italian, but it would also sound really awful) with a signature of 5 elements and each following element is the
 * sum of the 5 previous, and so on.
 *
 * Well, guess what? You have to build a Xbonacci function that takes a signature of X elements - and remember each
 * next element is the sum of the last X elements - and returns the first n elements of the so seeded sequence.
 *
 * xbonacci {1,1,1,1} 10 = {1,1,1,1,4,7,13,25,49,94}
 * xbonacci {0,0,0,0,1} 10 = {0,0,0,0,1,1,2,4,8,16}
 * xbonacci {1,0,0,0,0,0,1} 10 = {1,0,0,0,0,0,1,2,3,6}
 * xbonacci {1,1} produces the Fibonacci sequence
 */
public class Quadribonacci {
    public double[] xbonacci(double[] signature, int n) {
        double[] res = Arrays.copyOf(signature, n);
        IntStream.range(signature.length, n)
            .forEach(index ->
                    res[index] = Arrays.stream(res)
                    .skip(index-signature.length)
                    .limit(signature.length)
                    .sum());
        return res;
    }
}
