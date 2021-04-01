package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.leetcode.ListNode;
import com.examplehub.utils.NodeUtils;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedListTest {
  @Test
  void testSolution1() {
    ListNode head = NodeUtils.makeList(1, 1, 2);
    assertEquals("1->1->2", head.toString());
    RemoveDuplicatesFromSortedList.solution1(head);
    assertEquals("1->2", head.toString());

    head = NodeUtils.makeList(1, 1, 2, 3, 3);
    assertEquals("1->1->2->3->3", head.toString());
    RemoveDuplicatesFromSortedList.solution1(head);
    assertEquals("1->2->3", head.toString());
  }
}
