package io.acode.leetcode.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TrieTest {

  @Test
  void insertShouldCreateASingleStreamOfChars() {
    Trie trie = new Trie();

    trie.insert("hello");
    assertTrue(trie.nodes.containsKey('h'));
    assertTrue(trie.nodes.get('h').nodes.containsKey('e'));
  }

  @Test
  void insertShouldCreateEndOfWord() {
    Trie trie = new Trie();
    trie.insert("a");
    trie.insert("");
    assertTrue(trie.nodes.containsKey('a'));
    assertTrue(trie.nodes.containsKey('_'));
    assertTrue(trie.nodes.get('a').nodes.containsKey('_'));
  }

  @Test
  void searchShouldReturnIfFullWordExists() {
    Trie trie = new Trie();
    trie.insert("sheer");
    assertTrue(trie.search("sheer"));
    assertFalse(trie.search("she"));
    trie.insert("she");
    assertTrue(trie.search("she"));
    assertFalse(trie.search("er"));
  }

  @Test
  void startsWithShouldReturnTrueIfPrefixExist() {
    Trie trie = new Trie();
    trie.insert("princess");
    assertTrue(trie.startsWith("princess"));
    assertTrue(trie.startsWith("prince"));
  }

  @Test
  void emptyTrieShouldReturnFalseForStartsWith() {
    Trie trie = new Trie();
    assertFalse(trie.startsWith("a"));
  }

  @Test
  void testLeet() {
    Trie trie = new Trie();
    trie.insert("apple");
    assertTrue(trie.search("apple"));
    assertFalse(trie.search("app"));
    assertTrue(trie.startsWith("app"));
    trie.insert("app");
    assertTrue(trie.search("app"));
  }
}
