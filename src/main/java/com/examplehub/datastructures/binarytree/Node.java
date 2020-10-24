package com.examplehub.datastructures.binarytree;

public class Node<E> {

  /** Node value of BinaryTree. */
  public E value;

  /** The pointer of left child. */
  public Node<E> left;

  /** The Pointer of right child. */
  public Node<E> right;

  public Node(E value) {
    this.value = value;
    left = right = null;
  }
}
