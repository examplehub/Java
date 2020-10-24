package com.examplehub.datastructures.linkedlist;

import java.util.StringJoiner;

public class DoublyLinkedList<E> {

  /** The size of doubly linked list. */
  private int size;

  /** The head pointer of doubly linked list. */
  private Node<E> head;

  /** The tail pointer of doubly linked list. */
  private Node<E> tail;

  public DoublyLinkedList() {
    head = tail = null;
    size = 0;
  }

  /**
   * Insert a node to head of the DoublyLinkedList.
   *
   * @param data the data to be inserted.
   */
  public void insertHead(E data) {
    insertNth(0, data);
  }

  /**
   * Insert a node to tail of the DoublyLinkedList.
   *
   * @param data the data to be inserted.
   */
  public void insertTail(E data) {
    insertNth(size, data);
  }

  /**
   * Insert a new node at given index of the DoublyLinkedList.
   *
   * @param index the index to be inserted.
   * @param data the data of new node.
   */
  public void insertNth(int index, E data) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException(index + "");
    }
    Node<E> newNode = new Node<>(data);
    if (head == null) {
        /* the DoublyLinked list is empty */
      head = tail = newNode;
    } else if (index == 0) {
        /* insert at head */
      head.prev = newNode;
      newNode.next = head;
      head = newNode;
    } else if (index == size) {
        /* insert at tail */
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    } else {
        /* insert at middle */
      Node<E> temp = head;
      for (int i = 0; i < index; i++) {
        temp = temp.next;
      }
      temp.prev.next = newNode;
      newNode.prev = temp.prev;
      newNode.next = temp;
      temp.prev = newNode;
    }
    size++;
  }

  /**
   * Delete a node at the tail of DoublyLinkedList.
   *
   * @return deleted data.
   */
  public E deleteHead() {
    return deleteNth(0);
  }

  /**
   * Delete a node at the tail of DoublyLinkedList.
   *
   * @return deleted data.
   */
  public E deleteTail() {
    return deleteNth(size - 1);
  }

  /**
   * Delete a node of DoublyLinkedList at given index and return.
   *
   * @param index the index to be deleted.
   * @return data at given index of DoublyLinkedList.
   * @throws IndexOutOfBoundsException if given index is out of bounds.
   */
  public E deleteNth(int index) {
    if (index < 0 || index > size - 1) {
      throw new IndexOutOfBoundsException(index + "");
    }
    Node<E> deleteNode;
    if (size == 1) {
        /* just one node */
      deleteNode = head;
      head = tail = null;
    } else if (index == 0) {
      deleteNode = head;
      head = head.next;
      head.prev = null;
    } else if (index == size - 1) {
      deleteNode = tail;
      tail = tail.prev;
      tail.next = null;
    } else {
      Node<E> temp = head;
      for (int i = 0; i < index; i++) {
        temp = temp.next;
      }
      deleteNode = temp;
      temp.next.prev = temp.prev;
      temp.prev.next = temp.next;
    }
    size--;
    return deleteNode.data;
  }

  /**
   * Returns size of DoublyLinkedList.
   *
   * @return size of DoublyLinkedList.
   */
  public int size() {
    return size;
  }

  /**
   * Test if DoublyLinkedList is empty or not.
   *
   * @return {@code true} if DoublyLinkedList is empty, otherwise {@code false}.
   */
  public boolean empty() {
    return size == 0;
  }

  /**
   * To string from head to tail.
   *
   * @return string represent from head to tail of the DoublyLinkedList.
   */
  public String stringFromHeadToTail() {
    StringJoiner joiner = new StringJoiner("->");
    Node<E> temp = head;
    while (temp != null) {
      joiner.add(temp.data.toString());
      temp = temp.next;
    }
    joiner.add("NULL");
    return joiner.toString();
  }

  /**
   * To string from tail to head.
   *
   * @return string represent from head to tail of the DoublyLinkedList.
   */
  public String stringFromTailToHead() {
    StringJoiner joiner = new StringJoiner("->");
    Node<E> temp = tail;
    while (temp != null) {
      joiner.add(temp.data.toString());
      temp = temp.prev;
    }
    joiner.add("NULL");
    return joiner.toString();
  }

  @Override
  public String toString() {
    return stringFromHeadToTail();
  }

  static class Node<E> {
    E data;
    Node<E> prev; /* the pointer of previous node */
    Node<E> next; /* the pointer of next node */

    Node(E data) {
      this.data = data;
      this.prev = this.next = null;
    }
  }
}
