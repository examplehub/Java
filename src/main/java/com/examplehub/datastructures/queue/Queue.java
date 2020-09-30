package com.examplehub.datastructures.queue;

import java.util.StringJoiner;

public class Queue<E> {

    /**
     * Queue which store elements.
     */
    private final E[] queue;

    /**
     * The front index of this queue.
     */
    private int front;

    /**
     * The rear index of this queue.
     */
    private int rear;

    /**
     * Default initial capacity.
     */
    private final static int DEFAULT_CAPACITY = 10;

    /**
     * Capacity of queue.
     */
    private final int capacity;

    /**
     * The number of elements in this queue.
     */
    private int size;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        @SuppressWarnings("unchecked")
        E[] tempQueue = (E[]) new Object[capacity];
        this.queue = tempQueue;
        this.capacity = capacity;
        this.front = 0;
        this.rear = this.capacity - 1;
        this.size = 0;
    }

    /**
     * Added an item onto this queue.
     *
     * @param item the item to be added onto this queue.
     * @return the {@code item} argument.
     */
    public E enqueue(E item) {
        if (full()) {
            throw new StackOverflowError("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        return item;
    }

    /**
     * Remove an item from this queue.
     *
     * @return an item at the front of queue.
     */
    public E dequeue() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }
        E item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    /**
     * Get element at rear of this queue.
     *
     * @return element at rear of this queue.
     */
    public E rear() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[rear];
    }

    /**
     * Get element at front of this queue.
     *
     * @return element at front of this queue.
     */
    public E front() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    /**
     * Clear all elements in the stack.
     */
    public void clear() {
        for (int i = 0; i < capacity; ++i) {
            queue[i] = null; /* let GC do its work */
        }
        front = 0;
        rear = -1;
        size = 0;
    }

    /**
     * Returns {@code true} if this queue contains no elements.
     *
     * @return {@code true} if this queue contains no elements, otherwise {@code false}.
     */
    public boolean empty() {
        return size == 0;
    }

    /**
     * Returns {@code true} if this queue is full.
     *
     * @return {@code true} if this queue is full, otherwise {@code false}.
     */
    public boolean full() {
        return size == capacity;
    }

    /**
     * Returns the number of elements at this queue.
     *
     * @return the number of elements in this stack.
     */
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        if (!empty()) {
            for (int i = front; ; i = (i + 1) % capacity) {
                joiner.add(queue[i].toString());
                if (i == rear) {
                    break;
                }
            }
        }
        return joiner.toString();
    }
}
