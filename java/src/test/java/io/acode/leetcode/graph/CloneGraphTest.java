package io.acode.leetcode.graph;

import io.acode.leetcode.datastructures.graph.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CloneGraphTest {
  private final CloneGraph target = new CloneGraph();

  @Test
  public void testBasic() {
    Node node = new Node(1);
    Node result = target.cloneGraph(node);

    assertEquals(node.val, result.val);
    node.val = 2;
    assertNotEquals(node.val, result.val);
  }

  @Test
  public void testEmpty() {
    assertNull(target.cloneGraph(null));
  }

  @Test
  public void testGraphWithSingularLink() {
    Node test = new Node(1, List.of(new Node(2)));
    Node result = target.cloneGraph(test);

    assertEquals(1, result.neighbors.size());
    assertEquals(2, result.neighbors.get(0).val);
  }

  @Test
  public void testGraphWithSimpleLoop() {
    Node test1 = new Node(1);
    Node test2 = new Node(2, List.of(test1));
    test1.neighbors.add(test2);

    Node result = target.cloneGraph(test1);
    assertNotEquals(test1, result);
    assertEquals(1, result.val);
    assertEquals(1, result.neighbors.size());
    assertEquals(2, result.neighbors.get(0).val);
    assertEquals(1, result.neighbors.get(0).neighbors.size());
    assertEquals(1, result.neighbors.get(0).neighbors.get(0).val);
  }

  @Test
  public void testSimpleTree() {
    Node test = new Node(1, List.of(new Node(2), new Node(3, List.of(new Node(4)))));

    Node result = target.cloneGraph(test);
    assertNotEquals(test, result);
    assertEquals(2, test.neighbors.size());
    assertEquals(1, test.neighbors.get(1).neighbors.size());
  }

  @Test
  public void testLeetCycleExample() {
    Node testLoop = new Node(4);
    Node test = new Node(1, List.of(new Node(2, List.of(new Node(3, List.of(testLoop))))));
    testLoop.neighbors.add(test);

    Node result = target.cloneGraph(test);
    assertNotEquals(test, result);
    assertEquals(result, result.neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0));
  }
}
