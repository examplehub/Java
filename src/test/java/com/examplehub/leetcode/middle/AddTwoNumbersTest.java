package com.examplehub.leetcode.middle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

  @Test
  void solution1() {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);
    l1.next.next.next = null;

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    l2.next.next.next = null;

    assertEquals(l1.next.next.val, 3);
    assertEquals(l2.next.next.val, 4);

    ListNode result = AddTwoNumbers.solution1(l1, l2);

    StringBuilder builder = new StringBuilder();
    while (result != null) {
      builder.append(result.val).append("->");
      result = result.next;
    }

    builder.append("NULL");
    assertEquals("7->0->8->NULL", builder.toString());

    l1 = new ListNode(0);
    l2 = new ListNode(0);
    result = AddTwoNumbers.solution1(l1, l2);
    builder.delete(0, builder.length());
    while (result != null) {
      builder.append(result.val).append("->");
      result = result.next;
    }
    builder.append("NULL");
    assertEquals("0->NULL", builder.toString());
  }

  @Test
  void solution2() {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);
    l1.next.next.next = null;

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    l2.next.next.next = null;

    assertEquals(l1.next.next.val, 3);
    assertEquals(l2.next.next.val, 4);

    ListNode result = AddTwoNumbers.solution2(l1, l2);

    StringBuilder builder = new StringBuilder();
    while (result != null) {
      builder.append(result.val).append("->");
      result = result.next;
    }

    builder.append("NULL");
    assertEquals("7->0->8->NULL", builder.toString());

    l1 = new ListNode(0);
    l2 = new ListNode(0);
    result = AddTwoNumbers.solution2(l1, l2);
    builder.delete(0, builder.length());
    while (result != null) {
      builder.append(result.val).append("->");
      result = result.next;
    }
    builder.append("NULL");
    assertEquals("0->NULL", builder.toString());
  }
}
