package com.examplehub.datastructures.stack;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {
    @Test
    void test() {
        LinkedStack<String> stack = new LinkedStack<>();

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

        assertTrue(stack.push("Java"));
        assertTrue(stack.push("Python"));
        assertTrue(stack.push("C"));
        assertTrue(stack.push("Shell"));
        assertTrue(stack.push("Go"));

        assertEquals("[Go, Shell, C, Python, Java]", stack.toString());

        assertEquals("Go", stack.peek());
        assertEquals("Go", stack.pop());
        assertEquals("Shell", stack.pop());

        assertFalse(stack.empty());
        assertEquals(3, stack.size());
        assertEquals("[C, Python, Java]", stack.toString());

        stack.clear();
        assertTrue(stack.empty());
        assertEquals(0, stack.size());
        assertEquals("[]", stack.toString());
    }
}