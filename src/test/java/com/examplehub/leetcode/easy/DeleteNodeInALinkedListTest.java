package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.leetcode.ListNode;
import org.junit.jupiter.api.Test;

class DeleteNodeInALinkedListTest {
  @Test
  void testSolution1() {
    ListNode head = new ListNode(4);
    ListNode node2 = new ListNode(5);
    ListNode node3 = new ListNode(1);
    ListNode node4 = new ListNode(9);
    head.next = node2;
    node2.next = node3;
    node3.next = node4;
    assertEquals("4->5->1->9", head.toString());

    DeleteNodeInALinkedList.solution1(node2);
    assertEquals("4->1->9", head.toString());

    head = new ListNode(4);
    node2 = new ListNode(5);
    node3 = new ListNode(1);
    node4 = new ListNode(9);
    head.next = node2;
    node2.next = node3;
    node3.next = node4;
    assertEquals("4->5->1->9", head.toString());

    DeleteNodeInALinkedList.solution1(node3);
    assertEquals("4->5->9", head.toString());

    head = new ListNode(1);
    node2 = new ListNode(2);
    node3 = new ListNode(3);
    node4 = new ListNode(4);
    head.next = node2;
    node2.next = node3;
    node3.next = node4;
    assertEquals("1->2->3->4", head.toString());

    DeleteNodeInALinkedList.solution1(node3);
    assertEquals("1->2->4", head.toString());

    head = new ListNode(0);
    node2 = new ListNode(1);
    head.next = node2;
    assertEquals("0->1", head.toString());

    DeleteNodeInALinkedList.solution1(head);
    assertEquals("1", head.toString());

    head = new ListNode(-3);
    node2 = new ListNode(-5);
    node3 = new ListNode(-99);

    head.next = node2;
    node2.next = node3;
    assertEquals("-3->-5->-99", head.toString());

    DeleteNodeInALinkedList.solution1(head);
    assertEquals("-5->-99", head.toString());
  }
}
