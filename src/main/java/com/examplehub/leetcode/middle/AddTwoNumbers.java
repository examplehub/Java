package com.examplehub.leetcode.middle;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    public static ListNode solution1(ListNode l1, ListNode l2) {
        StringBuilder builder1 = new StringBuilder();
        while (l1 != null) {
            builder1.append(l1.val);
            l1 = l1.next;
        }

        StringBuilder builder2 = new StringBuilder();
        while (l2 != null) {
            builder2.append(l2.val);
            l2 = l2.next;
        }

        /* calculate sum of two lists */
        int sum = Integer.parseInt(builder1.reverse().toString()) + Integer.parseInt(builder2.reverse().toString());

        /* construct a singly linked list with sum of two lists */
        ListNode head = null;
        ListNode tail = null;
        do {
            if (head == null) {
                tail = head = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            sum /= 10;
        } while (sum != 0);
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
