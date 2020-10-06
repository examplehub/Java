package com.examplehub.leetcode.middle;

import com.examplehub.leetcode.ListNode;
import com.examplehub.utils.NodeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveNthNodeFromEndOfListTest {

    @Test
    void testSolution1() {
        ListNode head = NodeUtils.makeList(1, 2, 3, 4, 5);
        assertEquals("1->2->3->4->5->NULL", NodeUtils.toString(head));

        head = RemoveNthNodeFromEndOfList.solution1(head, 2);
        assertEquals("1->2->3->5->NULL", NodeUtils.toString(head));

        head = NodeUtils.makeList(1, 2);
        assertEquals("1->2->NULL", NodeUtils.toString(head));
        head = RemoveNthNodeFromEndOfList.solution1(head, 1);
        assertEquals("1->NULL", NodeUtils.toString(head));

        head = NodeUtils.makeList(1);
        assertEquals("1->NULL", NodeUtils.toString(head));
        head = RemoveNthNodeFromEndOfList.solution1(head, 1);
        assertEquals("NULL", NodeUtils.toString(head));

        head = NodeUtils.makeList(1, 2);
        assertEquals("1->2->NULL", NodeUtils.toString(head));
        head = RemoveNthNodeFromEndOfList.solution1(head, 2);
        assertEquals("2->NULL", NodeUtils.toString(head));
    }
}