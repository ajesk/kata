package io.acode.leetcode.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestStringWithSwapsTest {
  SmallestStringWithSwaps target = new SmallestStringWithSwaps();

  @Test
  public void testBasic() {
    assertEquals("a", target.smallestStringWithSwaps("a", new ArrayList<>()));
  }

  @Test
  public void testSimpleStringNoChanges() {
    assertEquals("ab", target.smallestStringWithSwaps("ab", new ArrayList<>()));
    assertEquals("ba", target.smallestStringWithSwaps("ba", new ArrayList<>()));
    assertEquals("ab", target.smallestStringWithSwaps("ab", List.of(List.of(0, 1))));
  }

  @Test
  public void testSimpleStringWithChanges() {
    assertEquals("ab", target.smallestStringWithSwaps("ba", List.of(List.of(0, 1))));
  }

  @Test
  public void testLeet() {
    assertEquals("bacd", target.smallestStringWithSwaps("dcab", List.of(List.of(0, 3), List.of(1, 2))));
    assertEquals("abcd", target.smallestStringWithSwaps("dcab", List.of(List.of(0, 3), List.of(1, 2), List.of(0, 2))));
    assertEquals("abc", target.smallestStringWithSwaps("cba", List.of(List.of(0, 1), List.of(1, 2))));
  }
}
