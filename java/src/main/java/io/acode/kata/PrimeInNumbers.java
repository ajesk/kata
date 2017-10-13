package io.acode.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
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
        if (primes.isEmpty()) {
            primes.add(2);
            return;
        }
        primes.add(IntStream.range(primes.get(primes.size()-1) + 1, 10000)
            .filter(n -> n % 2 != 0 || n <= 2)
            .filter(n -> IntStream.range(3, n/2)
                .filter(i -> i % n == 0)
                .count() == 0)
            .findFirst()
            .getAsInt());
    }

    static boolean isPrime(int i) {
        return i >= 2 && IntStream.rangeClosed(2, (int) Math.sqrt(i))
                            .noneMatch(n -> (i % n == 0));
    }

    static String factor(Integer current, Integer count) {
        if (count == 1) {
            return "(" + current + ")";
        } else {
            return "(" + current + "**" + count + ")";
        }
    }

    static String factorString(List<Integer> divs) {
        Integer current = 0;
        int count = 0;
        String res = "";
        for (Integer div : divs) {
            if (!current.equals(div)) {
                if (!current.equals(0)) {
                    res += factor(current, count);
                    count = 0;
                }
                current = div;
                count++;
            } else {
                count++;
            }
        }
        return res + factor(current, count);
    }

    public static String factors(int n) {
        List<Integer> divs = new ArrayList<>();

        while (true) {
            Boolean divided = false;
            for (int prime: primes) {
                if (n % prime == 0 && !divided) {
                    divs.add(prime);
                    n /= prime;
                    divided = true;
                }
            }

            while (!divided) {
                nextPrime();
                int next = primes.get(primes.size() - 1);
                if (n % next == 0) {
                    divs.add(next);
                    n /= next;
                    divided = true;
                }
            }

            if (primes.contains(n)) {
                divs.add(n);
                break;
            }
        }
        return factorString(divs);
    }
}
