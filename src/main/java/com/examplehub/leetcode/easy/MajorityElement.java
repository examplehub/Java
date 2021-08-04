package com.examplehub.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

/** https://leetcode.com/problems/majority-element/ */
public class MajorityElement {
  public static int solution1(int... nums) {
    int majorityIndex = 0;
    int majorityTimes = 0;
    for (int i = 0; i < nums.length; ++i) {
      int countTimes = 0;
      for (int num : nums) {
        if (num == nums[i]) {
          countTimes++;
        }
      }
      if (countTimes > majorityTimes) {
        majorityTimes = countTimes;
        majorityIndex = i;
      }
    }
    return nums[majorityIndex];
  }

  public static int solution2(int... nums) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int majorityElement = 0;
    int majorityTimes = 0;
    for (int num : nums) {
      if (!hashMap.containsKey(num)) {
        hashMap.put(num, 0);
      }
      hashMap.put(num, hashMap.get(num) + 1);
      if (hashMap.get(num) > majorityTimes) {
        majorityElement = num;
        majorityTimes = hashMap.get(num);
      }
    }
    return majorityElement;
  }

  public static int solution3(int... nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }
}
