package com.examplehub.basics.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.Deque;
import org.junit.jupiter.api.Test;

class StackExampleTest {
  @Test
  void testPush() {
    Deque<String> stack = new ArrayDeque<>();
    stack.push("A");
    stack.push("B");
    stack.push("C");
    stack.push("D");
    assertEquals("[D, C, B, A]", stack.toString());
  }

  @Test
  void testPeek() {
    Deque<String> stack = new ArrayDeque<>();
    stack.push("A");
    stack.push("B");
    stack.push("C");
    stack.push("D");
    assertEquals("[D, C, B, A]", stack.toString());
    assertEquals("D", stack.peek());
  }

  @Test
  void testPop() {
    Deque<String> stack = new ArrayDeque<>();
    stack.push("A");
    stack.push("B");
    stack.push("C");
    stack.push("D");
    assertEquals("[D, C, B, A]", stack.toString());
    assertEquals("D", stack.pop());
    assertEquals("C", stack.pop());
    assertEquals("B", stack.pop());
    assertEquals("A", stack.peek());
  }
}
