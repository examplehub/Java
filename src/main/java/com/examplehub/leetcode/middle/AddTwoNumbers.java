package com.examplehub.leetcode.middle;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    /* solution1 can't process large input */
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

    public static ListNode solution2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
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
