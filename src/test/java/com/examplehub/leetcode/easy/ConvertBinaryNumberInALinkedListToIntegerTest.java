package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.leetcode.ListNode;
import com.examplehub.utils.NodeUtils;
import org.junit.jupiter.api.Test;

class ConvertBinaryNumberInALinkedListToIntegerTest {
  @Test
  void testSolution1() {

    ListNode head = NodeUtils.makeList(1, 0, 1);
    assertEquals("1->0->1", head.toString());
    assertEquals(ConvertBinaryNumberInALinkedListToInteger.solution1(head), 5);

    head = NodeUtils.makeList(1);
    assertEquals(ConvertBinaryNumberInALinkedListToInteger.solution1(head), 1);

    head = NodeUtils.makeList(0);
    assertEquals(ConvertBinaryNumberInALinkedListToInteger.solution1(head), 0);
  }
}
