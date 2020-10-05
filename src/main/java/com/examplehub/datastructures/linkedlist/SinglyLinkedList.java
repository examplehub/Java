package com.examplehub.datastructures.linkedlist;

import java.util.StringJoiner;

public class SinglyLinkedList<E> {

    /**
     * Head pointer of SinglyLinkedList.
     */
    private Node<E> head;

    /**
     * Tail pointer of SinglyLinkedList.
     */
    private Node<E> tail;

    /**
     * Size of SinglyLinkedList.
     */
    private int size;

    /**
     * Constructor
     */
    public SinglyLinkedList() {
        this.head = this.tail = null;
        this.size = 0;
    }

    /**
     * Returns size of SinglyLinkedList.
     *
     * @return size of SinglyLinkedList
     */
    public int size() {
        return size;
    }

    /**
     * Test if SinglyLinked is empty or not.
     *
     * @return {@code true} if SinglyLinkedList is empty, otherwise {@code false}.
     */
    public boolean empty() {
        return size == 0;
    }

    /**
     * Insert a node to end of SinglyLinkedList.
     *
     * @param data the data of new node.
     */
    public void insert(E data) {
        insertTail(data);
    }

    /**
     * Insert a node to head of SinglyLinkedList.
     *
     * @param data the data of new node.
     */
    public void insertHead(E data) {
        insertNth(0, data);
    }

    /**
     * Insert a node to end of SinglyLinkedList.
     *
     * @param data the data of new node.
     */
    public void insertTail(E data) {
        insertNth(size, data);
    }

    /**
     * Insert a new node at given index of SinglyLinkedList.
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
        if (head == null) { /* SinglyLinkedList is empty */
            this.head = this.tail = newNode;
        } else if (index == 0) { /* insert at head */
            newNode.next = head;
            this.head = newNode;
        } else if (index == size) { /* insert at tail */
            tail.next = newNode;
            tail = tail.next;
        } else { /* insert at middle */
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
     * Delete a node at the tail of SinglyLinkedList.
     *
     * @return deleted data.
     */
    public E delete() {
        return deleteTail();
    }

    /**
     * Delete a node at the head of SinglyLinkedList.
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
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException(index + "");
        }
        Node<E> deleteNode;
        if (size == 1) { /* just one node in SinglyLinkedList */
            deleteNode = head;
            tail = head = null;
        } else if (index == 0) {
            deleteNode = head;
            head = head.next;
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; ++i) {
                temp = temp.next;
            }
            deleteNode = temp.next;
            temp.next = temp.next.next;
        }
        size--;
        return deleteNode.data;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("->");
        Node<E> temp = head;
        while (temp != null) {
            joiner.add(temp.data.toString());
            temp = temp.next;
        }
        joiner.add("NULL");
        return joiner.toString();
    }
}