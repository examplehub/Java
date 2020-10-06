package com.examplehub.datastructures.linkedlist;

import java.util.StringJoiner;

public class CircleLinkedList<E> {

    /**
     * Head of CircleLinkedList.
     */
    private Node<E> head;

    /**
     * Tail of CircleLinkedList.
     */
    private Node<E> tail;

    /**
     * Count number of nodes in CircleLinkedList.
     */
    private int size;

    public CircleLinkedList() {
        head = tail = null;
        size = 0;
    }

    /**
     * Returns size of CircleLinkedList.
     *
     * @return size of CircleLinkedList
     */
    public int size() {
        return size;
    }

    /**
     * Test if CircleLinkedList is empty or not.
     *
     * @return {@code true} if CircleLinkedList is empty, otherwise {@code false}.
     */
    public boolean empty() {
        return size == 0;
    }

    /**
     * Insert a node to end of CircleLinkedList.
     *
     * @param data the data of new node.
     */
    public void insert(E data) {
        insertTail(data);
    }

    /**
     * Insert a node to head of CircleLinkedList.
     *
     * @param data the data of new node.
     */
    public void insertHead(E data) {
        insertNth(0, data);
    }

    /**
     * Insert a node to end of CircleLinkedList.
     *
     * @param data the data of new node.
     */
    public void insertTail(E data) {
        insertNth(size, data);
    }

    /**
     * Insert a new node at given index of CircleLinkedList.
     *
     * @param index the index to be deleted.
     * @param data  the data of new node.
     * @throws IndexOutOfBoundsException if index is invalid.
     */
    public void insertNth(int index, E data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index + "");
        }
        Node<E> newNode = new Node<>(data);
        if (size == 0) { /* CircleLinkedList is empty */
            newNode.next = newNode; /* first node points itself */
            tail = head = newNode;
        } else if (index == 0) {
            newNode.next = head;
            tail.next = head = newNode;
        } else if (index == size) {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = tail.next;
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; ++i) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    /**
     * Delete a node at the tail of CircleLinkedList.
     *
     * @return deleted data.
     */
    public E delete() {
        return deleteTail();
    }

    /**
     * Delete a node at the head of CircleLinkedList.
     *
     * @return deleted data.
     */
    public E deleteHead() {
        return deleteNth(0);
    }

    /**
     * Delete a node at the tail of CircleLinkedList.
     *
     * @return deleted data.
     */
    public E deleteTail() {
        return deleteNth(size - 1);
    }

    /**
     * Delete a node of SinglyLinkedList at given index and return.
     *
     * @param index the index to be deleted.
     * @return data at given index of SinglyLinkedList.
     * @throws IndexOutOfBoundsException if given index is out of bounds.
     */
    public E deleteNth(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException(index + "");
        }

        Node<E> deleteNode = head;
        if (size == 1) { /* just one node */
            tail = head = null;
        } else if (index == 0) {
            tail.next = tail.next.next;
            head = head.next;
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; ++i) {
                temp = temp.next;
            }
            deleteNode = temp.next;
            temp.next = temp.next.next;
            if (index == size - 1) {
                tail = temp;
            }
        }
        size--;
        return deleteNode.data;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("->");
        Node<E> current = head;
        for (int i = 1; i <= size; ++i) {
            joiner.add(current.data.toString());
            current = current.next;
        }
        joiner.add("NULL");
        return joiner.toString();
    }
}
