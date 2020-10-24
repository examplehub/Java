package com.examplehub.datastructures.stack;

import java.util.EmptyStackException;
import java.util.StringJoiner;

public class ArrayStack<E> {

  /** The stack array which store elements. */
  private final E[] stack;

  /** The number of elements in this stack. */
  private int size;

  /** The top pointer of this stack. */
  private int top;

  private final int capacity;

  /** Default initial capacity. */
  private static final int DEFAULT_CAPACITY = 10;

  public ArrayStack() {
    this(DEFAULT_CAPACITY);
  }

  public ArrayStack(int capacity) {
    @SuppressWarnings("unchecked")
    E[] tempStack = (E[]) new Object[capacity];
    stack = tempStack;
    this.capacity = capacity;
    top = -1;
    size = 0;
  }

  /**
   * Pushes an item onto the top of this stack.
   *
   * @param item the item to be pushed onto this stack.
   * @return the {@code item} argument.
   */
  public E push(E item) {
    if (full()) {
      throw new StackOverflowError("Stack is full");
    }
    stack[++top] = item;
    size++;
    return item;
  }

  /**
   * Removes the object at the top of this stack and returns that object as the value of this
   * function.
   *
   * @return The object at the top of this stack (the last pushed item).
   */
  public E pop() {
    if (empty()) {
      throw new EmptyStackException();
    }
    size--;
    return stack[top--];
  }

  /**
   * Looks at the object at the top of this stack without removing it from the stack.
   *
   * @return the object at the top of this stack (the last item pushed).
   * @throws EmptyStackException if the stack is empty.
   */
  public E peek() {
    if (empty()) {
      throw new EmptyStackException();
    }
    return stack[top];
  }

  /** Clear all elements in the stack. */
  public void clear() {
    for (int i = 0; i < size; ++i) {
      stack[i] = null; /* let GC do its work */
    }
    top = -1;
    size = 0;
  }

  /**
   * Returns the number of elements in this stack.
   *
   * @return the number of elements in this stack.
   */
  public int size() {
    return size;
  }

  /**
   * Returns {@code true} if this stack contains no elements.
   *
   * @return {@code true} if this stack contains no elements, otherwise {@code false}.
   */
  public boolean empty() {
    return size == 0;
  }

  /**
   * Returns {@code true} if this stack is full.
   *
   * @return {@code true} if this stack is full, otherwise {@code false}.
   */
  public boolean full() {
    return size == capacity;
  }

  @Override
  public String toString() {
    StringJoiner joiner = new StringJoiner(", ", "[", "]");
    for (int i = 0; i < size; ++i) {
      joiner.add(stack[i].toString());
    }
    return joiner.toString();
  }
}
