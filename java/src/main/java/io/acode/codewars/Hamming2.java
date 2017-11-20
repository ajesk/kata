package io.acode.codewars;

import java.util.PriorityQueue;

/**
 * A Hamming number is a positive integer of the form 2i3j5k, for some non-negative integers i, j, and k.
 *
 * Write a function that computes the nth smallest Hamming number.
 *
 * Specifically:
 *
 * The first smallest Hamming number is 1 = 203050
 * The second smallest Hamming number is 2 = 213050
 * The third smallest Hamming number is 3 = 203150
 * The fourth smallest Hamming number is 4 = 223050
 * The fifth smallest Hamming number is 5 = 203051
 * The 20 smallest Hamming numbers are given in example test fixture.
 *
 * Your code should be able to compute all of the smallest 5,000 (Clojure: 2000) Hamming numbers without timing out.
 */
public class Hamming2 {
    private static PriorityQueue<Integer> checks = new PriorityQueue<>();

    static int dividends(int n, int dividend) {
        return n >= dividend ? n / dividend : 0;
    }

    public static long hamming(int n) {
        int fives = dividends(n, 5);
        n = n > 0 ? n % 5 : n;
        int threes = dividends(n, 3);
        n = n > 0 ? n % 3 : n;
        int twos = dividends(n, 2);
        return (long)(Math.pow(2, twos)*Math.pow(3, threes)*Math.pow(5, fives));
    }
}
