package io.acode.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.logging.Level;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FlattenMultiLevelLinkedListTest {
  FlattenMultiLevelLinkedList target = new FlattenMultiLevelLinkedList();

  @Test
  public void testBasic() {
    assertNull(target.flatten(null));
  }

  @Test
  public void testSingleLayer() {
    FlattenMultiLevelLinkedList.Node test = new FlattenMultiLevelLinkedList.Node(1, 3, 4);
    assertEquals(test, target.flatten(test));
  }

  @Test
  public void simpleMultiLayer() {
    FlattenMultiLevelLinkedList.Node test = new FlattenMultiLevelLinkedList.Node(1, new FlattenMultiLevelLinkedList.Node(2), new FlattenMultiLevelLinkedList.Node(3));
    FlattenMultiLevelLinkedList.Node expected = new FlattenMultiLevelLinkedList.Node(1, 2, 3);

    assertEquals(expected.toString(), target.flatten(test).toString());
  }

  @Test
  public void threeLevelListTest() {

    FlattenMultiLevelLinkedList.Node level3_12 = new FlattenMultiLevelLinkedList.Node(12);
    FlattenMultiLevelLinkedList.Node level3_11 = new FlattenMultiLevelLinkedList.Node(11, level3_12);
    level3_12.prev = level3_11;

    FlattenMultiLevelLinkedList.Node level2_10 = new FlattenMultiLevelLinkedList.Node(10);
    FlattenMultiLevelLinkedList.Node level2_9 = new FlattenMultiLevelLinkedList.Node(9, level2_10);
    FlattenMultiLevelLinkedList.Node level2_8 = new FlattenMultiLevelLinkedList.Node(8, level3_11, level2_9);
    FlattenMultiLevelLinkedList.Node level2_7 = new FlattenMultiLevelLinkedList.Node(7, level2_8);
    level2_10.prev = level2_9;
    level2_9.prev = level2_8;
    level2_8.prev = level2_7;


    FlattenMultiLevelLinkedList.Node level1_6 = new FlattenMultiLevelLinkedList.Node(6);
    FlattenMultiLevelLinkedList.Node level1_5 = new FlattenMultiLevelLinkedList.Node(5, level1_6);
    FlattenMultiLevelLinkedList.Node level1_4 = new FlattenMultiLevelLinkedList.Node(4, level1_5);
    FlattenMultiLevelLinkedList.Node level1_3 = new FlattenMultiLevelLinkedList.Node(3, level2_7, level1_4);
    FlattenMultiLevelLinkedList.Node level1_2 = new FlattenMultiLevelLinkedList.Node(2, level1_3);
    FlattenMultiLevelLinkedList.Node level1_1 = new FlattenMultiLevelLinkedList.Node(1, level1_2);
    level1_6.prev = level1_5;
    level1_5.prev = level1_4;
    level1_4.prev = level1_3;
    level1_3.prev = level1_2;
    level1_2.prev = level1_1;

    assertEquals("1,2,3,7,8,11,12,9,10,4,5,6,null", target.flatten(level1_1).toString());
  }

  @Test
  public void onlyChildren() {
    FlattenMultiLevelLinkedList.Node level1 = new FlattenMultiLevelLinkedList.Node(1);
    FlattenMultiLevelLinkedList.Node level2 = new FlattenMultiLevelLinkedList.Node(2);
    FlattenMultiLevelLinkedList.Node level3 = new FlattenMultiLevelLinkedList.Node(3);

    level1.child = level2;
    level2.child = level3;

    assertEquals("1,2,3,null", target.flatten(level1).toString());
  }
}
