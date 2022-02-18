package io.acode.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestConsecutiveStringTest {
  @Test
  public void testSingular() {
    assertEquals("a", LongestConsecutiveString.longestConsec(new String[]{"a"}, 1));
  }

  @Test
  public void testSingularWith2Chars() {
    assertEquals("bb",
      LongestConsecutiveString.longestConsec(new String[]{"a", "bb"}, 1));
  }

  @Test
  public void testLongestConjoinedString() {
    assertEquals("abb",
      LongestConsecutiveString.longestConsec(new String[]{"a", "bb"}, 2));
  }

  @Test
  public void testLongestWithMultipleRanges() {
    assertEquals(LongestConsecutiveString.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
    assertEquals(LongestConsecutiveString.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
    assertEquals(LongestConsecutiveString.longestConsec(new String[] {}, 3), "");
    assertEquals(LongestConsecutiveString.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
    assertEquals(LongestConsecutiveString.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
    assertEquals(LongestConsecutiveString.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
    assertEquals(LongestConsecutiveString.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
    assertEquals(LongestConsecutiveString.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
    assertEquals(LongestConsecutiveString.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");
  }
}
