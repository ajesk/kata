package io.acode.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobberTest {
  HouseRobber target = new HouseRobber();

  @Test
  public void testBasic() {
    assertEquals(1, target.rob(new int[]{1}));
    assertEquals(2, target.rob(new int[]{1, 2}));
  }

  @Test
  public void testSimpleExecution() {
    assertEquals(4, target.rob(new int[]{1, 2, 3}));
    assertEquals(3, target.rob(new int[]{1, 3, 2}));
  }

  @Test
  public void testLeetOutline() {
    assertEquals(4, target.rob(new int[]{1, 2, 3, 1}));
    assertEquals(12, target.rob(new int[]{2, 7, 9, 3, 1}));
  }

  @Test
  public void testBasicBottomUp() {
    assertEquals(1, target.bottomUp(new int[]{1}));
    assertEquals(2, target.bottomUp(new int[]{1, 2}));
  }

  @Test
  public void testSimpleExecutionBottomUp() {
    assertEquals(4, target.bottomUp(new int[]{1, 2, 3}));
    assertEquals(3, target.bottomUp(new int[]{1, 3, 2}));
  }

  @Test
  public void testLeetOutlineBottomUp() {
    assertEquals(4, target.bottomUp(new int[]{1, 2, 3, 1}));
    assertEquals(12, target.bottomUp(new int[]{2, 7, 9, 3, 1}));
  }

  @Test
  public void testInsaneJump() {
    assertEquals(14, target.bottomUp(new int[]{1,2,1,2,1,2,10}));
  }
}
