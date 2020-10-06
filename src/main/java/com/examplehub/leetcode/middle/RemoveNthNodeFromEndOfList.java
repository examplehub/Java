package com.examplehub.leetcode.middle;

import com.examplehub.leetcode.ListNode;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromEndOfList {
    public static ListNode solution1(ListNode head, int n) {
        int length = 0;

        /* calculate length of list */
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        if (length <= 1) {
            head = null;
        } else if (length == n) {
            head = head.next;
        } else {
            current = head;
            for (int i = 1; i <= length - n - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        return head;
    }
}