package io.acode.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {

  public int[] dailyTemperatures(int[] temperatures) {
    Deque<Integer> stack = new ArrayDeque<>();

    int[] result = new int[temperatures.length];

    for (int currentDay = 0; currentDay < result.length; currentDay++) {
      int currentTemp = temperatures[currentDay];

      while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemp) {
        int previous = stack.pop();
        result[previous] = currentDay - previous;
      }

      stack.push(currentDay);
    }

    return result;
  }
}
