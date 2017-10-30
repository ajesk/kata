package io.acode.leetcode;

import java.util.Arrays;

public class MedianOfSortedArray {
    private double mergeSolution(int[] nums1, int[] nums2) {
        int[] mergeArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergeArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergeArray, nums1.length, nums2.length);
        int[] mergedSort = Arrays.stream(mergeArray).sorted().toArray();
        return mergedSort.length % 2 == 0 ?
                (mergedSort[mergedSort.length / 2] + mergedSort[mergedSort.length / 2 - 1]) / 2 :
                mergedSort[(int)(mergedSort.length / 2 + .5)];
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return mergeSolution(nums1, nums2);
    }
}
