package io.acode.leetcode.hashtable;

import java.util.*;

public class TimeMap {

  Map<String, TreeMap<Integer, String>> timeStore;

  public TimeMap() {
    timeStore = new HashMap<>();
  }

  public void set(String key, String value, int timestamp) {
    timeStore.computeIfAbsent(key, x -> new TreeMap<>());
    timeStore.get(key).put(timestamp, value);
  }

  public String get(String key, int timestamp) {
    if (!timeStore.containsKey(key)) return "";
    TreeMap<Integer, String> timeMapping = timeStore.get(key);
    Integer nearestTimestamp = timeMapping.floorKey(timestamp);

    return nearestTimestamp != null ? timeMapping.getOrDefault(nearestTimestamp, "") : "";
  }
}
