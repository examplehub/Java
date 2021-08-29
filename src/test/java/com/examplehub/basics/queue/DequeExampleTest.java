package com.examplehub.basics.queue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Deque;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

class DequeExampleTest {
  @Test
  void test() {
    Deque<String> deque = new LinkedList<>();
    deque.offerLast("A");
    deque.offerFirst("B");
    deque.offerLast("C");
    assertEquals("[B, A, C]", deque.toString());

    assertEquals("B", deque.peekFirst());
    assertEquals("C", deque.peekLast());

    assertEquals("B", deque.pollFirst());
    assertEquals("A", deque.pollFirst());
    assertEquals("C", deque.pollLast());

    assertEquals(0, deque.size());
  }
}
