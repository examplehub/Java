package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.ListNode;

/** https://leetcode.com/problems/remove-duplicates-from-sorted-list/ */
public class RemoveDuplicatesFromSortedList {

  public static ListNode solution1(ListNode head) {
    ListNode p = head;
    while (p != null && p.next != null) {
      if (p.val == p.next.val) {
        p.next = p.next.next;
      } else {
        p = p.next;
      }
    }
    return head;
  }
}
