package io.acode.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {
  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));

    LinkedList<int[]> result = new LinkedList<>();
    int start = -1;
    int end = -1;
    for (int[] interval : intervals) {
      if (interval[0] > end) {
        result.add(new int[]{start, end});
        start = interval[0];
        end = interval[1];
      } else if (end < interval[1]){
        end = interval[1];
      }
    }
    if (!Arrays.equals(result.getLast(), new int[]{start, end})) {
      result.add(new int[]{start, end});
    }
    result.removeFirst();
    return result.toArray(new int[][]{});
  }
}
