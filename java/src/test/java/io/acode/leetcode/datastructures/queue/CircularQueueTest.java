package io.acode.leetcode.datastructures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularQueueTest {

  @Test
  public void initializationTest() {
    try {
      MyCircularQueue test = new MyCircularQueue(1);
      assertEquals(1, test.queue.length);
    } catch (Exception e) {
      fail();
    }
  }

  @Test
  public void countTest() {
    MyCircularQueue target = new MyCircularQueue(3);
    assertEquals(0, target.size());
    target.enQueue(1);
    assertEquals(1, target.size());
    target.deQueue();
    assertEquals(0, target.size());
  }

  @Test
  public void isEmptyShouldReturnTrueWhenEmpty() {
    MyCircularQueue test = new MyCircularQueue(2);
    assertTrue(test.isEmpty());
    test.enQueue(1);
    assertFalse(test.isEmpty());
    test.deQueue();
    assertTrue(test.isEmpty());
  }

  @Test
  public void isFullShouldReturnTrueWhenFull() {
    MyCircularQueue test = new MyCircularQueue(2);
    assertFalse(test.isFull());
    test.enQueue(2);
    test.enQueue(2);
    assertTrue(test.isFull());
    test.deQueue();
    assertFalse(test.isFull());
  }

  @Test
  public void testSimpleEnqueue() {
    MyCircularQueue test = new MyCircularQueue(2);
    test.enQueue(1);
    assertEquals(1, test.Front());
    assertEquals(1, test.Rear());
    assertEquals(0, test.tail);
    assertEquals(0, test.head);
  }

  @Test
  public void enqueueShouldFailOnFullQueue() {
    MyCircularQueue test = new MyCircularQueue(2);

    test.enQueue(1);
    test.enQueue(2);
    assertFalse(test.enQueue(3));
    test.deQueue();
    assertTrue(test.enQueue(4));
  }

  @Test
  public void dequeueShouldFailWhenTryingOnEmptyQueue() {
    MyCircularQueue test = new MyCircularQueue(2);
    assertFalse(test.deQueue());
  }

  @Test
  public void dequeueShouldReturnTrueIfElementRemoved() {
    MyCircularQueue test = new MyCircularQueue(2);
    test.enQueue(1);
    test.enQueue(2);
    assertTrue(test.deQueue());
    assertTrue(test.deQueue());
    assertFalse(test.deQueue());
  }

  @Test
  public void testTailLoop() {
    MyCircularQueue test = new MyCircularQueue(3);
    test.enQueue(1);
    test.enQueue(2);
    test.enQueue(3);
    test.deQueue();
    test.enQueue(4);
    assertEquals(2, test.Front());
    assertEquals(4, test.Rear());
  }

  @Test
  public void testHeadLoop() {
    MyCircularQueue test = new MyCircularQueue(3);
    for (int i = 0; i < test.queue.length; i++) {
      test.enQueue(i);
    }

    test.deQueue();
    test.enQueue(4);

    for (int i = 0; i < test.queue.length; i++) {
      test.deQueue();
    }

    assertEquals(-1, test.Front());
  }

  @Test
  public void frontShouldReturnFirstElement() {
    MyCircularQueue test = new MyCircularQueue(3);

    test.enQueue(1);
    test.enQueue(2);
    test.enQueue(3);

    assertEquals(1, test.Front());
    test.deQueue();
    test.deQueue();
    assertEquals(3, test.Front());
  }

  @Test
  public void testLeet() {
    MyCircularQueue myCircularQueue = new MyCircularQueue(3);
    assertTrue(myCircularQueue.enQueue(1));
    assertTrue(myCircularQueue.enQueue(2));
    assertTrue(myCircularQueue.enQueue(3));
    assertFalse(myCircularQueue.enQueue(4));
    assertEquals(3, myCircularQueue.Rear());
    assertTrue(myCircularQueue.isFull());
    assertTrue(myCircularQueue.deQueue());
    assertTrue(myCircularQueue.enQueue(4));
    assertEquals(4, myCircularQueue.Rear());
  }
}
