package io.acode.codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AreTheyTheSameTest {
    private int[] emptyArray = {},
          offVals = {2, 3},
          nullVals = null,
          validA = {121, 144, 19, 161, 19, 144, 19, 11},
          validB = {121, 14641, 20736, 361, 25921, 361, 20736, 361},
          invalidB = {132, 14641, 20736, 361, 25921, 361, 20736, 361},
          invalidB2 = {121, 14641, 20736, 36100, 25921, 361, 20736, 361},
          negative1 = {0, -14, 191, 161, 19, 144, 195, 1},
          negative2 = {1, 0, 196, 36481, 25921, 361, 20736, 38025};


    @Test
    public void testCompPreChecks() {
        assert AreTheyTheSame.comp(emptyArray, emptyArray);
        assert !AreTheyTheSame.comp(offVals, validA);
        assert !AreTheyTheSame.comp(nullVals, validA);
    }

    @Test
    public void testComp() {
        assert AreTheyTheSame.comp(validA, validB);
        assert !AreTheyTheSame.comp(validA, invalidB);
        assert !AreTheyTheSame.comp(validA, invalidB2);
    }

    @Test
    public void checkSqr() {
        List<Double> va = AreTheyTheSame.convert(validA),
                vb = AreTheyTheSame.convert(validB),
                ivb = AreTheyTheSame.convert(invalidB);
        assert AreTheyTheSame.checkSqr(va, vb);
        assert !AreTheyTheSame.checkSqr(vb, va);
        assert !AreTheyTheSame.checkSqr(va, ivb);
    }

    @Test
    public void checkSqrt() {
        List<Double> va = AreTheyTheSame.convert(validA),
                vb = AreTheyTheSame.convert(validB),
                ivb = AreTheyTheSame.convert(invalidB);
        assert AreTheyTheSame.checkSqr(va, vb);
        assert !AreTheyTheSame.checkSqr(vb, va);
        assert !AreTheyTheSame.checkSqr(va, ivb);
    }

    @Test
    public void testNegative() {
        List<Double> negativeA = AreTheyTheSame.convert(negative1),
                negativeB = AreTheyTheSame.convert(negative2);
        System.out.println(Arrays.toString(negativeA.toArray()));
        System.out.println(Arrays.toString(negativeB.toArray()));
        assert AreTheyTheSame.checkSqr(negativeA, negativeB);
        assert !AreTheyTheSame.checkSqr(negativeB, negativeA);
        assert AreTheyTheSame.checkSqrt(negativeA, negativeB);
        assert !AreTheyTheSame.checkSqrt(negativeB, negativeA);
        assert AreTheyTheSame.comp(negative1, negative2);
    }
}
