package io.acode.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationsTest {
  Permutations target = new Permutations();

  @Test
  void testBasic() {
    List<List<Integer>> result = target.permute(new int[]{1});
    assertEquals(1, result.size());
  }

  @Test
  void testSimple() {
    List<List<Integer>> result = target.permute(new int[]{1, 2});
    assertEquals(2, result.size());
    assertTrue(result.contains(List.of(1, 2)));
    assertTrue(result.contains(List.of(2, 1)));
  }

  @Test
  void test3() {
    List<List<Integer>> result = target.permute(new int[]{1, 2, 3});
    assertEquals(6, result.size());
  }

  @Test
  void test4() {
    List<List<Integer>> result = target.permute(new int[]{1, 2, 3, 4});
    assertEquals(24, result.size());
  }

  @Test
  void test10() {
    List<List<Integer>> result = target.permute(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    assertEquals(3628800, result.size());
  }
}
