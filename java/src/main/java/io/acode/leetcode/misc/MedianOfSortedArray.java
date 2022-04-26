package io.acode.leetcode.misc;

import java.util.Arrays;

public class MedianOfSortedArray {
    private double mergeSolution(int[] nums1, int[] nums2) {
        int[] mergeArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergeArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergeArray, nums1.length, nums2.length);
        int[] mergedSort = Arrays.stream(mergeArray).sorted().toArray();
        return mergedSort.length % 2 == 0 ?
                (mergedSort[mergedSort.length / 2] + mergedSort[mergedSort.length / 2 - 1]) / 2.0 :
                mergedSort[(int)(mergedSort.length / 2 + .5)];
    }

    private double countSolution(int[] nums1, int[] nums2) {
        int index1 = 0, index2 = 0;
        for (int i = 0; i < (nums1.length + nums2.length); i++) {

        }
        return 0.0;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return mergeSolution(nums1, nums2);
    }
}
