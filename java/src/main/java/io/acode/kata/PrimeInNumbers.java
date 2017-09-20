package io.acode.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :

 "(p1**n1)(p2**n2)...(pk**nk)"
 with the p(i) in increasing order and n(i) empty if n(i) is 1.

 Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
 */
public class PrimeInNumbers {
    static List<Integer> primes = new ArrayList<>();
    static void nextPrime() {
        primes.add(IntStream.range(primes.get(primes.size()-1), 10000)
            .filter(n -> n % 2 != 0 || n == 2)
            .filter(n -> IntStream.range(3, n/2)
                .filter(i -> i % n == 0)
                .count() == 0)
            .findFirst()
            .getAsInt());
    }

    public static String factors(int n) {
        List<Integer> divs = new ArrayList<>();
        boolean working = true;
        while (working) {

        }
        return "";

    }
}
