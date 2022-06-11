package io.acode.leetcode.misc;

import java.util.Locale;

public class IsPalindrome {

  public boolean isPalindrome(String s) {
    String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);
    int pointerA = 0;
    int pointerB = cleanString.length() - 1;

    while (pointerA < pointerB) {
      if (cleanString.charAt(pointerA) != cleanString.charAt(pointerB)) return false;
      pointerA++;
      pointerB--;
    }

    return true;
  }
}
