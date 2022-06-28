package io.acode.leetcode.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {
  ContainsDuplicate target = new ContainsDuplicate();

  @Test
  void testBasic() {
    assertFalse(target.containsDuplicate(new int[]{1}));
    assertFalse(target.containsDuplicate(new int[]{1, 2}));
    assertTrue(target.containsDuplicate(new int[]{1, 1}));
  }

  @Test
  void testLeet() {
    assertTrue(target.containsDuplicate(new int[]{1, 2, 3, 1}));
    assertFalse(target.containsDuplicate(new int[]{1, 2, 3, 4}));
    assertTrue(target.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
  }
}
