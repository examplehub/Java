package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.ListNode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {
    public static ListNode solution1(ListNode l1, ListNode l2) {
        ListNode dumpNode = new ListNode();
        ListNode tail = dumpNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) {
            tail.next = l1;
        }
        if (l2 != null) {
            tail.next = l2;
        }
        return dumpNode.next;
    }
}
