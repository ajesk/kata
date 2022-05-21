package io.acode.leetcode.bfs;

import java.util.*;

public class OpenTheLock {
  public int openLock(String[] deadends, String target) {
    Set<String> dead = new HashSet<>(Arrays.asList(deadends));
    Set<String> visited = new HashSet<>();
    Queue<String> lockTrial = new LinkedList<>();
    lockTrial.offer("0000");
    lockTrial.offer(null);
    visited.add("0000");
    int depth = 0;

    while (!lockTrial.isEmpty()) {
      String currentTrial = lockTrial.poll();

      if (currentTrial == null) {
        depth++;
        if (lockTrial.peek() != null) {
          lockTrial.offer(null);
        }
      } else if (currentTrial.equals(target)) {
        return depth;
      } else if (!dead.contains(currentTrial)) {
        for (int i = 0; i < 4; i++) {
          for (int d = -1; d <= 1; d += 2) {
            int y = ((currentTrial.charAt(i) - '0') + d + 10) % 10;
            String nextStr = currentTrial.substring(0, i) + ("" + y) + currentTrial.substring(i + 1);

            if (!visited.contains(nextStr)) {
              visited.add(nextStr);
              lockTrial.offer(nextStr);
            }
          }
        }
      }
    }
    return -1;
  }
}
