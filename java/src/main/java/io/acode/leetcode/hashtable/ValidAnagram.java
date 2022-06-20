package io.acode.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    if (s.equals(t)) return true;
    if (s.length() != t.length()) return false;

    Map<Character, Integer> charCount = new HashMap<>();
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();

    for (int i = 0; i < sArr.length; i++) {
      charCount.put(sArr[i], charCount.getOrDefault(sArr[i], 0) + 1);
      charCount.put(tArr[i], charCount.getOrDefault(tArr[i], 0) - 1);
    }

    return charCount.values().stream().noneMatch(x -> x != 0);
  }
}
