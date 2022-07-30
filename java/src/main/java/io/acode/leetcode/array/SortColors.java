package io.acode.leetcode.array;

public class SortColors {

  public void sortColors(int[] nums) {
    int[] counts = new int[3];

    for (int num : nums) {
      counts[num]++;
    }

    int pointer = 0;
    for (int i = 0; i < counts.length; i++) {
      for (int j = 0; j < counts[i]; j++) {
        nums[pointer] = i;
        pointer++;
      }
    }
  }
}
