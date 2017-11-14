package io.acode.codewars;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class PrimeInNumbersTest {

    @Test
    public void factorStringTest() {
        assertThat(PrimeInNumbers.factorString(2, 4)).isEqualTo("(2**4)");
        assertThat(PrimeInNumbers.factorString(2, 1)).isEqualTo("(2)");
        assertThat(PrimeInNumbers.factorString(2, 2)).isEqualTo("(2**2)");
        assertThat(PrimeInNumbers.factorString(4, 3)).isEqualTo("(4**3)");

    }

    @Test
    public void decompStringTest() {
        Integer[] ints = {3, 2, 2, 5, 2, 5, 5};
        List<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(ints));

        String factors = PrimeInNumbers.factorDecompString(integers);
        System.out.println(factors);
        assertThat(factors).isEqualTo("(3)(2**2)(5)(2)(5**2)");
    }

    @Test
    public void isPrime() {
        assert(PrimeInNumbers.isPrime(2));
        assert(PrimeInNumbers.isPrime(3));
        assert(PrimeInNumbers.isPrime(5));
        assert(PrimeInNumbers.isPrime(7));
        assert(PrimeInNumbers.isPrime(17));
        assert(PrimeInNumbers.isPrime(37));
    }

    @Test
    public void factorsTest() {
        assertThat(PrimeInNumbers.factors(77)).isEqualTo("(7)(11)");
        assertThat(PrimeInNumbers.factors(7775460)).isEqualTo("(2**2)(3**3)(5)(7)(11**2)(17)");

        assertThat(PrimeInNumbers.factors(933555431)).isEqualTo("(7537)(123863)");
        assertThat(PrimeInNumbers.factors(7919)).isEqualTo("(7919)");
        assertThat(PrimeInNumbers.factors(18195729)).isEqualTo("(3)(17**2)(31)(677)");
    }
}
