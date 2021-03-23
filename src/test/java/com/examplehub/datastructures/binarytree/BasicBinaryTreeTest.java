package com.examplehub.datastructures.binarytree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BasicBinaryTreeTest {

  @Test
  void testBasicBinaryTree() {

    BasicBinaryTree<Integer> binaryTree = BasicBinaryTree.getBasicBinaryTree();

    assertEquals("1->2->4->5->3", binaryTree.getPreOrder());
    assertEquals("4->2->5->1->3", binaryTree.getInorder());
    assertEquals("4->5->2->3->1", binaryTree.getPostOrder());
    assertEquals("1->2->3->4->5", binaryTree.getLevelOrder());
    assertEquals(3, binaryTree.maxDepth(binaryTree.root));
    assertEquals(5, binaryTree.getNodeCount(binaryTree.root));
  }
}
