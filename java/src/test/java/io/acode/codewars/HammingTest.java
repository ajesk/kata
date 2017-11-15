package io.acode.codewars;

import static com.google.common.truth.Truth.assertThat;

import io.acode.util.TestUtils;
import org.junit.Test;

public class HammingTest extends TestUtils {

    @Test
    public void testHamming() {
        tprint("" + Hamming.hamming(1));
    }
}
