package com.examplehub.basics.queue;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueExampleTest {
    @Test
    void testAdd() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("A");
        queue.add("C");
        queue.add("B");
        assertEquals("[A, C, B]", queue.toString());
    }

    @Test
    void testOffer() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("B"));
        assertTrue(queue.offer("C"));
        assertEquals("[A, B, C]", queue.toString());
    }

    @Test
    void testSize() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        assertTrue(queue.offer("A"));
        assertEquals(1, queue.size());
    }

    @Test
    void testRemove() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        assertTrue(queue.offer("B"));
        assertTrue(queue.offer("D"));
        assertTrue(queue.offer("C"));
        assertTrue(queue.offer("A"));

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
    void testPoll() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        assertTrue(queue.offer("B"));
        assertTrue(queue.offer("D"));
        assertTrue(queue.offer("C"));
        assertTrue(queue.offer("A"));

        assertEquals("A", queue.poll());
        assertEquals("B", queue.poll());
        assertEquals("C", queue.poll());
        assertEquals("D", queue.poll());

        assertEquals(0, queue.size());

        assertNull(queue.poll());
    }

    @Test
    void testPeek() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        assertTrue(queue.offer("B"));
        assertTrue(queue.offer("C"));
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("D"));

        assertEquals("A", queue.peek());
        assertEquals("A", queue.peek());
    }

    @Test
    void testElement() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        assertTrue(queue.offer("B"));
        assertTrue(queue.offer("C"));
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("D"));

        assertEquals("A", queue.element());
        assertEquals("A", queue.element());
    }

    @Test
    void testComparable() {
        class User implements Comparable<User>{
            private String username;

            public User(String username) {
                this.username = username;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            @Override
            public String toString() {
                return username;
            }

            @Override
            public int compareTo(User o) {
                return this.getUsername().compareTo(o.getUsername());
            }
        }

        PriorityQueue<User> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new User("google"));
        priorityQueue.add(new User("apple"));
        priorityQueue.add(new User("alibaba"));
        priorityQueue.add(new User("microsoft"));
        priorityQueue.add(new User("zoom"));

        assertNotNull(priorityQueue.peek());
        assertEquals("alibaba", priorityQueue.poll().getUsername());

        assertNotNull(priorityQueue.peek());
        assertEquals("apple", priorityQueue.peek().getUsername());

        assertNotNull(priorityQueue.peek());
        assertEquals("apple", priorityQueue.poll().getUsername());

        assertEquals("[google, microsoft, zoom]", priorityQueue.toString());
    }

    @Test
    void testComparator() {
        class User {
            private String username;

            public User(String username) {
                this.username = username;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            @Override
            public String toString() {
                return username;
            }
        }

        PriorityQueue<User> priorityQueue = new PriorityQueue<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getUsername().compareTo(o2.getUsername());
            }
        });
        priorityQueue.add(new User("google"));
        priorityQueue.add(new User("apple"));
        priorityQueue.add(new User("alibaba"));
        priorityQueue.add(new User("microsoft"));
        priorityQueue.add(new User("zoom"));

        assertNotNull(priorityQueue.peek());
        assertEquals("alibaba", priorityQueue.poll().getUsername());

        assertNotNull(priorityQueue.peek());
        assertEquals("apple", priorityQueue.peek().getUsername());

        assertNotNull(priorityQueue.peek());
        assertEquals("apple", priorityQueue.poll().getUsername());

        assertEquals("[google, microsoft, zoom]", priorityQueue.toString());
    }
}