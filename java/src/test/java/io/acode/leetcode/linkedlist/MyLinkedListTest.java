package io.acode.leetcode.linkedlist;

import com.sun.jdi.connect.Connector;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {
  @Test
  public void instatiate() {
    MyLinkedList target = new MyLinkedList();

    assertNull(target.head);
    assertNull(target.tail);
  }

  @Test
  public void testAddAtHead() {
    MyLinkedList target = new MyLinkedList();

    target.addAtHead(1);

    assertEquals(1,  target.head.val);
    assertEquals(1, target.tail.val);

    target.addAtHead(2);

    assertEquals(2,  target.head.val);
    assertEquals(1, target.tail.val);
  }

  @Test
  public void testAddAtTail() {
    MyLinkedList target = new MyLinkedList();

    target.addAtTail(1);

    assertEquals(1, target.head.val);
    assertEquals(1, target.tail.val);

    target.addAtTail(2);

    assertEquals(1, target.head.val);
    assertEquals(2, target.tail.val);
  }

  @Test
  public void testGet() {
    MyLinkedList target = new MyLinkedList();
    target.addAtHead(3);
    target.addAtHead(2);
    target.addAtHead(1);

    assertEquals(1, target.get(0));
    assertEquals(2, target.get(1));
    assertEquals(3, target.get(2));
    assertEquals(-1, target.get(9));
  }

  @Test
  public void createAtIndex() {
    MyLinkedList target = new MyLinkedList();
    target.addAtHead(1);
    target.addAtTail(2);
    target.addAtIndex(1, 3);

    assertEquals(1, target.get(0));
    assertEquals(3, target.get(1));
    assertEquals(2, target.get(2));

    target.addAtIndex(99, 99);

    assertEquals(1, target.get(0));
    assertEquals(3, target.get(1));
    assertEquals(2, target.get(2));
  }

  @Test
  public void addAtIndexShouldAddAtTail() {
    MyLinkedList target = new MyLinkedList();
    target.addAtHead(1);
    target.addAtTail(2);
    target.addAtIndex(2, 3);

    assertEquals(3, target.tail.val);
    assertEquals(3, target.get(2));
  }

  @Test
  public void deleteAtIndex() {
    MyLinkedList target = new MyLinkedList();
    target.addAtHead(1);
    target.addAtTail(2);
    target.addAtIndex(1, 3);
    target.deleteAtIndex(1);

    assertEquals(1, target.get(0));
    assertEquals(2, target.get(1));

    target.deleteAtIndex(99);
    assertEquals(1, target.get(0));
    assertEquals(2, target.get(1));
  }

  @Test
  public void deleteHead() {
    MyLinkedList target = new MyLinkedList();
    target.addAtHead(1);
    target.addAtTail(2);
    target.deleteAtIndex(0);

    assertEquals(2, target.get(0));
    assertEquals(2, target.head.val);
  }

  @Test
  public void deleteTail() {
    MyLinkedList target = new MyLinkedList();
    target.addAtHead(1);
    target.addAtTail(2);
    target.deleteAtIndex(1);

    assertEquals(1, target.get(0));
    assertEquals(1, target.tail.val);
  }

  @Test
  public void testLeetCode() {
    MyLinkedList target = new MyLinkedList();
    target.addAtIndex(0, 10);
    target.addAtIndex(0, 20);
    target.addAtIndex(1, 30);

    assertEquals(20, target.get(0));
  }
}
