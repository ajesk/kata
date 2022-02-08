package io.acode.codewars;

import java.util.Arrays;

public class VowelCount {
  public static int getCount(String str) {
    String vowel = "aeiou";
    return str.isEmpty() ? 0 : (int) Arrays.stream(str.split("")).filter(vowel::contains).count();
  }
}
