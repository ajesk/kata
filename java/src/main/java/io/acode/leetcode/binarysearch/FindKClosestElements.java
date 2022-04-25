package io.acode.leetcode.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindKClosestElements {
  public List<Integer> findClosestElements(int[] arr, int k, int x) {
    if (arr.length == k) {
      return Arrays.stream(arr).boxed().toList();
    }

    LinkedList<Integer> foundInts = new LinkedList<>();
    int left = 0;
    int right = arr.length - 1;
    int mid = 0;

    while (left + 1 < right) {
      mid = left + (right - left) / 2;
      if (Math.abs(arr[mid] - x) == 0) {
        break;
      } else if (arr[mid] < x) {
        left = mid;
      } else {
        right = mid - 1;
      }
    }
    int leftCount = 0;
    int rightCount = 0;
    for (int i = 0; i < k; i++) {
      int rightIndex = left + rightCount + 1;
      int leftIndex = left - leftCount;
      if (rightIndex > arr.length - 1 || (leftIndex >= 0 && Math.abs(arr[leftIndex] - x) <= Math.abs(arr[rightIndex] - x))) {
        foundInts.addFirst(arr[leftIndex]);
        leftCount++;
      } else {
        foundInts.addLast(arr[rightIndex]);
        rightCount++;
      }
    }
    return foundInts;
  }

  public List slidingWindowTechnique(int[] arr, int k, int x) {
    List<Integer> list = new ArrayList<>();
    int left = 0;
    int right = arr.length - k;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (x - arr[mid] > arr[mid + k] - x)
        left = mid + 1;
      else
        right = mid;
    }
    for (int i = left; i < left + k; i++)
      list.add(arr[i]);
    return list;
  }
}
