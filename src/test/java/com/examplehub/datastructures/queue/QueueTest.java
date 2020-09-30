package com.examplehub.datastructures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void testQueue() {
        Queue<String> queue = new Queue<>(5);
        assertTrue(queue.empty());
        assertEquals(0, queue.size());
        assertEquals("[]", queue.toString());

        for (int i = 1; i <= 5; ++i) {
            queue.enqueue(i + "");
        }
        assertEquals(5, queue.size());
        assertTrue(queue.full());
        assertEquals("[1, 2, 3, 4, 5]", queue.toString());

        assertEquals("1", queue.dequeue());
        assertEquals("2", queue.dequeue());
        assertEquals("[3, 4, 5]", queue.toString());

        assertEquals("1", queue.enqueue("1"));
        assertEquals("2", queue.enqueue("2"));
        assertEquals("3", queue.front());
        assertEquals("2", queue.rear());
        assertTrue(queue.full());
        assertEquals("[3, 4, 5, 1, 2]", queue.toString());

        assertEquals("3", queue.dequeue());
        assertEquals("4", queue.dequeue());

        queue.clear();
        assertEquals(queue.size(), 0);
        assertTrue(queue.empty());
        assertEquals("[]", queue.toString());
    }
}