package io.acode.leetcode.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertInterval {

  public int[][] insert(int[][] intervals, int[] newInterval) {
    if (intervals.length == 0) return new int[][]{newInterval};
    List<List<Integer>> conjoined = new ArrayList<>();

    Integer start = newInterval[0];
    Integer end = newInterval[1];
    for (int[] interval : intervals) {
      if (end == Integer.MAX_VALUE) {
        conjoined.add(List.of(interval[0], interval[1]));
        continue;
      }
      if (interval[0] > end) {
        conjoined.add(List.of(start, end));
        end = Integer.MAX_VALUE;
        start = Integer.MIN_VALUE;
        conjoined.add(List.of(interval[0], interval[1]));
      } else if ((start >= interval[0] && start <= interval[1]) || end <= interval[1] || (start < interval[0] && end > interval[0])) {
        end = Math.max(interval[1], end);
        start = Math.min(interval[0], start);
      } else {
        conjoined.add(List.of(interval[0], interval[1]));
      }
    }
    if (end != Integer.MAX_VALUE) conjoined.add(List.of(start, end));

    int[][] result = new int[conjoined.size()][2];
    for (int i = 0; i < conjoined.size(); i++) {
      result[i] = new int[]{conjoined.get(i).get(0), conjoined.get(i).get(1)};
    }

    return result;
  }


  public int[][] insertExample(int[][] intervals, int[] newInterval) {
    // init data
    int newStart = newInterval[0];
    int newEnd = newInterval[1];
    int idx = 0;
    int n = intervals.length;
    LinkedList<int[]> output = new LinkedList<>();

    // add all intervals starting before newInterval
    while (idx < n && newStart > intervals[idx][0])
      output.add(intervals[idx++]);

    // add newInterval
    int[] interval;
    // if there is no overlap, just add the interval
    if (output.isEmpty() || output.getLast()[1] < newStart)
      output.add(newInterval);
      // if there is an overlap, merge with the last interval
    else {
      interval = output.removeLast();
      interval[1] = Math.max(interval[1], newEnd);
      output.add(interval);
    }

    // add next intervals, merge with newInterval if needed
    while (idx < n) {
      interval = intervals[idx++];
      int start = interval[0];
      int end = interval[1];
      // if there is no overlap, just add an interval
      if (output.getLast()[1] < start) output.add(interval);
        // if there is an overlap, merge with the last interval
      else {
        interval = output.removeLast();
        interval[1] = Math.max(interval[1], end);
        output.add(interval);
      }
    }
    return output.toArray(new int[output.size()][2]);
  }
}
