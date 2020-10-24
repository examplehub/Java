package com.examplehub.datastructures.stack;

import java.util.EmptyStackException;

public class TwoStack<E> {

  /** The stack to store elements. */
  private final E[] stack;

  /** The default capacity. */
  private static final int DEFAULT_CAPACITY = 10;

  /** The capacity of this stack. */
  private final int capacity;

  /** The first top of first stack. */
  private int top1;

  /** The second top of second stack. */
  private int top2;

  public TwoStack() {
    this(DEFAULT_CAPACITY);
  }

  public TwoStack(int capacity) {
    @SuppressWarnings("unchecked")
    E[] tempStack = (E[]) new Object[capacity];
    stack = tempStack;
    this.capacity = capacity;
    this.top1 = -1;
    this.top2 = capacity;
  }

  /**
   * Push item to first stack.
   *
   * @param item the item to be added to first stack.
   * @return {@code true} if added successfully
   * @throws EmptyStackException if the stack is full.
   */
  public boolean push1(E item) {
    if (full()) {
      throw new EmptyStackException();
    }
    stack[++top1] = item;
    return true;
  }

  /**
   * Push item to second stack.
   *
   * @param item the item to be added to second stack.
   * @return {@code true} if added successfully
   * @throws EmptyStackException if the stack is full.
   */
  public boolean push2(E item) {
    if (full()) {
      throw new EmptyStackException();
    }
    stack[--top2] = item;
    return true;
  }

  /**
   * Remove item from the top of first stack.
   *
   * @return item at the top of first stack.
   * @throws EmptyStackException if first stack is empty.
   */
  public E pop1() {
    if (top1 == -1) {
      throw new EmptyStackException();
    }
    return stack[top1--];
  }

  /**
   * Remove item from the top of second stack.
   *
   * @return item at the top of second stack.
   * @throws EmptyStackException if second stack is empty.
   */
  public E pop2() {
    if (top2 == capacity) {
      throw new EmptyStackException();
    }
    return stack[top2++];
  }

  /**
   * Return the number of elements in this stack.
   *
   * @return size of this stack.
   */
  public int size() {
    return (top1 + 1) + (capacity - top2);
  }

  /** Clear all elements in the stack. */
  public void clear() {
    top1 = -1;
    top2 = capacity;
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
   * Test if this stack is full.
   *
   * @return {@code true} if this stack is full, otherwise {@code false}.
   */
  public boolean full() {
    return size() == capacity;
  }
}
