package io.acode.leetcode.queue;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
  Queue<Integer> inQueue;
  Queue<Integer> outQueue;

  public StackUsingQueues() {
    inQueue = new LinkedList<>();
    outQueue = new LinkedList<>();
  }

  public void push(int x) {
    inQueue.add(x);
  }

  public int pop() {
    if (inQueue.isEmpty()) throw new EmptyStackException();
    while (inQueue.size() != 1) {
      outQueue.add(inQueue.poll());
    }
    int target = inQueue.poll();
    inQueue = outQueue;
    outQueue = new LinkedList<>();
    return target;
  }

  public int top() {
    int num = 0;
    if (inQueue.isEmpty()) throw new EmptyStackException();
    while (!inQueue.isEmpty()) {
      num = inQueue.poll();
      outQueue.add(num);
    }
    inQueue = outQueue;
    outQueue = new LinkedList<>();
    return num;
  }

  public boolean empty() {
    return inQueue.isEmpty() && outQueue.isEmpty();
  }
}
