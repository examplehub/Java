package com.examplehub.datastructures.binarytree;

import java.util.StringJoiner;

public class BinarySearchTree<E extends Comparable<E>> {

    /**
     * The root node binary search tree.
     */
    private Node<E> root;

    private final StringJoiner inOrderPath;
    private final StringJoiner preOrderPath;
    private final StringJoiner postOrderPath;

    public BinarySearchTree() {
        inOrderPath = new StringJoiner("->");
        preOrderPath = new StringJoiner("->");
        postOrderPath = new StringJoiner("->");
        root = null;
    }

    public void insert(E key) {
        root = insert(root, key);
    }

    public Node<E> insert(Node<E> root, E key) {
        if (root == null) {
            root = new Node<>(key);
        } else if (key.compareTo(root.value) > 0) {
            root.right = insert(root.right, key);
        } else if (key.compareTo(root.value) < 0) {
            root.left = insert(root.left, key);
        }
        return root;
    }

    public void delete(E key) {
        if (search(key)) {
            delete(root, key);
        }
    }

    public Node<E> delete(Node<E> root, E key) {
        if (root == null) {
            return null;
        }
        if (key.compareTo(root.value) < 0) {
            root.left = delete(root.left, key);
        } else if (key.compareTo(root.value) > 0) {
            root.right = delete(root.right, key);
        } else {
            //TODO
        }
        return null;
    }

    public boolean search(E key) {
        return search(root, key);
    }

    public boolean search(Node<E> root, E key) {
        if (root == null) {
            return false;
        }
        if (key.compareTo(root.value) == 0) {
            return true;
        } else if (key.compareTo(root.value) < 0) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
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

    @Override
    public String toString() {
        return getInorder();
    }
}
