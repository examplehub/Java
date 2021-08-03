package com.examplehub.leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public static void solution1(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int firstIndex = 0;
        int secondIndex = 0;
        int index = 0;
        while (firstIndex < m && secondIndex < n) {
            if (nums1[firstIndex] <= nums2[secondIndex]) {
                temp[index++] = nums1[firstIndex++];
            } else {
                temp[index++] = nums2[secondIndex++];
            }
        }
        while (firstIndex < m) {
            temp[index++] = nums1[firstIndex++];
        }
        while (secondIndex < n) {
            temp[index++] = nums2[secondIndex++];
        }
        System.arraycopy(temp, 0, nums1, 0, m + n);
    }

    public static void solution2(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public static void solution3(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted = new int[m + n];
        int firstIndex = 0;
        int secondIndex = 0;
        int index = 0;
        while (firstIndex < m || secondIndex < n) {
            if (firstIndex == m) {
                sorted[index++] = nums2[secondIndex++];
            } else if (secondIndex == n) {
                sorted[index++] = nums1[firstIndex++];
            } else if (nums1[firstIndex] <= nums2[secondIndex]) {
                sorted[index++] = nums1[firstIndex++];
            } else {
                sorted[index++] = nums2[secondIndex++];
            }
        }
        System.arraycopy(sorted, 0, nums1, 0, m + n);
    }

    public static void solution4(int[] nums1, int m, int[] nums2, int n) {
        int firstIndex = m - 1;
        int secondIndex = n - 1;
        int index = m + n - 1;
        while (firstIndex >= 0 || secondIndex >= 0) {
            if (firstIndex == -1) {
                nums1[index--] = nums2[secondIndex--];
            } else if (secondIndex == -1) {
                nums1[index--] = nums1[firstIndex--];
            } else if (nums1[firstIndex] >= nums2[secondIndex]) {
                nums1[index--] = nums1[firstIndex--];
            } else {
                nums1[index--] = nums2[secondIndex--];
            }
        }
    }
}
