package io.acode.leetcode.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestGreaterLetterTest {
  SmallestGreaterLetter target = new SmallestGreaterLetter();

  @Test
  public void testBasic() {
    assertEquals('b', target.nextGreatestLetter(new char[]{'a','b'}, 'a'));
    assertEquals('a', target.nextGreatestLetter(new char[]{'a','b'}, 'b'));
  }

  @Test
  public void testLetters() {
    assertEquals('a', target.nextGreatestLetter(new char[]{'a','b','d'}, 'e'));
    assertEquals('b', target.nextGreatestLetter(new char[]{'a','b','d'}, 'a'));
    assertEquals('d', target.nextGreatestLetter(new char[]{'a','b','d'}, 'c'));
  }

  @Test
  public void testAllSame() {
    assertEquals('a', target.nextGreatestLetter(new char[]{'a','a','a','a'}, 'z'));
    assertEquals('a', target.nextGreatestLetter(new char[]{'a','a','a','a'}, 'a'));
  }

  @Test
  public void testOneDiff() {
    assertEquals('g', target.nextGreatestLetter(new char[]{'a','a','a','g'}, 'a'));
  }

  @Test
  public void testLeet() {
    assertEquals('c', target.nextGreatestLetter(new char[]{'c','f','j'}, 'a'));
    assertEquals('f', target.nextGreatestLetter(new char[]{'c','f','j'}, 'c'));
    assertEquals('f', target.nextGreatestLetter(new char[]{'c','f','j'}, 'd'));

  }
}
