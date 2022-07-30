package io.acode.leetcode.dp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {

  public boolean wordBreak(String s, List<String> wordDict, Map<String, Boolean> memo) {
    if (s.isEmpty()) return true;
    if (memo.containsKey(s)) return memo.get(s);

    for (String word : wordDict) {
      if (s.startsWith(word)) {
        if (wordBreak(s.replaceFirst(word, ""), wordDict, memo)) {
          memo.put(s, true);
          return memo.get(s);
        }
      }
    }

    memo.put(s, false);
    return memo.get(s);
  }

  public boolean wordBreak(String s, List<String> wordDict) {
    return wordBreak(s, wordDict, new HashMap<>());
  }
}
