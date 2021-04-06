package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {
    public static boolean solution1(ListNode head) {
        Set<ListNode> sets = new HashSet<>();
        while (head != null) {
            if (!sets.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static boolean solution2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
