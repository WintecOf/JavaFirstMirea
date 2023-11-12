package ru.mirea.task17.list_2;

import java.nio.DoubleBuffer;

public class Tester {
    public static void main(String[] args) {
        Gem arctic = new Gem(Rarity.COMMON, Size.BIG, Color.WHITE, 1);
        Gem crimson = new Gem(Rarity.SPECIAL, Size.HUGE, Color.RED, 2);
        Gem emerald = new Gem(Rarity.RARE, Size.MEDIUM, Color.GREEN, 3);
        Gem amethyst = new Gem(Rarity.UNCOMMON, Size.SMALL, Color.PURPLE, 4);

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertEnd(arctic);
        list.insertEnd(crimson);
        list.insertEnd(emerald);

        list.printStraightOrder();
        System.out.println("=================");
        list.printNodesStraightOrder();
        System.out.println("=================");

        list.printReverseOrder();
        System.out.println("=================");
        list.printNodesReverseOrder();
        System.out.println("=================");

        list.removeEnd();
        list.insertEnd(amethyst);
        list.printStraightOrder();
        System.out.println("=================");

        list.removeBegin();
        list.removeBegin();
        list.printStraightOrder();
        System.out.println("=================");

        list.clear();
        list.printNodesStraightOrder();
    }
}
