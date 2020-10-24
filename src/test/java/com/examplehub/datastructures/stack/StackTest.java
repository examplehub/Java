package com.examplehub.datastructures.stack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import org.junit.jupiter.api.Test;

class StackTest {
  @Test
  void testStack() {
    Stack<String> stack = new Stack<>();

    assertEquals(stack.size(), 0);
    assertTrue(stack.empty());

    try {
      stack.pop();
      fail(); /* this will not happen */
    } catch (EmptyStackException e) {
      assertTrue(true); /* this will happen */
    }

    try {
      stack.peek();
      fail(); /* this will not happen */
    } catch (EmptyStackException e) {
      assertTrue(true); /* this will happen */
    }

    assertEquals("Java", stack.push("Java"));
    assertEquals("Python", stack.push("Python"));
    assertEquals("C", stack.push("C"));
    assertEquals("Shell", stack.push("Shell"));

    assertEquals("[Java, Python, C, Shell]", stack.toString());

    assertEquals("Shell", stack.peek());
    assertEquals("Shell", stack.pop());
    assertEquals("C", stack.pop());

    assertFalse(stack.empty());
    assertEquals(2, stack.size());
    assertEquals("[Java, Python]", stack.toString());

    stack.clear();
    assertTrue(stack.empty());
    assertEquals(0, stack.size());
    assertEquals("[]", stack.toString());
  }
}
