package io.acode.kata;

import java.util.stream.LongStream;

/**
 * Just wanted to make a functional solution for factorial computation
 */
public class Factorial {
    long factorial(int n) {
        if (n > 20) return -1;
        return LongStream.rangeClosed(2, n).reduce(1, (a, b) -> a * b);
    }
}
