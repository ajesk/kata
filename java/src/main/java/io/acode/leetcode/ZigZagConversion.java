package io.acode.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class ZigZagConversion {
  public String convert(String s, int numRows) {
    Queue[] queues = new Queue[numRows];

    for (int i = 0; i < numRows; i++) {
      queues[i] = new LinkedBlockingQueue<>();
    }

    int index = 0;
    boolean down = true;
    for (String s1 : s.split("")) {
      queues[index].add(s1);

      if (numRows != 1) {
        index = down ? index + 1 : index - 1;
      }
      if (index == 0) down = true;
      if (index == queues.length - 1) down = false;
    }

    StringBuilder out = new StringBuilder();
    for (int i = 0; i < numRows; i++) {
      while (!queues[i].isEmpty()) {
        out.append(queues[i].remove());
      }
    }
    return out.toString();
  }

  public String convert2(String s, int numRows) {

    if (numRows == 1) return s;

    List<StringBuilder> rows = new ArrayList<>();
    for (int i = 0; i < Math.min(numRows, s.length()); i++)
      rows.add(new StringBuilder());

    int curRow = 0;
    boolean goingDown = false;

    for (char c : s.toCharArray()) {
      rows.get(curRow).append(c);
      if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
      curRow += goingDown ? 1 : -1;
    }

    StringBuilder ret = new StringBuilder();
    for (StringBuilder row : rows) ret.append(row);
    return ret.toString();
  }
}
