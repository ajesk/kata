package io.acode.leetcode;

import io.acode.util.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianOfSortedArrayTest extends TestUtils {
    private final MedianOfSortedArray mosa = new MedianOfSortedArray();
    private final int[][] example1 = new int[][] {{1, 3}, {2}};
    private final int[][] example2 = new int[][] {{1, 2}, {3, 4}};
    private final int[][] bothInArray0 = new int[][] {{5, 6}, {1, 9}};
    private final int[][] allSameNumber = new int[][] {{3, 3}, {3, 3, 3, 3, 3}};

    @Test
    public void testMergeWithEven() {
        start();
        assertEquals(2.5, mosa.findMedianSortedArrays(example2[0], example2[1]), 0.1);
        stop();
    }

    @Test
    public void testMergeWithOdd() {
        start();
        assertEquals(2.0, mosa.findMedianSortedArrays(example1[0], example1[1]), 0.1);
        stop();
    }

    @Test
    public void testMergeWithBothInArray0() {
        start();
        assertEquals(5.5, mosa.findMedianSortedArrays(bothInArray0[0], bothInArray0[1]), 0.1);
        stop();
    }

    @Test
    public void testMergeWithAllSameNumber() {
        start();
        assertEquals(3.0, mosa.findMedianSortedArrays(allSameNumber[0], allSameNumber[1]), 0.1);
        stop();
    }
}
