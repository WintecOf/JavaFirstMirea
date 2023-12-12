package ru.mirea.task30.Part2;

import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Поиск узла
    public Node bin_search(int key) {
        return bin_searchRec(root, key);
    }

    private Node bin_searchRec(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (key < root.key)
            return bin_searchRec(root.left, key);

        return bin_searchRec(root.right, key);
    }

    // Вставка узла
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Удаление узла
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);

            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    private int minValue(Node root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }

    // Вывод содержимого дерева (рекурсивный и итеративный)
    public void walk() {
        walkRec(root);
    }

    private void walkRec(Node root) {
        if (root != null) {
            walkRec(root.left);
            System.out.print(root.key + " ");
            walkRec(root.right);
        }
    }

    public void traverse() {
        if (root == null)
            return;

        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.key + " ");

            current = current.right;
        }
    }

    // Поиск максимума
    public Node tree_maximum() {
        return tree_maximumRec(root);
    }

    private Node tree_maximumRec(Node root) {
        if (root == null)
            return null;

        while (root.right != null)
            root = root.right;

        return root;
    }

    // Поиск минимума
    public Node tree_minimum() {
        return tree_minimumRec(root);
    }

    private Node tree_minimumRec(Node root) {
        if (root == null)
            return null;

        while (root.left != null)
            root = root.left;

        return root;
    }


    // Удаление отдельного узла и его потомков
    public void destroy(int key) {
        root = destroyRec(root, key);
    }

    private Node destroyRec(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.key) {
            root.left = destroyRec(root.left, key);
        } else if (key > root.key) {
            root.right = destroyRec(root.right, key);
        } else {
            root = null; // Удаление узла и его потомков
        }

        return root;
    }
}