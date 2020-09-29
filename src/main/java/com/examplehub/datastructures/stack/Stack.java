package com.examplehub.datastructures.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<E> {

    /**
     * Stack which stores elements.
     */
    private ArrayList<E> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the item to be pushed onto this stack.
     * @return the {@code item} argument.
     */
    public E push(E item) {
        stack.add(item);
        return item;
    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return The object at the top of this stack (the last pushed item).
     */
    public E pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    /**
     * Looks at the object at the top of this stack without removing it
     * from the stack.
     *
     * @return the object at the top of this stack (the last item pushed).
     * @throws EmptyStackException if the stack is empty.
     */
    public E peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return stack.get(size() - 1);
    }

    /**
     * Returns the number of elements in this stack.
     *
     * @return the number of elements in this stack.
     */
    int size() {
        return stack.size();
    }

    /**
     * Returns {@code true} if this stack contains no elements.
     *
     * @return {@code true} if this stack contains no elements, otherwise {@code false}.
     */
    public boolean empty() {
        return size() == 0;
    }

    /**
     * Clear all elements in the stack.
     */
    public void clear() {
        stack.clear();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
