package io.acode.other;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class ReturnNumbersWithTwoDigitsTest {

    ReturnNumbersWithTwoDigits digits = new ReturnNumbersWithTwoDigits();

    @Test
    public void numberOfDigitsShouldReturnNumberOfDigits() {
        assertTrue(digits.numDigitsEquals(2, 1));
        assertTrue(digits.numDigitsEquals(22, 2));
        assertTrue(digits.numDigitsEquals(44444, 5));
        assertTrue(digits.numDigitsEquals(244444444, 9));
        assertTrue(digits.numDigitsEquals(24, 2));
    }

    int[] test1 = {100, 10, 22, 33, 1, 222, 1000};
    int[] test2 = {911, 311, 222, 333, 1, 9999, 0};
    int[] test3 = {91, 31, 22, 33, 12, 99, 22};
    int[] test4 = {03};
    int[] result1 = {10, 22, 33};
    int[] result2 = {};

    @Test
    public void arrayShouldReturnAllResultsWithTwoDigits() {
        assertTrue(Arrays.equals(result1, digits.getNumbersWithTwoDigits(test1)));
        assertTrue(Arrays.equals(result2, digits.getNumbersWithTwoDigits(test2)));
        assertTrue(Arrays.equals(test3, digits.getNumbersWithTwoDigits(test3)));
        assertTrue(Arrays.equals(result2, digits.getNumbersWithTwoDigits(test4)));
    }
}
