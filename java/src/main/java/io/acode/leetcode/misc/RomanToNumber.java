package io.acode.leetcode.misc;

import java.util.Map;

public class RomanToNumber {
  Map<String, Integer> numerals = Map.of(
    "I", 1,
    "V", 5,
    "X", 10,
    "L", 50,
    "C", 100,
    "D", 500,
    "M", 1000
  );

  private boolean isComposite(String[] chars, int index) {
    return numerals.get(chars[index]) < numerals.get(chars[index + 1]);
  }

  public int romanToInt(String s) {
    String[] chars = s.split("");
    int total = 0;

    for (int i = 0; i < s.length(); i++) {
      String numeral = chars[i];
      if (i != s.length() - 1 && isComposite(chars, i)) {
        total -= numerals.get(numeral);
        continue;
      }
      total += numerals.get(chars[i]);
    }

    return total;
  }

}
