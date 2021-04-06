package com.examplehub.leetcode.middle;

import com.examplehub.leetcode.ListNode;
import com.examplehub.utils.NodeUtils;

/** https://leetcode.com/problems/swapping-nodes-in-a-linked-list/ */
public class SwappingNodesInALinkedList {
  public static ListNode solution1(ListNode head, int k) {
    int length = NodeUtils.length(head);

    ListNode p1 = head;
    ListNode p2 = head;
    for (int i = 1; i <= length - k; ++i) {
      if (i <= k - 1) {
        p1 = p1.next;
      }
      p2 = p2.next;
    }
    int t = p1.val;
    p1.val = p2.val;
    p2.val = t;
    return head;
  }
}
