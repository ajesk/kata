package io.acode.codewars;

import java.util.AbstractMap;
import java.util.Map;

public class SnakesAndLadders {
  private int turn = 0;
  private final int[] scores;
  private final Map<Integer, Integer> modifiers = Map.ofEntries(
    new AbstractMap.SimpleEntry<>(2, 38),
    new AbstractMap.SimpleEntry<>(7, 14),
    new AbstractMap.SimpleEntry<>(8, 31),
    new AbstractMap.SimpleEntry<>(15, 26),
    new AbstractMap.SimpleEntry<>(21, 42),
    new AbstractMap.SimpleEntry<>(28, 84),
    new AbstractMap.SimpleEntry<>(36, 44),
    new AbstractMap.SimpleEntry<>(51, 67),
    new AbstractMap.SimpleEntry<>(71, 91),
    new AbstractMap.SimpleEntry<>(78, 98),
    new AbstractMap.SimpleEntry<>(87, 94),
    new AbstractMap.SimpleEntry<>(16, 6),
    new AbstractMap.SimpleEntry<>(46, 25),
    new AbstractMap.SimpleEntry<>(49, 11),
    new AbstractMap.SimpleEntry<>(62, 19),
    new AbstractMap.SimpleEntry<>(64, 60),
    new AbstractMap.SimpleEntry<>(74, 53),
    new AbstractMap.SimpleEntry<>(89, 68),
    new AbstractMap.SimpleEntry<>(92, 88),
    new AbstractMap.SimpleEntry<>(95, 75),
    new AbstractMap.SimpleEntry<>(99, 80)
  );

  public SnakesAndLadders(int players) {
    this.scores = new int[players];
  }

  public SnakesAndLadders() {
    this(2);
  }

  public String play(int die1, int die2) {
    for (int score : scores) {
      if (score == 100) return "Game over!";
    }
    scores[turn] += die1 + die2;

    if (scores[turn] > 100) {
      scores[turn] = scores[turn] - (scores[turn] - 100) * 2;
    }

    if (modifiers.containsKey(scores[turn])) {
      scores[turn] = modifiers.get(scores[turn]);
    }

    if (scores[turn] == 100) {
      return "Player " + (turn + 1) + " Wins!";
    }
    String result = "Player " + (turn + 1) + " is on square " + scores[turn];
    if (die1 != die2) {
      turn++;
      if (turn == scores.length) turn = 0;
    }
    return result;
  }
}
