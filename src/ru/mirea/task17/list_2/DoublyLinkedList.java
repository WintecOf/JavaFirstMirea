package ru.mirea.task17.list_2;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void insertBegin(Gem value) {
        if (this.head == null) {
            var node = new Node(value, null, null);
            this.head = node;
            this.tail = node;
        } else {
            var node = new Node(value, null, this.head);
            this.head.previous = node;
            this.head = node;
        }
    }

    public void insertEnd(Gem value) {
        if (tail == null) {
            var node = new Node(value, null, null);
            tail = node;
            head = node;
        } else {
            var node = new Node(value, tail, null);
            tail.next = node;
            tail = node;
        }
    }

    public Gem removeBegin() {
        if (head == null) {
            return null;
        }

        var result = head.value;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }

        return result;
    }

    public Gem removeEnd() {
        if (tail == null) {
            return null;
        }

        var result = tail.value;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }

        return result;
    }

    public void printStraightOrder() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node current = this.head;
            while (!(current == null)) {
                System.out.println(current.value);
                current = current.next;
            }
        }
    }

    public void printNodesStraightOrder() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node current = this.head;
            while (!(current == null)) {
                System.out.println(current);
                current = current.next;
            }
        }
    }

    public void printReverseOrder() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node current = this.tail;
            while (!(current == null)) {
                System.out.println(current.value);
                current = current.previous;
            }
        }
    }

    public void printNodesReverseOrder() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node current = this.tail;
            while (!(current == null)) {
                System.out.println(current);
                current = current.previous;
            }
        }
    }

    public void printNode(Node node) {
        System.out.println(node);
    }

    public void clear() {
        Node current = this.head;
        while (!(current == null)) {
            current.previous = null;
            current.value = null;
            current = current.next;
        }
        this.head = null;
        this.tail = null;
    }

    // Добавить вывод в обратном порядке
}
