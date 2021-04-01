package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    public static ListNode solution1(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        return prev;
    }
}
