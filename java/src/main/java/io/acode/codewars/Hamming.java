package io.acode.codewars;

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
public class Hamming {
    public int getDividens(int n, int dividend) {
        int ret = 0;
        if (n >= dividend) {
            ret = n % dividend;
            n /= dividend;
        }
        return ret;
    }

    public static long hamming(int n) {
        // TODO: Program me

        int fives = n >= 5 ? n % 5 : 0;
        n /= 5;
        int threes = n >= 3 ? n % 3 : 0;
        n /= 3;
        int twos = n >= 2 ? n % 2 : 0;
        return (2^twos)*(3^threes)*(5^fives);
    }
}
