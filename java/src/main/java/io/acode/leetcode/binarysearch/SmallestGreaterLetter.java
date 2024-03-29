package io.acode.leetcode.binarysearch;

public class SmallestGreaterLetter {
  public char nextGreatestLetter(char[] letters, char target) {
    int left = 0;
    int right = letters.length - 1;

    while (left < right) {
      int mid = left + (right - left) / 2;

      if (letters[mid] == target || letters[mid] < target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return letters[left] > target ? letters[left] : letters[0];
  }
}
