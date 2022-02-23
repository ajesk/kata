package io.acode.codewars;

import java.util.HashMap;
import java.util.Map;

public class FindTheUniqueNumber {
  public static double findUniq(double arr[]) {
    Map<Double, Integer> counts = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      counts.put(arr[i], counts.getOrDefault(arr[i], 0) + 1);
      if (counts.size() == 2 && i >= 3) break;
    }

    return counts.entrySet()
      .stream()
      .filter(x -> x.getValue().equals(1))
      .map(Map.Entry::getKey)
      .findFirst()
      .orElse(-1.0);
  }
}
