package io.acode.codewars;

import static com.google.common.truth.Truth.assertThat;

import io.acode.util.TestUtils;
import org.junit.Test;

public class HammingTest extends TestUtils {

    @Test
    public void testHamming() {
        assertThat(Hamming.hamming(1)).isEqualTo(1);
        assertThat(Hamming.hamming(2)).isEqualTo(2);
        assertThat(Hamming.hamming(1)).isEqualTo(1);
        assertThat(Hamming.hamming(1)).isEqualTo(1);
        assertThat(Hamming.hamming(1)).isEqualTo(1);
        assertThat(Hamming.hamming(1)).isEqualTo(1);
        assertThat(Hamming.hamming(1)).isEqualTo(1);
        assertThat(Hamming.hamming(1)).isEqualTo(1);
        assertThat(Hamming.hamming(1)).isEqualTo(1);
        assertThat(Hamming.hamming(1)).isEqualTo(1);
        assertThat(Hamming.hamming(1)).isEqualTo(1);
        assertThat(Hamming.hamming(1)).isEqualTo(1);
        assertThat(Hamming.hamming(1)).isEqualTo(1);
        assertThat(Hamming.hamming(1)).isEqualTo(1);

    }

    @Test
    public void testDividend() {
        assertThat(Hamming.dividends(2, 2)).isEqualTo(1);
        assertThat(Hamming.dividends(15, 5)).isEqualTo(3);
    }
}
