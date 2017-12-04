package io.acode.codewars;

import static com.google.common.truth.Truth.assertThat;

import io.acode.util.TestUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InterestingNumbersTest extends TestUtils {

    @Test
    public void testFollowedByZeroes() {
        assertThat(InterestingNumbers.followedByZeroes(1000000)).isTrue();
        assertThat(InterestingNumbers.followedByZeroes(600000)).isTrue();
        assertThat(InterestingNumbers.followedByZeroes(1000001)).isFalse();
        assertThat(InterestingNumbers.followedByZeroes(1234675432)).isFalse();
    }

    @Test
    public void testAllTheSame() {
        assertThat(InterestingNumbers.allTheSame(111111)).isTrue();
        assertThat(InterestingNumbers.allTheSame(555555)).isTrue();
        assertThat(InterestingNumbers.allTheSame(1234567)).isFalse();
        assertThat(InterestingNumbers.allTheSame(11111112)).isFalse();
    }

    @Test
    public void isIncrementing() {
        assertThat(InterestingNumbers.isIncrementing(1234)).isTrue();
        assertThat(InterestingNumbers.isIncrementing(7890)).isTrue();
        assertThat(InterestingNumbers.isIncrementing(1235)).isFalse();
        assertThat(InterestingNumbers.isIncrementing(98765432)).isFalse();
        assertThat(InterestingNumbers.isIncrementing(9999997)).isFalse();
    }

    @Test
    public void testIsDecrementing() {
        assertThat(InterestingNumbers.isDecrementing(9876)).isTrue();
        assertThat(InterestingNumbers.isDecrementing(3210)).isTrue();
        assertThat(InterestingNumbers.isDecrementing(1234)).isFalse();
        assertThat(InterestingNumbers.isDecrementing(2464)).isFalse();
    }

    @Test
    public void testIsPalindrome() {
        assertThat(InterestingNumbers.isPalindrome(12321)).isTrue();
        assertThat(InterestingNumbers.isPalindrome(234432)).isTrue();
        assertThat(InterestingNumbers.isPalindrome(1010101010)).isFalse();
        assertThat(InterestingNumbers.isPalindrome(7654322)).isFalse();
    }

    @Test
    public void testOutOfBounds() {
        assertThat(InterestingNumbers.isInteresting(99, new int[]{})).isEqualTo(1);
        assertThat(InterestingNumbers.isInteresting(1000000000, new int[]{})).isEqualTo(0);
    }

    @Test
    public void testIsMatchingNumber() {
        List<Integer> coolNumberBro = new ArrayList<>();
        coolNumberBro.add(256);
        coolNumberBro.add(1337);
        assertThat(InterestingNumbers.interestingNumber(256, coolNumberBro)).isTrue();
        assertThat(InterestingNumbers.interestingNumber(1337, coolNumberBro)).isTrue();
        assertThat(InterestingNumbers.interestingNumber(34854, coolNumberBro)).isFalse();
    }

    @Test
    public void testIsInteresting() {
        assertThat(InterestingNumbers.isInteresting(3, new int[]{1337, 256})).isEqualTo(0);
        assertThat(InterestingNumbers.isInteresting(1336, new int[]{1337, 256})).isEqualTo(1);
        assertThat(InterestingNumbers.isInteresting(1337, new int[]{1337, 256})).isEqualTo(2);
        assertThat(InterestingNumbers.isInteresting(11208, new int[]{1337, 256})).isEqualTo(0);
        assertThat(InterestingNumbers.isInteresting(11209, new int[]{1337, 256})).isEqualTo(1);
        assertThat(InterestingNumbers.isInteresting(11211, new int[]{1337, 256})).isEqualTo(2);
    }

    @Test
    public void testCWValues() {
        assertThat(InterestingNumbers.isInteresting(109, new int[]{})).isEqualTo(1);
        assertThat(InterestingNumbers.isInteresting(110, new int[]{})).isEqualTo(1);
        assertThat(InterestingNumbers.isInteresting(442, new int[]{})).isEqualTo(1);
        assertThat(InterestingNumbers.isInteresting(9999997, new int[]{})).isEqualTo(1);
        assertThat(InterestingNumbers.isInteresting(119, new int[]{})).isEqualTo(1);
        assertThat(InterestingNumbers.isInteresting(120, new int[]{})).isEqualTo(1);
    }
}
