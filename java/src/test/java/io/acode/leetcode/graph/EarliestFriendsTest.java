package io.acode.leetcode.graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EarliestFriendsTest {
  EarliestFriends target = new EarliestFriends();

  @Test
  public void testBasic() {
    assertEquals(0, target.earliestAcq(new int[][]{{0, 0, 0}}, 1));
  }

  @Test
  public void testTwoPeopleWhoDoNotBecomeFriends() {
    assertEquals(-1, target.earliestAcq(new int[][]{{0, 0, 0}}, 2));
  }

  @Test
  public void testTwoPeopleWhoBecomeFriends() {
    assertEquals(0, target.earliestAcq(new int[][]{{0, 0, 1}}, 2));
  }

  @Test
  public void testLeet() {
    assertEquals(20190301, target.earliestAcq(new int[][]{{20190101, 0, 1}, {20190104, 3, 4}, {20190107, 2, 3},
      {20190211, 1, 5}, {20190224, 2, 4}, {20190301, 0, 3}, {20190312, 1, 2}, {20190322, 4, 5}}, 6));
    assertEquals(3, target.earliestAcq(new int[][]{{0, 2, 0}, {1, 0, 1}, {3, 0, 3}, {4, 1, 2}, {7, 3, 1}}, 4));
  }

  @Test
  public void testIncorrect() {
    assertEquals(2, target.earliestAcq(new int[][]{{9, 3, 0}, {0, 2, 1}, {8, 0, 1}, {1, 3, 2}, {2, 2, 0}, {3, 3, 1}}, 4));
  }
}
