package com.examplehub.leetcode.middle;

import com.examplehub.leetcode.ListNode;
import com.examplehub.utils.NodeUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterNodeInLinkedListTest {
    @Test
    void testSolution1() {
        ListNode head = NodeUtils.makeList(2, 1, 5);
        assertTrue(Arrays.equals(new int[]{5, 5, 0}, NextGreaterNodeInLinkedList.solution1(head)));

        head = NodeUtils.makeList(2, 7, 4, 3, 5);
        assertTrue(Arrays.equals(new int[]{7, 0, 5, 5, 0}, NextGreaterNodeInLinkedList.solution1(head)));

        head = NodeUtils.makeList(1, 7, 5, 1, 9, 2, 5, 1);
        assertTrue(Arrays.equals(new int[]{7, 9, 9, 9, 0, 5, 0, 0}, NextGreaterNodeInLinkedList.solution1(head)));
    }
}