package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.ListNode;
import com.examplehub.maths.PalindromeNumber;
import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/palindrome-linked-list/ */
public class PalindromeLinkedList {
  public static boolean solution1(ListNode head) {
    int number = 0;
    while (head != null) {
      number = number * 10 + head.val;
      head = head.next;
    }
    return PalindromeNumber.isPalindrome(number);
  }

  public static boolean solution2(ListNode head) {
    List<Integer> numbers = new ArrayList<>();
    while (head != null) {
      numbers.add(head.val);
      head = head.next;
    }
    int[] intNumbers = numbers.stream().mapToInt(i -> i).toArray();

    for (int i = 0, j = intNumbers.length - 1; i < j; ++i, --j) {
      if (intNumbers[i] != intNumbers[j]) {
        return false;
      }
    }
    return true;
  }
}
