package io.acode.leetcode.binarysearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
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

    Set<Integer> result = findIntersection(arr1, arr2);
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  private Set<Integer> findIntersection(int[] arr1, int[] arr2) {
    Set<Integer> result = new HashSet<>();
    for (int i = 0; i < arr1.length; i++) {
      int target = arr1[i];
      if (result.contains(target)) continue;

      int left = 0;
      int right = arr2.length - 1;
      while (left < right) {
        int mid = left + (right - left) / 2;
        if (arr2[mid] == target) {
          result.add(target);
          break;
        } else if (arr2[mid] > target) {
          right = mid;
        } else {
          left = mid + 1;
        }
        if (arr2[left] == target) result.add(target);
      }
    }
    return result;
  }
}
