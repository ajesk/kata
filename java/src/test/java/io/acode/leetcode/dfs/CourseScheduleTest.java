package io.acode.leetcode.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseScheduleTest {
  CourseSchedule target = new CourseSchedule();

  @Test
  void testBasic() {
    assertTrue(target.canFinish(1, new int[][]{}));
    assertFalse(target.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
  }

  @Test
  void testLeet() {
    assertTrue(target.canFinish(2, new int[][]{{1, 0}}));
    assertTrue(target.canFinish(2, new int[][]{}));
  }

  @Test
  void testFail() {
    assertTrue(target.canFinish(5, new int[][]{
      {1, 4},
      {2, 4},
      {3, 1},
      {3, 2}
    }));
  }
}
