package io.acode.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortNumbersByStringsTest {
    @Test
    public void test() {
        assertArrayEquals(new int[]{4, 1, 3, 2}, SortNumbersByStrings.sort(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{8, 8, 9, 9, 10, 10}, SortNumbersByStrings.sort(new int[]{8, 8, 9, 9, 10, 10}));
        assertArrayEquals(new int[]{9, 999, 99}, SortNumbersByStrings.sort(new int[]{9, 99, 999}));
    }

    @Test
    public void testDumb() {
        SortNumbersByStrings.sort(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
    }

    @Test
    public void testDumb2() {
        SortNumbersByStrings.sort(new int[]{822, 183, 92, 354, 13, 936, 533, 95, 305, 691});
    }
}
