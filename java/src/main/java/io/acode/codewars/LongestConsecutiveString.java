package io.acode.codewars;

import java.util.Comparator;
import java.util.stream.IntStream;

public class LongestConsecutiveString {

  public static String longestConsec(String[] strarr, int k) {
    return IntStream.rangeClosed(0, strarr.length - k)
      .mapToObj(x -> {
        String composite = "";
        for (int y = x; y < x + k; y++) {
          composite += strarr[y];
        }
        return composite;
      })
      .max(Comparator.comparing(String::length))
      .orElse("");
  }
}
