package io.acode.codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * "7777...8?!??!", exclaimed Bob, "I missed it again! Argh!" Every time there's an interesting number coming up, he
 * notices and then promptly forgets. Who doesn't like catching those one-off interesting mileage numbers?
 * Let's make it so Bob never misses another interesting number. We've hacked into his car's computer, and we have a
 * box hooked up that reads mileage numbers. We've got a box glued to his dash that lights up yellow or green depending
 * on whether it receives a 1 or a 2 (respectively).
 *
 * It's up to you, intrepid warrior, to glue the parts together. Write the function that parses the mileage number
 * input, and returns a 2 if the number is "interesting" (see below), a 1 if an interesting number occurs within the
 * next two miles, or a 0 if the number is not interesting.
 *
 * Note: In Haskell, we use No, Almost and Yes instead of 0, 1 and 2.
 *
 * "Interesting" Numbers
 *
 * Interesting numbers are 3-or-more digit numbers that meet one or more of the following criteria:
 *
 * Any digit followed by all zeros: 100, 90000
 * Every digit is the same number: 1111
 * The digits are sequential, incementing†: 1234
 * The digits are sequential, decrementing‡: 4321
 * The digits are a palindrome: 1221 or 73837
 * The digits match one of the values in the awesomePhrases array
 * † For incrementing sequences, 0 should come after 9, and not before 1, as in 7890.
 * ‡ For decrementing sequences, 0 should come after 1, and not before 9, as in 3210.
 * So, you should expect these inputs and outputs:
 *
 * Error Checking
 *
 * A number is only interesting if it is greater than 99!
 * Input will always be an integer greater than 0, and less than 1,000,000,000.
 * The awesomePhrases array will always be provided, and will always be an array, but may be empty. (Not everyone
 * thinks numbers spell funny words...)
 * You should only ever output 0, 1, or 2.
 */
public class InterestingNumbers {

    static boolean followedByZeroes(int number) {
        return number % 100 == 0;
    }

    static boolean allTheSame(int number) {
        return Integer.toString(number).matches("^([0-9])\\1*$");
    }

    static boolean isIncrementing(int number) {
       int n = number;
       int checkVal = -1;
        while (n > 0) {
            if (checkVal != (n % 10) + 1 && checkVal != -1) {
                if (!(checkVal == 0 && n % 10 == 9)) return false;
            }
            checkVal = n % 10;
            n = n / 10;
        }

        return true;
    }

    static boolean isDecrementing(int number) {
        int n = number;
        int checkVal = -1;
        while (n > 0) {
            if (checkVal != (n % 10) - 1 && checkVal != -1) {
                return false;
            }
            checkVal = n % 10;
            n = n / 10;
        }

        return true;
    }

    static boolean isPalindrome(int number) {
        return new StringBuilder(Integer.toString(number))
                .reverse()
                .toString()
                .equals(Integer.toString(number));

    }

    static boolean interestingNumber(int number, List<Integer> phrases) {
        return (number > 99 && number < 1000000000) &&
                (phrases.contains(number) ||
                isPalindrome(number) ||
                isDecrementing(number) ||
                isIncrementing(number) ||
                followedByZeroes(number) ||
                allTheSame(number));
    }

    public static int isInteresting(int number, int[] awesomePhrases) {
        System.out.println(number);
        System.out.println(Arrays.toString(awesomePhrases));

        List<Integer> phrases = Arrays.stream(awesomePhrases).boxed().collect(Collectors.toList());
        for (int i = number; i < number + 3; i++) {
            if (interestingNumber(i, phrases)) {
                if (i == number) return 2;
                else return 1;
            }
        }

        // if all else fails
        return 0;
    }
}
