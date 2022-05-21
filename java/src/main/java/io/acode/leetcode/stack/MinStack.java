package io.acode.leetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
  final ArrayList<List<Integer>> stack;

  public MinStack() {
    stack = new ArrayList<>();
  }

  public void push(int val) {
    stack.add(List.of(val, Math.min(val, getMin())));
  }

  public void pop() {
    stack.remove(stack.size() - 1);
  }

  public int top() {
    return stack.get(stack.size() - 1).get(0);
  }

  public int getMin() {
    return stack.isEmpty() ? Integer.MAX_VALUE : stack.get(stack.size() - 1).get(1);
  }
}
