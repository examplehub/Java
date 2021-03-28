package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.ListNode;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfTheLinkedList {

    public static ListNode solution1(ListNode head) {
        int len = 0;
        ListNode p = head;
        while (p != null) {
            len++;
            p = p.next;
        }
        p = head;
        for (int i = 1; i <= len / 2; i++) {
            p = p.next;
        }
        return p;
    }

    public static ListNode solution2(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p1 != null && p1.next != null) {
            p1 = p1.next.next;
            p2 = p2.next;
        }
        return p2;
    }
}
