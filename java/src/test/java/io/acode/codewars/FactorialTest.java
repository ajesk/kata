package io.acode.codewars;

import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Factorial factor = new Factorial();
        assertThat(factor.factorial(1)).isEqualTo(1);
        assertThat(factor.factorial(2)).isEqualTo(2);
        assertThat(factor.factorial(3)).isEqualTo(6);
        assertThat(factor.factorial(4)).isEqualTo(24);
        assertThat(factor.factorial(5)).isEqualTo(120);
        assertThat(factor.factorial(6)).isEqualTo(720);
        assertThat(factor.factorial(7)).isEqualTo(5040);
        assertThat(factor.factorial(8)).isEqualTo(40320);
        assertThat(factor.factorial(9)).isEqualTo(362880);
        assertThat(factor.factorial(10)).isEqualTo(3628800);
        assertThat(factor.factorial(11)).isEqualTo(39916800);
        assertThat(factor.factorial(12)).isEqualTo(479001600);
        assertThat(factor.factorial(21)).isEqualTo(-1);
    }
}
