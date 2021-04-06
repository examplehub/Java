package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.ListNode;
import com.examplehub.utils.NodeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {
    @Test
    void testSolution1() {
        ListNode head = NodeUtils.makeList(1, 2, 2, 1);
        assertTrue(PalindromeLinkedList.solution1(head));

        head = NodeUtils.makeList(1, 2);
        assertFalse(PalindromeLinkedList.solution1(head));
    }

    @Test
    void testSolution2() {
        ListNode head = NodeUtils.makeList(1, 2, 2, 1);
        assertTrue(PalindromeLinkedList.solution2(head));

        head = NodeUtils.makeList(1, 2);
        assertFalse(PalindromeLinkedList.solution2(head));
    }

}