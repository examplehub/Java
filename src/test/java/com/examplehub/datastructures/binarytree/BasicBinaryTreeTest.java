package com.examplehub.datastructures.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicBinaryTreeTest {

    @Test
    void testBasicBinaryTree() {

        assertEquals("4->2->5->1->3", BasicBinaryTree.getBasicBinaryTree().toString());
    }
}