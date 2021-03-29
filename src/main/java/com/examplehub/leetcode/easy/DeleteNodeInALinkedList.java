package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.ListNode;

/** https://leetcode.com/problems/delete-node-in-a-linked-list/solution/ */
public class DeleteNodeInALinkedList {
  public static void solution1(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }
}
