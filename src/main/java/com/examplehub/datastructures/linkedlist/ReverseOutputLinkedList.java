package com.examplehub.datastructures.linkedlist;

import com.examplehub.leetcode.ListNode;
import java.util.Stack;
import java.util.StringJoiner;

public class ReverseOutputLinkedList<E> {
  private static StringJoiner output1 = new StringJoiner("->");
  private static StringJoiner output2 = new StringJoiner("->");

  public static String solution1(ListNode head) {
    Stack stack = new Stack();
    while (head != null) {
      stack.add(head.val);
      head = head.next;
    }
    while (!stack.isEmpty()) {
      output1.add(stack.pop().toString());
    }
    return output1.toString();
  }

  public static String solution2(ListNode head) {
    reverseOutputReverse(head);
    return output2.toString();
  }

  public static void reverseOutputReverse(ListNode head) {
    if (head != null) {
      reverseOutputReverse(head.next);
      output2.add(head.val + "");
    }
  }
}
