package com.examplehub.leetcode;

import java.util.StringJoiner;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode() {}

  public ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public String toString() {
    StringJoiner joiner = new StringJoiner("->");
    ListNode p = this;
    while (p != null) {
      joiner.add(p.val + "");
      p = p.next;
    }
    return joiner.toString();
  }
}
