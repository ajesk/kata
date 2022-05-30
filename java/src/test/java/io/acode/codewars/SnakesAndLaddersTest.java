package io.acode.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnakesAndLaddersTest {
  @Test
  public void exampleTests() {
    SnakesAndLadders game = new SnakesAndLadders();
    assertEquals("Player 1 is on square 38", game.play(1, 1));
    assertEquals("Player 1 is on square 44", game.play(1, 5));
    assertEquals("Player 2 is on square 31", game.play(6, 2));
    assertEquals("Player 1 is on square 25", game.play(1, 1));
  }

  @Test
  public void testBase() {
    SnakesAndLadders game = new SnakesAndLadders();
    assertEquals("Player 1 is on square 3", game.play(1, 2));
    assertEquals("Player 2 is on square 3", game.play(1, 2));
    assertEquals("Player 1 is on square 6", game.play(1, 2));
    assertEquals("Player 2 is on square 5", game.play(1, 1));
    assertEquals("Player 2 is on square 9", game.play(1, 3));
  }

  @Test
  public void testMultiPlayers() {
    SnakesAndLadders game = new SnakesAndLadders(4);
    assertEquals("Player 1 is on square 3", game.play(1, 2));
    assertEquals("Player 2 is on square 3", game.play(1, 2));
    assertEquals("Player 3 is on square 3", game.play(1, 2));
    assertEquals("Player 4 is on square 3", game.play(1, 2));
    assertEquals("Player 1 is on square 6", game.play(1, 2));
  }

  @Test
  public void testLadder() {
    SnakesAndLadders game = new SnakesAndLadders();
    assertEquals("Player 1 is on square 38", game.play(2, 0));
    assertEquals("Player 2 is on square 60", game.play(64, 0));
  }

  @Test
  public void testBounce() {
    SnakesAndLadders game = new SnakesAndLadders();
    game.play(98, 0);
    game.play(0, 1);
    assertEquals("Player 1 is on square 98", game.play(1, 3));
  }

  @Test
  public void testWin() {
    SnakesAndLadders game = new SnakesAndLadders();
    game.play(98, 0);
    game.play(0, 2);
    assertEquals("Player 1 Wins!", game.play(2, 0));
    assertEquals("Game over!", game.play(1, 0));
  }
}
