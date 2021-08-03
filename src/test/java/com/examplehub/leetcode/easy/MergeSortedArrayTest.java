package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
    @Test
    void testSolution1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        MergeSortedArray.solution1(nums1, 3, nums2, 3);
        assertEquals("[1, 2, 2, 3, 5, 6]", Arrays.toString(nums1));

        nums1 = new int[]{1};
        nums2 = new int[]{};
        MergeSortedArray.solution1(nums1, 1, nums2, 0);
        assertEquals("[1]", Arrays.toString(nums1));

        nums1 = new int[1];
        nums2 = new int[]{1};
        MergeSortedArray.solution1(nums1, 0, nums2, 1);
        assertEquals("[1]", Arrays.toString(nums1));
    }

    @Test
    void testSolution2() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        MergeSortedArray.solution2(nums1, 3, nums2, 3);
        assertEquals("[1, 2, 2, 3, 5, 6]", Arrays.toString(nums1));

        nums1 = new int[]{1};
        nums2 = new int[]{};
        MergeSortedArray.solution2(nums1, 1, nums2, 0);
        assertEquals("[1]", Arrays.toString(nums1));

        nums1 = new int[1];
        nums2 = new int[]{1};
        MergeSortedArray.solution2(nums1, 0, nums2, 1);
        assertEquals("[1]", Arrays.toString(nums1));
    }

    @Test
    void testSolution3() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        MergeSortedArray.solution3(nums1, 3, nums2, 3);
        assertEquals("[1, 2, 2, 3, 5, 6]", Arrays.toString(nums1));

        nums1 = new int[]{1};
        nums2 = new int[]{};
        MergeSortedArray.solution3(nums1, 1, nums2, 0);
        assertEquals("[1]", Arrays.toString(nums1));

        nums1 = new int[1];
        nums2 = new int[]{1};
        MergeSortedArray.solution3(nums1, 0, nums2, 1);
        assertEquals("[1]", Arrays.toString(nums1));
    }

    @Test
    void testSolution4() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        MergeSortedArray.solution4(nums1, 3, nums2, 3);
        assertEquals("[1, 2, 2, 3, 5, 6]", Arrays.toString(nums1));

        nums1 = new int[]{1};
        nums2 = new int[]{};
        MergeSortedArray.solution4(nums1, 1, nums2, 0);
        assertEquals("[1]", Arrays.toString(nums1));

        nums1 = new int[1];
        nums2 = new int[]{1};
        MergeSortedArray.solution4(nums1, 0, nums2, 1);
        assertEquals("[1]", Arrays.toString(nums1));
    }

}