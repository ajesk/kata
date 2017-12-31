package io.acode.other;

/**
 * Given n stairs calculate the number of possible sequences of moves to reach the top step.
 *
 * For each move you can move up either 1 or 2 stairs.
 */
public class StepUp {

    int calculateMoves(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return calculateMoves(n - 1) + calculateMoves(n - 2);
    }
}
