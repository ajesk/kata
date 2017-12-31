package io.acode.other;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class StepUpTest {
    StepUp su = new StepUp();

    @Test
    public void testBasicNumbers() {
        assertThat(su.calculateMoves(1)).isEqualTo(1);
        assertThat(su.calculateMoves(2)).isEqualTo(2);
    }

    @Test
    public void testComplexMoves() {
        assertThat(su.calculateMoves(3)).isEqualTo(3);
        assertThat(su.calculateMoves(4)).isEqualTo(5);
        assertThat(su.calculateMoves(5)).isEqualTo(8);
        assertThat(su.calculateMoves(6)).isEqualTo(13);
    }
}
