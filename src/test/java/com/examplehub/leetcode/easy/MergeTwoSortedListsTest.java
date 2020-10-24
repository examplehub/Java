package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.leetcode.ListNode;
import com.examplehub.utils.NodeUtils;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {
  @Test
  void testSolution1() {
    ListNode l1 = NodeUtils.makeList(1, 2, 3);
    ListNode l2 = NodeUtils.makeList(1, 3, 4);
    assertEquals(
        "1->1->2->3->3->4->NULL", NodeUtils.toString(MergeTwoSortedLists.solution1(l1, l2)));

    l1 = NodeUtils.makeList();
    l2 = NodeUtils.makeList();
    assertEquals("NULL", NodeUtils.toString(MergeTwoSortedLists.solution1(l1, l2)));

    l1 = NodeUtils.makeList();
    l2 = NodeUtils.makeList(0);
    assertEquals("0->NULL", NodeUtils.toString(MergeTwoSortedLists.solution1(l1, l2)));
  }
}
