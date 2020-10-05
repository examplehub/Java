package com.examplehub.datastructures.linkedlist;

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
        insertNth(size, data);
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
    public void insetTail(E data) {
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
     * Delete a node at the tail of SinglyLinkedList.
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
        return null;
    }
}
