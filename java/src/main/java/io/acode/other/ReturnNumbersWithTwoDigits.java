package io.acode.other;

import java.util.Arrays;

public class ReturnNumbersWithTwoDigits {

    boolean numDigitsEquals(int num, int digits) {
        return ((int) Math.log10(num) + 1) == digits;
    }

    int[] getNumbersWithTwoDigits(int[] numbers) {
        return Arrays.stream(numbers).filter(num -> numDigitsEquals(num, 2)).toArray();
    }
}
