package io.acode.hackerrank;

import io.acode.util.TestUtils;
import org.junit.jupiter.api.Test;

public class LongestEvenWordTest extends TestUtils {
    String test1 = "Time to write great code";
    String test2 = "It is a pleasant day today";
    String test3 = "Hey";

    @Test
    public void testScenario1() {
        tprint(LongestEvenLengthWord.longestEvenWord(test1));
    }

    @Test
    public void testScenario2() {
        tprint(LongestEvenLengthWord.longestEvenWord(test2));
    }

    @Test
    public void testScenario3() {
        tprint(LongestEvenLengthWord.longestEvenWord(test3));
    }
}
