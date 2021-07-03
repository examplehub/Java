package com.examplehub.datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.leetcode.ListNode;
import com.examplehub.utils.NodeUtils;
import org.junit.jupiter.api.Test;

class ReverseOutputLinkedListTest {
  @Test
  void testSolution1() {
    ListNode head = NodeUtils.makeList(1, 2, 3, 4, 5);
    assertEquals("5->4->3->2->1", ReverseOutputLinkedList.solution1(head));
  }

  @Test
  void testSolution2() {
    ListNode head = NodeUtils.makeList(1, 2, 3, 4, 5);
    assertEquals("5->4->3->2->1", ReverseOutputLinkedList.solution2(head));
  }
}
