package com.examplehub.utils;

import com.examplehub.leetcode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeUtilsTest {
    @Test
    void testLength() {
        ListNode head = NodeUtils.makeList();
        assertEquals(0, NodeUtils.length(head));

        head = NodeUtils.makeList(1, 2, 3, 4);
        assertEquals(4, NodeUtils.length(head));

        head = NodeUtils.makeList(6);
        assertEquals(1, NodeUtils.length(head));
    }
}