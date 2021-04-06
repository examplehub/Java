package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.ListNode;

/** https://leetcode.com/problems/remove-linked-list-elements/ */
public class RemoveLinkedListElements {
  public static ListNode solution1(ListNode head, int val) {
    ListNode header = new ListNode();
    header.next = head;
    ListNode cur = header;
    while (cur.next != null) {
      if (cur.next.val == val) {
        cur.next = cur.next.next;
      } else {
        cur = cur.next;
      }
    }
    return header.next;
  }

  public static ListNode solution2(ListNode head, int value) {
    if (head == null) {
      return null;
    }
    head.next = solution2(head.next, value);
    return head.val == value ? head.next : head;
  }
}
