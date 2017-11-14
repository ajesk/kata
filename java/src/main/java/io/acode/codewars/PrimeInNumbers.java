package io.acode.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeInNumbers {

    static boolean isPrime(int i) {
        return i >= 2 && IntStream.rangeClosed(2, (int) Math.sqrt(i))
                .noneMatch(n -> (i % n == 0));
    }

    static String factorString(Integer current, Integer count) {
        if (count == 1) {
            return "(" + current + ")";
        } else {
            return "(" + current + "**" + count + ")";
        }
    }

    static String factorDecompString(List<Integer> divs) {
        Integer current = 0;
        int count = 0;
        String res = "";
        for (Integer div : divs) {
            if (!current.equals(div)) {
                if (!current.equals(0)) {
                    res += factorString(current, count);
                    count = 0;
                }
                current = div;
                count++;
            } else {
                count++;
            }
        }
        return res + factorString(current, count);
    }

    public static String factors(int n) {
        List<Integer> divs = new ArrayList<>();
        int currentValue = n;

        while (!isPrime(currentValue)) {
            for (int i = 1; i < currentValue / 2; i++) {
                if (currentValue % i == 0 && isPrime(i)) {
                    divs.add(i);
                    currentValue /= i;
                    break;
                }
            }
        }
        divs.add(currentValue);

        return factorDecompString(divs);
    }
}
