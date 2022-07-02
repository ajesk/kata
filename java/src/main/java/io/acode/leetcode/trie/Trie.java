package io.acode.leetcode.trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
  Map<Character, Trie> nodes;

  public Trie() {
    nodes = new HashMap<>();
  }

  public void insert(String word) {
    if (word.isEmpty()) {
      nodes.put('_', null);
      return;
    }
    char c = word.charAt(0);
    nodes.computeIfAbsent(c, x -> new Trie());
    nodes.get(c).insert(word.substring(1));
  }

  public boolean search(String word) {
    if (word.isEmpty()) return nodes.containsKey('_');
    char c = word.charAt(0);
    return nodes.getOrDefault(c, new Trie()).search(word.substring(1));
  }

  public boolean startsWith(String prefix) {
    if (prefix.isEmpty()) {
      return !nodes.isEmpty();
    }
    char c = prefix.charAt(0);
    return nodes.getOrDefault(c, new Trie()).startsWith(prefix.substring(1));
  }
}
