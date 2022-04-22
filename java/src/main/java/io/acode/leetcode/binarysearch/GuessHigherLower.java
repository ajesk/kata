package io.acode.leetcode.binarysearch;

public class GuessHigherLower {
  private int pick = 0;

  public void setPick(int pick) {
    this.pick = pick;
  }

  public int guess(int num) {
    if (num > pick) return -1;
    else if (num < pick) return 1;
    else return 0;
  }

  public int guessNumber(int n) {
    int max = n;
    int min = 1;

    while (max > min) {
      // alternate to (max + min) / 2
      int guessVal = min + (max - min) / 2;
      int guessResult = guess(guessVal);
      if (guessResult == 0) {
        return guessVal;
      } else if (guessResult == -1) {
        max = guessVal - 1;
      } else {
        min = guessVal + 1;
      }
    }

    return min;
  }
}
