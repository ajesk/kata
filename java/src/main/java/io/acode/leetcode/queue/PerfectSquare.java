package io.acode.leetcode.queue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class PerfectSquare {
  public int numSquares(int n) {
    int count = 0;
    Queue<Integer> numbers = new LinkedList<>();
    Set<Integer> seen = new HashSet<>();
    numbers.offer(n);
    numbers.offer(null);

    while (!numbers.isEmpty()) {
      Integer current = numbers.poll();
      if (current == null) {
        count++;
        numbers.offer(null);
      } else if (current == 0) {
        return count;
      } else {
        int lowestRemainingRoot = (int) Math.floor(Math.sqrt(current));
        for (int i = 1; i < lowestRemainingRoot + 1; i++) {
          int next = (int) (current - Math.pow(i, 2));
          if (!seen.contains(next) && next >= 0) {
            seen.add(next);
            numbers.offer(next);

          }
        }
      }
    }
    return -1;
  }
}
