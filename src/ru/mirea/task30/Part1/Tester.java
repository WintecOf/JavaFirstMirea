package ru.mirea.task30.Part1;

/*

tree
   1
 2   3
4 5 6 7

tree2
   1
 2   3
4 5 6 7


tree3
   1
 2   3
4 5 6 8

 */

public class Tester {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Поиск 3: " + tree.searchNode(tree.root, 3));
        System.out.println("Поиск 8: " + tree.searchNode(tree.root, 8));
        System.out.println("Максимальная ширина: " + tree.getMaxWidth(tree.root));
        System.out.println("Высота: " + tree.getHeight(tree.root));

        BinaryTree tree2 = new BinaryTree();

        tree2.root = new Node(1);
        tree2.root.left = new Node(2);
        tree2.root.right = new Node(3);
        tree2.root.left.left = new Node(4);
        tree2.root.left.right = new Node(5);
        tree2.root.right.left = new Node(6);
        tree2.root.right.right = new Node(7);

        BinaryTree tree3 = new BinaryTree();

        tree3.root = new Node(1);
        tree3.root.left = new Node(2);
        tree3.root.right = new Node(3);
        tree3.root.left.left = new Node(4);
        tree3.root.left.right = new Node(5);
        tree3.root.right.left = new Node(6);
        tree3.root.right.right = new Node(8);

        System.out.println("Сравнение с одинаковым: " + BinaryTree.areTreesEqual( tree.root, tree2.root));
        System.out.println("Сравнение с другим: " + BinaryTree.areTreesEqual(tree.root, tree3.root));
    }
}
