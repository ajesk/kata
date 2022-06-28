package io.acode.leetcode.dfs;

import java.util.*;

public class CourseSchedule {
  Map<Integer, List<Integer>> preReqMapping;
  Set<Integer> visited;
  int current;

  private boolean dfs(int origin) {
    List<Integer> nextClasses = preReqMapping.get(origin);
    if (nextClasses == null) return true;

    for (int nextClass : nextClasses) {
      if (nextClass == current) return false;
      if (visited.contains(nextClass)) continue;
      visited.add(nextClass);
      boolean test = dfs(nextClass);
      if (!test) return false;
    }

    return true;
  }

  public boolean canFinish(int numCourses, int[][] prerequisites) {
    preReqMapping = new HashMap<>();
    for (int[] prerequesite : prerequisites) {
      List<Integer> nextCourses = preReqMapping.getOrDefault(prerequesite[1], new ArrayList<>());
      nextCourses.add(prerequesite[0]);
      preReqMapping.put(prerequesite[1], nextCourses);
    }

    for (int i = 0; i < numCourses; i++) {
      visited = new HashSet<>();
      current = i;
      if (!dfs(i)) return false;
    }

    return true;
  }
}
