package io.acode.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CopyRandomListTest {
  CopyRandomList target = new CopyRandomList();

  @Test
  public void testBasic() {
    assertNull(target.copyRandomList(null));
  }

  @Test
  public void returnExactListWhenNoRandos() {
    CopyRandomList.Node test = new CopyRandomList.Node(1,
      new CopyRandomList.Node(2,
        new CopyRandomList.Node(3)));

    assertEquals(test.toString(), target.copyRandomList(test).toString());
  }

  @Test
  public void testWithASingleRandom() {
    CopyRandomList.Node node1 = new CopyRandomList.Node(1);
    CopyRandomList.Node node2 = new CopyRandomList.Node(2);
    node1.next = node2;
    node2.random = node1;

    assertEquals("1Rnull,2R1,null", target.copyRandomList(node1).toString());
  }
}
