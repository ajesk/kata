package io.acode.other;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
  public static char firstUnique(String str) {
    Map<Character, Integer> chars = new LinkedHashMap<>();
    str.chars()
      .mapToObj(x -> (char) x)
      .forEach(x -> {
        if (chars.containsKey(x)) {
          chars.put(x, chars.get(x) + 1);
        } else {
          chars.put(x, 1);
        }
      });

    return chars.entrySet()
      .stream()
      .filter(entry -> entry.getValue() == 1)
      .map(Map.Entry::getKey)
      .findFirst().orElse('0');
  }
}
