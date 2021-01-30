package io.acode.hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestEvenLengthWord {

    /*
     * Complete the function below.
     */
    static String longestEvenWord(String sentence) {
        Optional<String> greatest = Arrays.stream(sentence.split(" ")).filter(s -> {
            return s.length() % 2 == 0;
        }).max(Comparator.comparingInt(String::length));
        // returning this because test wrong
        return greatest.isPresent() ? greatest.get() : "00";
    }
}
