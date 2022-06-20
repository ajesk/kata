package io.acode.leetcode.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {
  MajorityElement target = new MajorityElement();

  @Test
  void testBasic() {
    assertEquals(1, target.majorityElement(new int[]{1,1,1,1,1,1}));
  }

  @Test
  void test2Values() {
    assertEquals(2, target.majorityElement(new int[]{2,2,2,2,2,2,1}));
  }

  @Test
  void testLeet() {
    assertEquals(3, target.majorityElement(new int[]{3,2,3}));
    assertEquals(2, target.majorityElement(new int[]{2,2,1,1,1,2,2}));

  }
}
