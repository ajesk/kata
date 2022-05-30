package io.acode.leetcode.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackUsingQueuesTest {

  @Test
  public void testInit() {
    try {
      new StackUsingQueues();
    } catch (Exception e) {
      fail();
    }
  }

  @Test
  public void testPush() {
    StackUsingQueues target = new StackUsingQueues();

    target.push(1);
    target.push(2);
    assertEquals(2, target.inQueue.size());
    assertEquals(0, target.outQueue.size());
  }

  @Test
  public void testPop() {
    StackUsingQueues target = new StackUsingQueues();
    target.push(1);
    target.push(2);
    assertEquals(2, target.pop());
    assertEquals(1, target.pop());
  }

  @Test
  public void testTop() {
    StackUsingQueues target = new StackUsingQueues();
    target.push(1);
    target.push(2);
    assertEquals(2, target.top());
    assertEquals(2, target.top());
  }

  @Test
  public void testEmpty() {
    StackUsingQueues target = new StackUsingQueues();
    assertTrue(target.empty());
    target.push(1);
    assertFalse(target.empty());
    target.top();
    assertFalse(target.empty());
    target.pop();
    assertTrue(target.empty());
  }

  @Test
  public void testLeet() {
    StackUsingQueues target = new StackUsingQueues();
    target.push(1);
    target.push(2);
    assertEquals(2, target.top());
    assertEquals(2, target.pop());
    assertFalse(target.empty());
  }
}
