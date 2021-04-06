package com.examplehub.utils;

import com.examplehub.leetcode.ListNode;
import java.util.StringJoiner;

public class NodeUtils {
  public static String toString(ListNode head) {
    ListNode current = head;
    StringJoiner joiner = new StringJoiner("->");
    while (current != null) {
      joiner.add(current.val + "");
      current = current.next;
    }
    joiner.add("NULL");
    return joiner.toString();
  }

  public static ListNode makeList(int... numbers) {
    ListNode head = null;
    ListNode tail = null;
    for (int number : numbers) {
      ListNode newNode = new ListNode(number);
      newNode.next = null;
      if (head == null) {
        tail = head = newNode;
      } else {
        tail.next = newNode;
        tail = tail.next;
      }
    }
    return head;
  }

  public static int length(ListNode head) {
    int count = 0;
    ListNode cur = head;
    while (cur != null) {
      cur = cur.next;
      count++;
    }
    return count;
  }
}
