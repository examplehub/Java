package com.examplehub.datastructures.stack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import org.junit.jupiter.api.Test;

class TwoStackTest {
  @Test
  void testTwoStack() {
    TwoStack<Integer> stack = new TwoStack<>(7);

    assertTrue(stack.empty());
    assertEquals(0, stack.size());

    try {
      stack.pop1();
      fail(); /* this should will not happen */
    } catch (EmptyStackException e) {
      assertTrue(true); /* this should will happen */
    }

    try {
      stack.pop2();
      fail(); /* this should will not happen */
    } catch (EmptyStackException e) {
      assertTrue(true); /* this should will happen */
    }

    for (int i = 1; i <= 7; i++) {
      if (i % 2 == 0) {
        stack.push1(i);
      } else {
        stack.push2(i);
      }
    }

    assertTrue(stack.full());
    assertEquals(7, stack.size());

    try {
      stack.push1(666);
      fail(); /* this should will not happen */
    } catch (EmptyStackException e) {
      assertTrue(true); /* this should will happen */
    }

    try {
      stack.push2(666);
      fail(); /* this should will not happen */
    } catch (EmptyStackException e) {
      assertTrue(true); /* this should will happen */
    }

    assertEquals(6, stack.pop1());
    assertEquals(4, stack.pop1());
    assertEquals(2, stack.pop1());

    assertEquals(7, stack.pop2());
    assertEquals(5, stack.pop2());
    assertEquals(3, stack.pop2());
    assertEquals(1, stack.pop2());

    assertEquals(0, stack.size());
    assertTrue(stack.empty());
  }

  @Test
  void testClear() {
    TwoStack<String> stack = new TwoStack<>(10);
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        stack.push1(i + "");
      } else {
        stack.push2(i + "");
      }
    }
    stack.clear();
    assertTrue(stack.empty());
  }
}
