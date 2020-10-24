package com.examplehub.datastructures.binarytree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {
  @Test
  void test() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    /* example binary search tree. See images/binary_search_tree.png */
    int[] nodes = {8, 3, 10, 1, 6, 14, 4, 7, 13};
    for (int node : nodes) {
      binarySearchTree.insert(node);
    }
    assertEquals("1->3->4->6->7->8->10->13->14", binarySearchTree.toString());
    assertEquals("1->3->4->6->7->8->10->13->14", binarySearchTree.getInorder());
    assertEquals("8->3->1->6->4->7->10->14->13", binarySearchTree.getPreOrder());
    assertEquals("1->4->7->6->3->13->14->10->8", binarySearchTree.getPostOrder());

    for (int key : nodes) {
      assertTrue(binarySearchTree.search(key));
    }

    assertFalse(binarySearchTree.search(15));
    assertTrue(binarySearchTree.search(7));
    assertTrue(binarySearchTree.search(10));
  }
}
