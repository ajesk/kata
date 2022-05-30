package io.acode.codility;

import org.junit.jupiter.api.Test;

public class CoinsTest {
    Coins coiness = new Coins();
    @Test
    public void testError() {
        int[] coins = new int[] {1, 0, 0, 0, 0, 0};
        System.out.println(coiness.solution(coins));
    }

    @Test
    public void testError2() {
        int[] coins = new int[] {0, 0, 0, 0, 0, 0};
        System.out.println(coiness.solution(coins));
    }

    @Test
    public void testGiven() {
        int[] coins = new int[] {1, 1, 0, 1, 0, 0};
        System.out.println(coiness.solution(coins));
    }
}
