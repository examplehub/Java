package com.examplehub.datastructures.queue;

import com.examplehub.datastructures.linkedlist.Node;

import java.util.StringJoiner;

public class LinkedQueue<E> {

    /**
     * The front pointer of LinkedQueue.
     */
    private Node<E> front;

    /**
     * The rear pointer of LinkedQueue.
     */
    private Node<E> rear;

    /**
     * The number of elements in LinkedQueue.
     */
    private int size;

    public LinkedQueue() {
        front = rear = null;
    }

    /**
     * Remove item from the front of LinkedQueue.
     *
     * @return the item at the front of LinkedQueue.
     * @throws IllegalAccessError if LinkedQueue is empty.
     */
    public E dequeue() throws IllegalAccessException {
        if (size == 0) {
            throw new IllegalAccessException();
        }
        E retValue = front.data;
        if ((front = front.next) == null) {
            rear = null;
        }
        size--;
        return retValue;
    }

    /**
     * Added item to the rear of LinkedQueue.
     *
     * @param item the item to be added.
     * @return {@code true} if add successfully.
     */
    public boolean enqueue(E item) {
        Node<E> newNode = new Node<>(item);
        if (size == 0) {
            front = rear = newNode;
        } else {
            rear = rear.next = newNode;
        }
        size++;
        return true;
    }

    /**
     * Test if this queue is empty or not.
     *
     * @return {@code true} if
     */
    public boolean empty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" <- ");
        Node<E> temp = front;
        while (temp != null) {
            joiner.add(temp.data.toString());
            temp = temp.next;
        }
        return joiner.toString();
    }

    /**
     * Return the number of elements in this LinkedQueue.
     *
     * @return the number of elements in this LinkedQueue.
     */
    public int size() {
        return size;
    }

    /**
     * Clear all elements in the LinkedQueue.
     */
    public void clear() {
        front = rear = null;
        size = 0;
    }
}
