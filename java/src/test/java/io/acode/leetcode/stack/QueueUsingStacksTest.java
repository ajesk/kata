package io.acode.leetcode.stack;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class QueueUsingStacksTest {

  @Test
  public void testInit() {
    try {
      new QueueUsingStacks();
    } catch (Exception e) {
      fail();
    }
  }

  @Test
  public void testPeek() {
    QueueUsingStacks target = new QueueUsingStacks();
    target.push(1);
    assertEquals(1, target.peek());
    target.push(2);
    assertEquals(1, target.peek());
    assertEquals(1, target.peek());
  }

  @Test(expected = EmptyStackException.class)
  public void peekShouldThrowEmptyStackException() {
    QueueUsingStacks target = new QueueUsingStacks();
    target.peek();
  }

  @Test
  public void testPush() {
    QueueUsingStacks target = new QueueUsingStacks();
    target.push(1);
    assertEquals(1, target.inStack.size());
  }

  @Test
  public void testPop() {
    QueueUsingStacks target = new QueueUsingStacks();
    target.push(1);
    target.push(2);
    target.push(3);
    assertEquals(1, target.pop());
    assertEquals(2, target.pop());
    assertEquals(3, target.pop());
  }

  @Test(expected = EmptyStackException.class)
  public void popShouldThrowEmptyStackException() {
    QueueUsingStacks target = new QueueUsingStacks();
    target.pop();
  }

  @Test
  public void testEmpty() {
    QueueUsingStacks target = new QueueUsingStacks();
    assertTrue(target.empty());
    target.push(1);
    assertFalse(target.empty());
    target.pop();
    assertTrue(target.empty());
  }
}
