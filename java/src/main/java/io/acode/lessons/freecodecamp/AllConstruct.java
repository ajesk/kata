package io.acode.lessons.freecodecamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllConstruct {
  public List<List<String>> allConstruct(String target, String[] wordBank, Map<String, List<List<String>>> memo) {
    if (memo.containsKey(target)) return memo.get(target);
    if (target.isEmpty()) {
      return List.of(new ArrayList<>());
    }

    List<List<String>> result = new ArrayList<>();
    for (String word : wordBank) {
      if (target.startsWith(word)) {
        String nextWord = target.replaceFirst(word, "");
        List<List<String>> nextResults = allConstruct(nextWord, wordBank, memo);
        if (!nextResults.isEmpty()) {
          nextResults.forEach(list -> list.add(word));
          result.addAll(nextResults);
        }
      }
    }

    memo.put(target, result);
    return memo.get(target);
  }

  public List<List<String>> allConstruct(String target, String[] wordBank) {
    return allConstruct(target, wordBank, new HashMap<>());
  }
}
