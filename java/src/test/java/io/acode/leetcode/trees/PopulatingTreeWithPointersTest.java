package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PopulatingTreeWithPointersTest {
  PopulatingTreeWithPointers target = new PopulatingTreeWithPointers();

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

  @Test
  public void test3Levels() {
    Node test = new Node(1,
      new Node(21,
        new Node(31),
        new Node(32),
        null),
      new Node(22,
        new Node(33),
        null,
        null),
      null);

    Node result = target.connect(test);

    assertEquals(test.left.right, result.left.left.next);
    assertEquals(test.right.left, result.left.right.next);
  }
}
