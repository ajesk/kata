package io.acode.codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbersByStrings {
    static String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    static String[] teens = {
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static int[] getDigits(int number) {
        int[] digits = new int[String.valueOf(number).length()];
        int index = 0;
        while (number > 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }
        return digits;
    }

    private static String stringify(int number) {
        StringBuilder spot = new StringBuilder();
        int index = 0;
        int[] digits = getDigits(number);
        for (int digit : digits) {
            if (index == 0) {
                spot = new StringBuilder(nums[digit]);
            } else if (index == 1) {
                if (digits[0] == 0) spot = new StringBuilder();
                if (digit == 1) {
                    spot = new StringBuilder(teens[digits[0]]);
                } else if (digit != 0) {
                    spot.insert(0, tens[digit - 2] + " ");
                }
            } else {
                spot.insert(0, nums[digit] + " hundred ");
            }
            index++;
        }
        return spot.toString();
    }

    public static int[] convertIntegers(List<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integers.get(i);
        }
        return ret;
    }

    public static int[] sort(final int[] array) {
        System.out.println(Arrays.toString(array));
        List<String> strings = Arrays.stream(array)
                .boxed().map(SortNumbersByStrings::stringify).sorted().collect(Collectors.toList());
        System.out.println(strings);
        int[] out = convertIntegers(Arrays.stream(array)
                .boxed()
                .sorted(Comparator.comparing(SortNumbersByStrings::stringify))
                .collect(Collectors.toList()));
        System.out.println(Arrays.toString(out));
        return convertIntegers(Arrays.stream(array)
                .boxed()
                .sorted(Comparator.comparing(SortNumbersByStrings::stringify))
                .collect(Collectors.toList()));
    }
}
