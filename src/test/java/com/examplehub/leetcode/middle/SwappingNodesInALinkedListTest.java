package com.examplehub.leetcode.middle;

import com.examplehub.leetcode.ListNode;
import com.examplehub.utils.NodeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwappingNodesInALinkedListTest {
    @Test
    void testSolution1() {
        ListNode head = NodeUtils.makeList(1, 2, 3, 4, 5);
        assertEquals("1->4->3->2->5", SwappingNodesInALinkedList.solution1(head, 2).toString());

        head = NodeUtils.makeList(7, 9, 6, 6, 7, 8, 3, 0, 9, 5);
        assertEquals("7->9->6->6->8->7->3->0->9->5", SwappingNodesInALinkedList.solution1(head, 5).toString());

        head = NodeUtils.makeList(1);
        assertEquals("1", SwappingNodesInALinkedList.solution1(head, 1).toString());

        head = NodeUtils.makeList(1, 2);
        assertEquals("2->1", SwappingNodesInALinkedList.solution1(head, 1).toString());

        head = NodeUtils.makeList(1, 2, 3);
        assertEquals("1->2->3", SwappingNodesInALinkedList.solution1(head, 2).toString());
    }
}