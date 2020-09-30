package com.examplehub.datastructures.stack;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    @Test
    void testArrayStack() {
        ArrayStack<String> stack = new ArrayStack<>(5);

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
        assertEquals("Go", stack.push("Go"));

        assertTrue(stack.full());
        assertEquals("[Java, Python, C, Shell, Go]", stack.toString());

        assertEquals("Go", stack.peek());
        assertEquals("Go", stack.pop());
        assertEquals("Shell", stack.pop());

        assertFalse(stack.empty());
        assertEquals(3, stack.size());
        assertEquals("[Java, Python, C]", stack.toString());

        stack.clear();
        assertTrue(stack.empty());
        assertEquals(0, stack.size());
        assertEquals("[]", stack.toString());
    }
}