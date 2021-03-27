package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.ListNode;

/*
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class ConvertBinaryNumberInALinkedListToInteger {

  public static int solution1(ListNode head) {
    StringBuilder builder = new StringBuilder();
    while (head != null) {
      builder.append(head.val);
      head = head.next;
    }
    return Integer.parseInt(builder.toString(), 2);
  }
}
