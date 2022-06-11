package io.acode.lessons.freecodecamp;

import java.util.HashMap;
import java.util.Map;

public class CountConstruct {

  public int countConstruct(String target, String[] wordBank, Map<String, Integer> memo) {
    if (memo.containsKey(target)) return memo.get(target);
    if (target.isEmpty()) return 1;

    int count = 0;
    for (String word : wordBank) {
      if (target.startsWith(word)) {
        String nextWord = target.replaceFirst(word, "");
        count += countConstruct(nextWord, wordBank, memo);
      }
    }

    memo.put(target, count);
    return count;
  }

  public int countConstruct(String target, String[] wordBank) {
    return countConstruct(target, wordBank, new HashMap<>());
  }
}
