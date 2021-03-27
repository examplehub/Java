package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.leetcode.ListNode;
import org.junit.jupiter.api.Test;

class ConvertBinaryNumberInALinkedListToIntegerTest {
  @Test
  void testSolution1() {
    ListNode head = new ListNode(1);
    ListNode node2 = new ListNode(0);
    ListNode node3 = new ListNode(1);
    head.next = node2;
    node2.next = node3;

    assertEquals(ConvertBinaryNumberInALinkedListToInteger.solution1(head), 5);

    head = new ListNode(1);
    assertEquals(ConvertBinaryNumberInALinkedListToInteger.solution1(head), 1);

    head = new ListNode(0);
    assertEquals(ConvertBinaryNumberInALinkedListToInteger.solution1(head), 0);
  }
}
