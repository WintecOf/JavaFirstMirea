package ru.mirea.task30.Part2;

public class Tester {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Рекурсивный проход:");
        tree.walk();
        System.out.println();

        System.out.println("Итеративный проход:");
        tree.traverse();
        System.out.println();

        System.out.println("Удалить 20:");
        tree.delete(20);
        tree.walk();
        System.out.println();

        System.out.println("Удали поддерево с 30:");
        tree.destroy(30);
        tree.walk();
        System.out.println();

        System.out.println("Максимальное значение в дереве: " + tree.tree_maximum().key);
        System.out.println("Минимальное значение в дереве: " + tree.tree_minimum().key);
        System.out.println();
        System.out.println("Поиск узла 40: " + tree.bin_search(40));
        System.out.println("Поиск узла 50: " + tree.bin_search(50));
    }
}
