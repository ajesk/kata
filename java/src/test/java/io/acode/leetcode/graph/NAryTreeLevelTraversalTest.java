package io.acode.leetcode.graph;

import io.acode.leetcode.datastructures.graph.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class NAryTreeLevelTraversalTest {
  private NAryTreeLevelTraversal target = new NAryTreeLevelTraversal();

  @Test
  public void testBasic() {
    assertEquals(List.of(List.of(1)), target.levelOrder(new Node(1)));
    assertEquals(List.of(List.of(1)), target.levelOrder(new Node(1)));
  }

  @Test
  public void testSimple2LayerTree() {
    assertEquals(List.of(List.of(1), List.of(2)), target.levelOrder(new Node(1, new Node(2))));
    assertEquals(List.of(List.of(1), List.of(3)), target.levelOrder(new Node(1, new Node(3))));
    assertEquals(List.of(List.of(1), List.of(2, 3)), target.levelOrder(new Node(1, new Node(2), new Node(3))));
  }

  @Test
  public void testDeepTree() {
    Node tree = new Node(1,
      new Node(2,
        new Node(3,
          new Node(4,
            new Node(5)))));
    assertEquals(List.of(List.of(1), List.of(2), List.of(3), List.of(4), List.of(5)), target.levelOrder(tree));
  }

  @Test
  public void testTreeWithBigButt() {
    Node tree = new Node(1,
      new Node(2), new Node(3), new Node(4), new Node(5));

    assertEquals(List.of(List.of(1), List.of(2, 3, 4, 5)), target.levelOrder(tree));
  }

  @Test
  public void testMultiBranch() {
    Node tree =
      new Node(1,
        new Node(2,
          new Node(3)),
        new Node(4,
          new Node(5,
            new Node(6),
            new Node(7))
        ),
        new Node(8,
          new Node(9),
          new Node(10),
          new Node(11,
            new Node(12))));
    List<List<Integer>> expected =
      List.of(
        List.of(1),
        List.of(2, 4, 8),
        List.of(3, 5, 9, 10, 11),
        List.of(6,7,12)
      );
    assertEquals(expected, target.levelOrder(tree));
  }
}
