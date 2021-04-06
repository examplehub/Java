package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {
    @Test
    void testSolution1() {
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        assertTrue(LinkedListCycle.solution1(head));


        head = new ListNode(1);
        node2 = new ListNode(2);
        head.next = node2;
        node2.next = head;
        assertTrue(LinkedListCycle.solution1(head));

        head = new ListNode(1);
        assertFalse(LinkedListCycle.solution1(head));
    }

    @Test
    void testSolution2() {
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        assertTrue(LinkedListCycle.solution2(head));


        head = new ListNode(1);
        node2 = new ListNode(2);
        head.next = node2;
        node2.next = head;
        assertTrue(LinkedListCycle.solution2(head));

        head = new ListNode(1);
        assertFalse(LinkedListCycle.solution2(head));
    }
}