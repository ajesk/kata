package io.acode.leetcode.dfs;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeysAndRoomsTest {
  KeysAndRooms target = new KeysAndRooms();
  List<Integer> emptyRoom = Collections.emptyList();

  @Test
  public void testBasic() {
    assertTrue(target.canVisitAllRooms(List.of(emptyRoom)));
  }

  @Test
  public void testSimpleRoute() {
    assertTrue(target.canVisitAllRooms(List.of(List.of(1), emptyRoom)));
  }

  @Test
  public void testSimpleBlocked() {
    assertFalse(target.canVisitAllRooms(List.of(emptyRoom, List.of(0))));
  }

  @Test
  public void testNestedBlockedRoom() {
    assertFalse(target.canVisitAllRooms(List.of(List.of(2), emptyRoom, List.of(3), emptyRoom)));
  }

  @Test
  public void testForkingPath() {
    assertTrue(target.canVisitAllRooms(List.of(List.of(1, 2), emptyRoom, emptyRoom)));
  }

  @Test
  public void testLeet1() {
    assertTrue(target.canVisitAllRooms(List.of(
      List.of(1),
      List.of(2),
      List.of(3),
      emptyRoom
    )));
  }

  @Test
  public void testLeet2() {
    assertFalse(target.canVisitAllRooms(List.of(
      List.of(1, 3),
      List.of(3,0,1),
      List.of(2),
      List.of(0)
    )));
  }
}
