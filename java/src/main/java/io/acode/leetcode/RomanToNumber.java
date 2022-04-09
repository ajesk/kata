package io.acode.leetcode;

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
    return
      (chars[index].equals("I") && (chars[index + 1].equals("V") || chars[index + 1].equals("X"))) ||
      (chars[index].equals("X") && (chars[index + 1].equals("C") || chars[index + 1].equals("L"))) ||
      (chars[index].equals("C") && (chars[index + 1].equals("D") || chars[index + 1].equals("M")));
  }

  public int romanToInt(String s) {
    String[] chars = s.split("");
    int total = 0;

    for (int i = 0; i < s.length(); i++) {
      String numeral = chars[i];
      if (i != s.length() - 1 && isComposite(chars, i)) {
        total += numerals.get(chars[i + 1]) - numerals.get(numeral);
        i++;
        continue;
      }
      total += numerals.get(chars[i]);
    }

    return total;
  }

}
