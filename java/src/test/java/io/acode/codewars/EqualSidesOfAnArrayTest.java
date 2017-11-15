package io.acode.codewars;

import org.junit.Test;
import static org.junit.Assert.*;

public class EqualSidesOfAnArrayTest {
    // Given in instructions
    private int[] testArray1 = {1,2,3,4,3,2,1};
    private int[] testArray2 = {1,100,50,-51,1,1};
    private int[] testArray3 = {20,10,-80,10,10,15,35};
    private int[] emptyArray = {};

    @Test
    public void testSumIndices() {
        assertEquals(0, EqualSidesOfAnArray.sumIndices(0, 0, testArray1));
        assertEquals(3, EqualSidesOfAnArray.sumIndices(0, 2, testArray1));
        assertEquals(99, EqualSidesOfAnArray.sumIndices(1, 4, testArray2));
        assertEquals(16, EqualSidesOfAnArray.sumIndices(0, testArray1.length, testArray1));
    }

    @Test
    public void testCompareIndices() {
        assert EqualSidesOfAnArray.compareIndices(3, testArray1);
        assert !EqualSidesOfAnArray.compareIndices(2, testArray1);
        assert EqualSidesOfAnArray.compareIndices(1, testArray2);
        assert !EqualSidesOfAnArray.compareIndices(2, testArray2);
        assert EqualSidesOfAnArray.compareIndices(0, testArray3);
        assert !EqualSidesOfAnArray.compareIndices(3, testArray3);
    }

    @Test
    public void testFindEvenIndex() {
        assertEquals(3, EqualSidesOfAnArray.findEvenIndex(testArray1));
        assertEquals(1, EqualSidesOfAnArray.findEvenIndex(testArray2));
        assertEquals(0, EqualSidesOfAnArray.findEvenIndex(testArray3));
        assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(emptyArray));
    }
}
