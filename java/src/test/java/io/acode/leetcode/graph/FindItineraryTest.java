package io.acode.leetcode.graph;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindItineraryTest {
  FindItinerary target = new FindItinerary();

  @Test
  public void testbasic() {
    assertEquals(List.of("JFK", "EWR"),
      target.findItinerary(List.of(List.of("JFK", "EWR"))));
  }

  @Test
  public void testBasicRoundTrip() {
    assertEquals(List.of("JFK", "EWR", "JFK"),
      target.findItinerary(List.of(List.of("JFK", "EWR"), List.of("EWR", "JFK"))));
  }

  @Test
  public void testLongOneWayTrip() {
    assertEquals(List.of("JFK", "EWR", "ORD", "MWD", "HNL"),
      target.findItinerary(List.of(List.of("ORD", "MWD"), List.of("MWD", "HNL"), List.of("JFK", "EWR"), List.of("EWR", "ORD"))));
  }

  @Test
  public void testMultiplePaths() {
    assertEquals(List.of("JFK","ATL","JFK","SFO","ATL","SFO"),
      target.findItinerary(List.of(List.of("JFK", "SFO"), List.of("JFK", "ATL"), List.of("SFO", "ATL"), List.of("ATL", "JFK"), List.of("ATL", "SFO"))));
  }
}
