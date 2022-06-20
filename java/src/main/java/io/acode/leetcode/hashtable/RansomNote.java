package io.acode.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
  public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> letterCount = new HashMap<>();
    if (ransomNote.length() > magazine.length()) return false;

    for (char letter : magazine.toCharArray()) {
      letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
    }

    for (char letter : ransomNote.toCharArray()) {
      if (!letterCount.containsKey(letter)) return false;
      letterCount.put(letter, letterCount.get(letter) - 1);
    }

    return letterCount.values().stream().noneMatch(x -> x < 0);
  }
}
