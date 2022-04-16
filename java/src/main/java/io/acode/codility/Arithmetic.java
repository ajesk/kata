package io.acode.codility;

import java.util.ArrayList;
import java.util.List;

public class Arithmetic {

    List<Integer> getDiffs(int[] A) {
        List<Integer> diffs = new ArrayList<>();
        for(int i = 0; i < A.length - 1; i++) {
            int current = A[i], next = A[i + 1];
            diffs.add(current - next);
        }
        return diffs;
    }

    int countSlices(List<Integer> diffs) {
        List<Integer> slices = new ArrayList<>();
        int totalCount = 0;
        for (int current = 0; current < diffs.size() - 1; current++) {
            int currentCount = 0;
            for (int next = current + 1; next < diffs.size() - 1; next++) {
                if (diffs.get(current).equals(diffs.get(next))) {
                    currentCount++;
                } else {
                    break;
                }
            }
            totalCount += currentCount;
        }
        return totalCount;
    }

    public int solution(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length - 2; i++) {
            // get diff
            int currentDiff = A[i + 1] - A[i];

            // find recursions
            for (int slice = i + 2; slice < A.length; slice++) {
                // if test slice works
                if (A[slice] - A[slice - 1] == currentDiff)
                    // increment
                    count++;
                else
                    // start again
                    break;
            }
        }
        return count;

    }
}
