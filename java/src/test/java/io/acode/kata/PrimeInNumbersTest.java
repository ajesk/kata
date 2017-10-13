package io.acode.kata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class PrimeInNumbersTest {

    @Test
    public void getNextPrimeTest() {
        assertThat(PrimeInNumbers.primes.isEmpty()).isTrue();
        PrimeInNumbers.nextPrime();
        assertThat(PrimeInNumbers.primes.isEmpty()).isFalse();
        assertThat(PrimeInNumbers.primes.size()).isEqualTo(1);
        PrimeInNumbers.nextPrime();
        assertThat(PrimeInNumbers.primes.size()).isEqualTo(2);
        PrimeInNumbers.nextPrime();
        assertThat(PrimeInNumbers.primes.get(2)).isEqualTo(5);
        PrimeInNumbers.nextPrime();
        assertThat(PrimeInNumbers.primes.get(3)).isEqualTo(7);
    }

    @Test
    public void factorTest() {
        assertThat(PrimeInNumbers.factor(2, 4)).isEqualTo("(2**4)");
        assertThat(PrimeInNumbers.factor(2, 1)).isEqualTo("(2)");
        assertThat(PrimeInNumbers.factor(2, 2)).isEqualTo("(2**2)");
        assertThat(PrimeInNumbers.factor(4, 3)).isEqualTo("(4**3)");

    }

    @Test
    public void factorStringTest() {
        Integer[] ints = {3, 2, 2, 5, 2, 5, 5};
        List<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(ints));

        String factors = PrimeInNumbers.factorString(integers);
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
        System.out.println(PrimeInNumbers.factors(77));
    }
}
