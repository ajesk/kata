package io.acode.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecretDetectiveTest {
  SecretDetective detective = new SecretDetective();

  @Test
  public void testBasic() {
    assertEquals("abc", detective.recoverSecret(new char[][]{{'a', 'b', 'c'}}));
    assertEquals("bcd", detective.recoverSecret(new char[][]{{'b', 'c', 'd'}}));
  }

  @Test
  public void testSecondTriplet() {
    assertEquals("abcd", detective.recoverSecret(new char[][]{
      {'a', 'b', 'c'},
      {'b', 'c', 'd'}
    }));

  }

  @Test
  public void secret1() {
    char[][] triplets = {
      {'t', 'u', 'p'},
      {'w', 'h', 'i'},
      {'t', 's', 'u'},
      {'a', 't', 's'},
      {'h', 'a', 'p'},
      {'t', 'i', 's'},
      {'w', 'h', 's'}
    };
    assertEquals("whatisup", detective.recoverSecret(triplets));
  }
}
