package com.examplehub.datastructures.stack;

import com.examplehub.datastructures.linkedlist.Node;

import java.util.EmptyStackException;
import java.util.StringJoiner;

public class LinkedStack<E> {

    /**
     * The top of the stack.
     */
    private Node<E> top;

    /**
     * Size of the stack.
     */
    private int size;

    /**
     * Constructor.
     */
    public LinkedStack() {
        top = null;
        size = 0;
    }

    /**
     * Added to element to the top of the stack.
     *
     * @param element the element to be added.
     * @return {@code true} if added successfully.
     */
    public boolean push(E element) {
        Node<E> newNode = new Node<>(element);
        if (top != null) {
            newNode.next = top;
        }
        top = newNode;
        size++;
        return true;
    }

    /**
     * Remove element from the top of the stack.
     *
     * @return top element of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public E pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        E retValue = top.data;
        top = top.next;
        size--;
        return retValue;
    }

    /**
     * Peek the top element of the stack.
     *
     * @return the top element of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public E peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    /**
     * Test if the stack is empty.
     *
     * @return {@code true} if the stack is empty, otherwise {@code false}.
     */
    public boolean empty() {
        return top == null;
    }

    /**
     * Remove all elements of the stack.
     */
    public void clear() {
        top = null;
        size = 0;
    }

    /**
     * Return size of the stack.
     *
     * @return size of the stack.
     */
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        Node<E> temp = top;
        while (temp != null) {
            joiner.add(temp.data.toString());
            temp = temp.next;
        }
        return joiner.toString();
    }
}
