package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PopulatingPerfectTreeWithPointersTest {
  PopulatingPerfectTreeWithPointers target = new PopulatingPerfectTreeWithPointers();

  @Test
  public void testBasic() {
    Node test = new Node();

    assertEquals(test, target.connect(test));
    assertNull(target.connect(null));
  }

  @Test
  public void test2Levels() {
    Node test2L2 = new Node(3);
    Node test1L2 = new Node(2, null, null, null);
    Node test1L1 = new Node(1, test1L2, test2L2, null);

    Node result = target.connect(test1L1);
    assertEquals(result.left.next, test2L2);

  }
}
