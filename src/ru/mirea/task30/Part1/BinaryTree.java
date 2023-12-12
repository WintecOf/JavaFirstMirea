package ru.mirea.task30.Part1;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Определение высоты дерева
    public int getHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    // Реверс дерева
    public void reverseTree(Node root) {
        if (root == null) {
            return;
        } else {
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            reverseTree(root.left);
            reverseTree(root.right);
        }
    }

    // Поиск узла в дереве
    public boolean searchNode(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        boolean leftSearch = searchNode(root.left, key);
        boolean rightSearch = searchNode(root.right, key);

        return leftSearch || rightSearch;
    }

    // Определение ширины дерева
    public int getWidth(Node root, int level) {
        if (root == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        } else if (level > 1) {
            return getWidth(root.left, level - 1) + getWidth(root.right, level - 1);
        }
        return 0;
    }
    // Определение максимальной ширины дерева
    public int getMaxWidth(Node root) {
        int maxWidth = 0;

        int height = getHeight(root);

        for (int level = 1; level <= height; level++) {
            int width = getWidth(root, level);
            maxWidth = Math.max(maxWidth, width);
        }

        return maxWidth;
    }

    // Подсчет количества узлов в дереве
    public int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Метод для проверки на равенство двух деревьев
    public static boolean areTreesEqual(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 != null) {
            return (root1.data == root2.data) &&
                    areTreesEqual(root1.left, root2.left) &&
                    areTreesEqual(root1.right, root2.right);
        }
        return false;
    }

}