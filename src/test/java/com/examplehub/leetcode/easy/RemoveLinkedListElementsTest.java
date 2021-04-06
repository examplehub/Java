package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.leetcode.ListNode;
import com.examplehub.utils.NodeUtils;
import org.junit.jupiter.api.Test;

class RemoveLinkedListElementsTest {
  @Test
  void testSolution1() {
    ListNode head = NodeUtils.makeList(1, 2, 6, 3, 4, 5, 6);
    assertEquals("1->2->3->4->5", RemoveLinkedListElements.solution1(head, 6).toString());

    head = NodeUtils.makeList();
    assertSame(null, RemoveLinkedListElements.solution1(head, 1));

    head = NodeUtils.makeList(7, 7, 7, 7);
    assertSame(null, RemoveLinkedListElements.solution1(head, 7));
  }

  @Test
  void testSolution2() {
    ListNode head = NodeUtils.makeList(1, 2, 6, 3, 4, 5, 6);
    assertEquals("1->2->3->4->5", RemoveLinkedListElements.solution2(head, 6).toString());

    head = NodeUtils.makeList();
    assertSame(null, RemoveLinkedListElements.solution2(head, 1));

    head = NodeUtils.makeList(7, 7, 7, 7);
    assertSame(null, RemoveLinkedListElements.solution2(head, 7));
  }
}
