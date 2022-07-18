package io.acode.leetcode.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeMapTest {

  @Test
  void testInitialization() {
    TimeMap timeMap = new TimeMap();
    assertNotNull(timeMap);
    assertNotNull(timeMap.timeStore);
    assertTrue(timeMap.timeStore.isEmpty());
  }

  @Test
  void testSetValue() {
    TimeMap timeMap = new TimeMap();

    timeMap.set("aaa", "bbb", 1);
    assertEquals(1, timeMap.timeStore.size());
    assertTrue(timeMap.timeStore.containsKey("aaa"));
    assertTrue(timeMap.timeStore.get("aaa").containsKey(1));
    assertEquals("bbb", timeMap.timeStore.get("aaa").get(1));
    timeMap.set("aaa", "ccc", 2);
    assertEquals(2, timeMap.timeStore.get("aaa").size());
    timeMap.set("aaa", "ddd", 1);
    assertEquals(2, timeMap.timeStore.get("aaa").size());
    assertTrue(timeMap.timeStore.get("aaa").containsKey(2));
    assertEquals("ddd", timeMap.timeStore.get("aaa").get(1));
    timeMap.set("eee", "fff", 42);
    assertEquals(2, timeMap.timeStore.size());
  }

  @Test
  void testEmptyGet() {
    TimeMap timeMap = new TimeMap();

    assertTrue(timeMap.get("anything", 21).isEmpty());
  }

  @Test
  void testMatchingGet() {
    TimeMap timeMap = new TimeMap();

    timeMap.set("aaa", "bbb", 10);
    assertEquals("bbb", timeMap.get("aaa", 10));
  }

  @Test
  void testTimeStampUnderResultsInNotFound() {
    TimeMap timeMap = new TimeMap();
    assertEquals("", timeMap.get("aaa", 1));
  }

  @Test
  void testGetShouldGetNextLargestValue() {
    TimeMap timeMap = new TimeMap();
    timeMap.set("aaa", "bbb", 10);
    timeMap.set("aaa", "ccc", 20);
    timeMap.set("aaa", "ddd", 5);
    assertEquals("bbb", timeMap.get("aaa", 15));
    assertEquals("ccc", timeMap.get("aaa", 25));
  }

  @Test
  void testLeetFail() {
    TimeMap timeMap = new TimeMap();
    timeMap.set("love", "high", 10);
    timeMap.set("love", "low", 20);
    assertEquals("", timeMap.get("love", 5));
    assertEquals("high", timeMap.get("love", 10));
    assertEquals("high", timeMap.get("love", 15));
    assertEquals("low", timeMap.get("love", 20));
    assertEquals("low", timeMap.get("love", 25));

  }
}
