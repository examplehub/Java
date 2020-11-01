package com.examplehub.datastructures.binarytree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BasicBinaryTreeTest {

  @Test
  void testBasicBinaryTree() {

    assertEquals("1->2->4->5->3", BasicBinaryTree.getBasicBinaryTree().getPreOrder());
    assertEquals("4->2->5->1->3", BasicBinaryTree.getBasicBinaryTree().getInorder());
    assertEquals("4->5->2->3->1", BasicBinaryTree.getBasicBinaryTree().getPostOrder());
    assertEquals("1->2->3->4->5", BasicBinaryTree.getBasicBinaryTree().getLevelOrder());
  }
}
