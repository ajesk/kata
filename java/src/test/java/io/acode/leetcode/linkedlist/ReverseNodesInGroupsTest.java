package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;
import io.acode.util.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseNodesInGroupsTest extends TestUtils {

  private ListNode node1;

  private final ReverseNodesInGroups rnig = new ReverseNodesInGroups();

  @BeforeEach
  public void setUp() {
    node1 = new ListNode(1, 2, 3, 4, 5);
  }

  @Test
  public void testGivenExamples() {
    assertEquals(new ListNode(2, 1, 4, 3, 5).toString(), rnig.reverseKGroup(node1, 2).toString());
    assertEquals(new ListNode(3, 2, 1, 4, 5).toString(), rnig.reverseKGroup(node1, 3).toString());
    assertEquals(new ListNode(5, 4, 3, 2, 1).toString(), rnig.reverseKGroup(node1, 5).toString());
  }
}
