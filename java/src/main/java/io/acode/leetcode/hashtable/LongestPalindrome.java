package io.acode.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

  public int longestPalindrome(String s) {
    Map<Character, Integer> charCount = new HashMap<>();

    for (char c : s.toCharArray()) {
      charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }

    int count = 0;
    int hasOdd = 0;
    for (int charTotal : charCount.values()) {
      if (charTotal % 2 == 0) {
        count += charTotal;
      } else {
        hasOdd = 1;
        count += (charTotal - 1);
      }
    }

    return count + hasOdd;
  }
}
