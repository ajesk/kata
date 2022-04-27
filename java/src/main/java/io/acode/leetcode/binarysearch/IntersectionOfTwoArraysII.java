package io.acode.leetcode.binarysearch;

import java.util.*;

public class IntersectionOfTwoArraysII {
  public int[] intersection(int[] nums1, int[] nums2) {
    int[] arr1;
    int[] arr2;

    if (nums1.length > nums2.length) {
      arr1 = nums2;
      arr2 = Arrays.stream(nums1).sorted().toArray();
    } else {
      arr1 = nums1;
      arr2 = Arrays.stream(nums2).sorted().toArray();
    }

    if (arr2.length == 1 && arr1[0] == arr2[0]) {
      return arr1;
    }

    Map<Integer, Integer> numberCount = new HashMap<>();
    for (int num : arr1) {
      if (numberCount.containsKey(num)) {
        numberCount.put(num, numberCount.get(num) + 1);
      } else {
        numberCount.put(num, 1);
      }
    }

    return findIntersection(numberCount, arr2).stream().mapToInt(Integer::intValue).toArray();
  }

  public List<Integer> findIntersection(Map<Integer, Integer> numberCount, int[] arr2) {
    List<Integer> result = new ArrayList<>();

    for (Integer target : numberCount.keySet()) {

      int left = 0;
      int right = arr2.length - numberCount.get(target);
      while (left < right) {
        int mid = left + (right - left) / 2;

        if (arr2[mid] >= target) {
          right = mid;
        } else {
          left = mid + 1;
        }
      }

      for (int i = 0; i < numberCount.get(target); i++) {
        if (arr2[i + left] == target) result.add(target);
      }
    }
    return result;
  }
}
