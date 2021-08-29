package com.examplehub.basics.queue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class QueueExampleTest {
    @Test
    void testAdd() {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        assertEquals("[A]", queue.toString());
    }
    @Test
    void testOffer() {
        Queue<String> queue = new LinkedList<>();
        assertTrue(queue.offer("A"));
        assertEquals("[A]", queue.toString());
    }

    @Test
    void testSize() {
        Queue<String> queue = new LinkedList<>();
        assertTrue(queue.offer("A"));
        assertEquals(1, queue.size());
    }

    @Test
    void testRemove() {
        Queue<String> queue = new LinkedList<>();
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("B"));
        assertTrue(queue.offer("C"));
        assertTrue(queue.offer("D"));

        assertEquals("A", queue.remove());
        assertEquals("B", queue.remove());
        assertEquals("C", queue.remove());
        assertEquals("D", queue.remove());

        assertEquals(0, queue.size());
        try {
            queue.remove();
            fail();
        } catch (NoSuchElementException e) {
            assertTrue(true);
        }
    }

    @Test
    void testPool() {
        Queue<String> queue = new LinkedList<>();
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("B"));
        assertTrue(queue.offer("C"));
        assertTrue(queue.offer("D"));

        assertEquals("A", queue.poll());
        assertEquals("B", queue.poll());
        assertEquals("C", queue.poll());
        assertEquals("D", queue.poll());

        assertEquals(0, queue.size());

        assertNull(queue.poll());
    }

    @Test
    void testPeek() {
        Queue<String> queue = new LinkedList<>();
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("B"));
        assertTrue(queue.offer("C"));
        assertTrue(queue.offer("D"));

        assertEquals("A", queue.peek());
        assertEquals("A", queue.peek());
    }

    @Test
    void testElement() {
        Queue<String> queue = new LinkedList<>();
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("B"));
        assertTrue(queue.offer("C"));
        assertTrue(queue.offer("D"));

        assertEquals("A", queue.element());
        assertEquals("A", queue.element());
    }
}