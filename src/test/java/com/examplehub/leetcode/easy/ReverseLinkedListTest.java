package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.leetcode.ListNode;
import com.examplehub.utils.NodeUtils;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {
  @Test
  void testSolution1() {
    ListNode head = NodeUtils.makeList(1, 2, 3, 4, 5);
    assertEquals("5->4->3->2->1", ReverseLinkedList.solution1(head).toString());

    head = NodeUtils.makeList(1, 2);
    assertEquals("2->1", ReverseLinkedList.solution1(head).toString());

    head = NodeUtils.makeList();
    assertSame(null, ReverseLinkedList.solution1(head));
  }
}
