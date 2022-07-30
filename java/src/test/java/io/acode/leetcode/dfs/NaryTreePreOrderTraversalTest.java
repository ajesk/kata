package io.acode.leetcode.dfs;

import io.acode.leetcode.datastructures.graph.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NaryTreePreOrderTraversalTest { NaryTreePreorderTraversal target = new NaryTreePreorderTraversal(); @Test
  void testBasic() {
    List<Integer> results = target.preorder(new Node(1));

    assertEquals(1, results.size());
    assertEquals(1, results.get(0));
  }

  @Test
  void testTwoNodes() {
    List<Integer> results = target.preorder(new Node(1, List.of(new Node(2))));
    assertEquals(2, results.size());
    assertEquals(2, results.get(1));
  }
}
