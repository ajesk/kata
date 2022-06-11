package io.acode.lessons.freecodecamp;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {

  public boolean canConstruct(String target, String[] wordBank, Map<String, Boolean> memo) {
    if (target.isEmpty()) return true;
    if (memo.containsKey(target)) return memo.get(target);

    for (String word : wordBank) {
      if (target.startsWith(word)) {
        String trial = target.replaceFirst(word, "");
        if (canConstruct(trial, wordBank, memo)) {
          memo.put(target, true);
          return memo.get(target);
        }
      }
    }
    memo.put(target, false);
    return memo.get(target);
  }

  public boolean canConstruct(String target, String[] wordBank) {
    return canConstruct(target, wordBank, new HashMap<>());
  }
}
