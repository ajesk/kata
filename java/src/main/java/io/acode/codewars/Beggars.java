package io.acode.codewars;

import java.util.Arrays;

public class Beggars {

    public static int[] beggars(int[] values, int n) {
        int beggar = 0;
        int[] take = new int[n];
        Arrays.fill(take, 0);

        if (take.length == 0) return take;

        for (int s : values) {
            take[beggar] += s;
            beggar = beggar == n - 1 ? 0 : beggar + 1;
        }

        return take;
    }

}
