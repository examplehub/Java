package com.examplehub.datastructures.linkedlist;

public class Node<E> {
  public Node<E> next;
  public E data;

  public Node() {
    this(null, null);
  }

  public Node(E data) {
    this(null, data);
  }

  public Node(Node<E> next, E data) {
    this.next = next;
    this.data = data;
  }
}
