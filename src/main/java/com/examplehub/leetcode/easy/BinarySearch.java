package com.examplehub.leetcode.easy;

import com.examplehub.searches.BinarySearchRecursion;

/** https://leetcode.com/problems/binary-search/ */
public class BinarySearch {
  public static int solution1(int[] nums, int target) {
    com.examplehub.searches.BinarySearch binarySearch = new com.examplehub.searches.BinarySearch();
    return binarySearch.search(nums, target);
  }

  public static int solution2(int nums[], int target) {
    BinarySearchRecursion binarySearchRecursion = new BinarySearchRecursion();
    return binarySearchRecursion.search(nums, target);
  }
}
