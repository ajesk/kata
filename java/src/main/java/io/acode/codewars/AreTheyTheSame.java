package io.acode.codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether the two arrays
 * have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements
 * in a squared, regardless of the order.

 Examples

 Valid arrays

 a = [121, 144, 19, 161, 19, 144, 19, 11]
 b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
 comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144,
 361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:

 a = [121, 144, 19, 161, 19, 144, 19, 11]
 b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
 Invalid arrays

 If we change the first number to something else, comp may not return true anymore:

 a = [121, 144, 19, 161, 19, 144, 19, 11]
 b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
 comp(a,b) returns false because in b 132 is not the square of any number of a.

 a = [121, 144, 19, 161, 19, 144, 19, 11]
 b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
 comp(a,b) returns false because in b 36100 is not the square of any number of a.

 Remarks

 a or b might be [] (all languages except R). a or b might be nil or null or None.

 If a or b are nil (or null or None), the problem doesn't make sense so return false.

 If a or b are empty the result is evident by itself.
 */
class AreTheyTheSame {

    static boolean checkSqr(List<Double> a, List<Double> b) {
        return a.stream()
                .filter(aUnit -> b.contains(Math.pow(aUnit, 2)))
                .count() == a.size();
    }

    static boolean checkSqrt(List<Double> a, List<Double> b) {
        return b.stream()
                .filter(bUnit -> a.contains(Math.sqrt(bUnit)))
                .count() == b.size();
    }

    static List<Double> convert(int[] arr) {
        return Arrays.stream(arr).asDoubleStream().map(Math::abs).boxed().collect(Collectors.toList());
    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;
        List<Double> aList = convert(a), bList = convert(b);
        return a.length == 0 && b.length == 0
                        || a.length == b.length
                        && checkSqr(aList, bList)
                        && checkSqrt(aList, bList);
    }
}
