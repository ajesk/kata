package io.acode.leetcode;

import io.acode.util.TestUtils;
import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

public class MedianOfSortedArrayTest extends TestUtils {
    private MedianOfSortedArray mosa = new MedianOfSortedArray();
    private int[][] example1 = new int[][] {{1, 3}, {2}};
    private int[][] example2 = new int[][] {{1, 2}, {3, 4}};
    private int[][] bothInArray0 = new int[][] {{5, 6}, {1, 9}};
    private int[][] allSameNumber = new int[][] {{3, 3}, {3, 3, 3, 3, 3}};

    @Test
    public void testMergeWithEven() {
        start();
        assertThat(mosa.findMedianSortedArrays(example2[0], example2[1])).isEqualTo(2.5);
        stop();
    }

    @Test
    public void testMergeWithOdd() {
        start();
        assertThat(mosa.findMedianSortedArrays(example1[0], example1[1])).isEqualTo(2.0);
        stop();
    }

    @Test
    public void testMergeWithBothInArray0() {
        start();
        assertThat(mosa.findMedianSortedArrays(bothInArray0[0], bothInArray0[1])).isEqualTo(5.5);
        stop();
    }

    @Test
    public void testMergeWithAllSameNumber() {
        start();
        assertThat(mosa.findMedianSortedArrays(allSameNumber[0], allSameNumber[1])).isEqualTo(3.0);
        stop();
    }
}
