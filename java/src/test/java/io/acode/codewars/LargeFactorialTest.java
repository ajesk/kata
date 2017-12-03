package io.acode.codewars;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

public class LargeFactorialTest {

    @Test
    public void testFactorial() {
        assertThat(LargeFactorial.Factorial(1)).isEqualTo("1");
        assertThat(LargeFactorial.Factorial(2)).isEqualTo("2");
        assertThat(LargeFactorial.Factorial(3)).isEqualTo("6");
        assertThat(LargeFactorial.Factorial(4)).isEqualTo("24");
        assertThat(LargeFactorial.Factorial(5)).isEqualTo("120");
        assertThat(LargeFactorial.Factorial(9)).isEqualTo("362880");
    }

    @Test
    public void testBigFactorial() {
        assertThat(LargeFactorial.Factorial(15)).isEqualTo("1307674368000");
        assertThat(LargeFactorial.Factorial(25)).isEqualTo("15511210043330985984000000");
    }

    @Test
    public void testNegatives() {
        assertThat(LargeFactorial.Factorial(-1)).isNull();
        assertThat(LargeFactorial.Factorial(-10)).isNull();
    }
}
