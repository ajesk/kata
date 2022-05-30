package io.acode.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class MinStackTest {

  @Test
  public void testInitialize() {
    try {
      new MinStack();
    } catch (Exception e) {
      fail();
    }
  }

  @Test
  public void testPush() {
    MinStack target = new MinStack();

    target.push(1);
    target.push(2);
    assertEquals(Integer.valueOf(1), target.stack.get(0).get(0));
    assertEquals(Integer.valueOf(2), target.stack.get(1).get(0));
  }

  @Test
  public void testTop() {
    MinStack target = new MinStack();

    target.push(1);
    target.push(2);
    assertEquals(2, target.top());
  }

  @Test
  public void testPop() {
    MinStack target = new MinStack();

    target.push(1);
    target.push(2);
    target.pop();
    assertEquals(1, target.top());
  }

  @Test
  public void testMin() {
    MinStack target = new MinStack();

    target.push(2);
    assertEquals(2, target.getMin());
    target.push(3);
    assertEquals(2, target.getMin());
    target.push(1);
    assertEquals(1, target.getMin());
    target.pop();
    assertEquals(2, target.getMin());
  }
}
