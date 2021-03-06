package com.examplehub.datastructures.linkedlist;

import java.util.StringJoiner;

class SinglyLinkedListWithHead<E> {

  /** Head pointer of SinglyLinkedList. */
  private Node<E> head;

  /** Tail pointer of SinglyLinkedList. */
  private Node<E> tail;

  /** Size of SinglyLinkedList. */
  private int size;

  /** Constructor */
  public SinglyLinkedListWithHead() {
    this.head = this.tail = new Node<>();
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
   * Insert multi items to SinglyLinkedList.
   *
   * @param items the items to be inserted.
   */
  @SafeVarargs
  public final void insertHead(E... items) {
    for (E item : items) {
      insertHead(item);
    }
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
   * Insert multi items to SinglyLinkedList.
   *
   * @param items the items to be inserted.
   */
  @SafeVarargs
  public final void insertTail(E... items) {
    for (E item : items) {
      insertTail(item);
    }
  }

  /**
   * Insert a new node at given index of SinglyLinkedList.
   *
   * @param index the index to be inserted.
   * @param data the data of new node.
   * @throws IndexOutOfBoundsException if index is invalid.
   */
  public void insertNth(int index, E data) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException(index + "");
    }
    Node<E> newNode = new Node<>(data);
    if (index == size) {
      tail = tail.next = newNode;
      size++;
      return;
    }
    Node<E> cur = head;
    for (int i = 0; i < index; ++i) {
      cur = cur.next;
    }
    newNode.next = cur.next;
    cur.next = newNode;
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

  public E delete(E target) {
    Node cur = head;
    while (cur != null && cur.next != null && !cur.next.data.equals(target)) {
      cur = cur.next;
    }
    Node deletedNode = cur.next;
    cur.next = cur.next.next;
    return (E) deletedNode.data;
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
    Node<E> cur = head;
    for (int i = 0; i < index; ++i) {
      cur = cur.next;
    }
    Node<E> deleteNode = cur.next;
    cur.next = cur.next.next;
    E retElem = deleteNode.data;
    deleteNode = null; /* let GC do it work */
    if (size == 1) {
      tail = head;
    }
    size--;
    return retElem;
  }

  /**
   * Reverse singlyLinkedList
   *
   * @return reversed singlyLinkedList.
   */
  public SinglyLinkedListWithHead<E> reverse() {
    Node<E> prev = null;
    Node<E> current = this.head.next;
    this.tail = head.next;
    while (current != null) {
      Node<E> next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    this.head.next = prev;
    return this;
  }

  @Override
  public String toString() {
    StringJoiner joiner = new StringJoiner("->");
    Node<E> temp = head.next;
    while (temp != null) {
      joiner.add(temp.data.toString());
      temp = temp.next;
    }
    joiner.add("NULL");
    return joiner.toString();
  }
}
