package com.examplehub.datastructures.binarytree;

import java.util.StringJoiner;

public class BasicBinaryTree<E> {

    /**
     * The root node of binary tree.
     */
    Node<E> root;

    private final StringJoiner travelPathJoiner;

    /**
     * Construct binary tree from root node.
     *
     * @param root the root node of binary tree.
     */
    public BasicBinaryTree(Node<E> root) {
        this.root = root;
        this.travelPathJoiner = new StringJoiner("->");
    }

    public void inorder(Node<E> root) {
        if (root != null) {
            inorder(root.left);
            travelPathJoiner.add(root.value.toString());
            inorder(root.right);
        }
    }

    @Override
    public String toString() {
        inorder(root);
        return travelPathJoiner.toString();
    }

    /**
     * Return a basic binary tree. See images/basic_binary_tree.png .
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
