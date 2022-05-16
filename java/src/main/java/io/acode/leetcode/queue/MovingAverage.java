package io.acode.leetcode.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class MovingAverage {
  private final Queue<Integer> rollingAverage;
  private final int maxElements;
  private int runningTotal = 0;

  public MovingAverage(int size) {
    rollingAverage = new ArrayDeque<>();
    maxElements = size;
  }

  public void bump() {
    runningTotal -= rollingAverage.poll();
  }

  public double next(int val) {
    rollingAverage.offer(val);
    runningTotal += val;

    if (rollingAverage.size() > maxElements) bump();
    return runningTotal * 1.0 / rollingAverage.size();
  }
}
