package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImplementQueueUsingStacksTest {
  @Test
  void test() {
    ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
    queue.push(1);
    queue.push(2);
    queue.push(3);
    assertEquals(1, queue.peek());
    assertEquals(1, queue.pop());
    assertEquals(2, queue.pop());
    assertEquals(3, queue.pop());
    assertEquals(-1, queue.pop());
    assertTrue(queue.empty());
  }
}
