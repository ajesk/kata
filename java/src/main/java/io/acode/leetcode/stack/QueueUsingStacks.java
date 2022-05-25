package io.acode.leetcode.stack;

import java.util.Stack;

public class QueueUsingStacks {
  Stack<Integer> inStack;
  Stack<Integer> outStack;

  public QueueUsingStacks() {
    inStack = new Stack<>();
    outStack = new Stack<>();
  }

  private void inputMode() {
    while (!outStack.isEmpty()) {
      inStack.push(outStack.pop());
    }
  }

  private void outputMode() {
    while (!inStack.isEmpty()) {
      outStack.push(inStack.pop());
    }
  }

  public void push(int x) {
    inputMode();
    inStack.push(x);
  }

  public int pop() {
    outputMode();
    return outStack.pop();
  }

  public int peek() {
    outputMode();
    return outStack.peek();
  }

  public boolean empty() {
    return inStack.isEmpty() && outStack.isEmpty();
  }
}
