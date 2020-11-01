package com.examplehub.datastructures.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;

public class BasicBinaryTree<E> {

  /** The root node of binary tree. */
  Node<E> root;

  private final StringJoiner inOrderPath;
  private final StringJoiner preOrderPath;
  private final StringJoiner postOrderPath;
  private final StringJoiner levelOrderPath;

  /**
   * Construct binary tree from root node.
   *
   * @param root the root node of binary tree.
   */
  public BasicBinaryTree(Node<E> root) {
    this.root = root;
    this.inOrderPath = new StringJoiner("->");
    this.preOrderPath = new StringJoiner("->");
    this.postOrderPath = new StringJoiner("->");
    this.levelOrderPath = new StringJoiner("->");
  }

  public void inorder(Node<E> root) {
    if (root != null) {
      inorder(root.left);
      inOrderPath.add(root.value.toString());
      inorder(root.right);
    }
  }

  public String getInorder() {
    if (inOrderPath.length() == 0) {
      inorder(root);
    }
    return inOrderPath.toString();
  }

  public void preOrder(Node<E> root) {
    if (root != null) {
      preOrderPath.add(root.value.toString());
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  public String getPreOrder() {
    if (preOrderPath.length() == 0) {
      preOrder(root);
    }
    return preOrderPath.toString();
  }

  public void postOrder(Node<E> root) {
    if (root != null) {
      postOrder(root.left);
      postOrder(root.right);
      postOrderPath.add(root.value.toString());
    }
  }

  public String getPostOrder() {
    if (postOrderPath.length() == 0) {
      postOrder(root);
    }
    return postOrderPath.toString();
  }

  public void levelOrder(Node<E> root) {
    Queue<Node<E>> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node<E> tempNode = queue.poll();
      levelOrderPath.add(tempNode.value.toString());
      if (tempNode.left != null) {
        queue.add(tempNode.left);
      }
      if (tempNode.right != null) {
        queue.add(tempNode.right);
      }
    }
  }

  public String getLevelOrder() {
    if (levelOrderPath.length() == 0) {
      levelOrder(root);
    }
    return levelOrderPath.toString();
  }

  @Override
  public String toString() {
    return getInorder();
  }

  /**
   * Return a basic binary tree. See images/basic_binary_tree.png .
   *
   * @return a basic binary tree like images/basic_binary_tree.png.
   */
  public static BasicBinaryTree<Integer> getBasicBinaryTree() {
    Node<Integer> root = new Node<>(1);
    root.left = new Node<>(2);
    root.right = new Node<>(3);

    root.left.left = new Node<>(4);
    root.left.right = new Node<>(5);

    return new BasicBinaryTree<>(root);
  }
}
