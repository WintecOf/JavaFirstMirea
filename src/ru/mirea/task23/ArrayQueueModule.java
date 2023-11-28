package ru.mirea.task23;

public class ArrayQueueModule {
    int capacity;
    int[] items;
    int front, rear;
    int size;



    ArrayQueueModule(int capacity) {
        this.capacity = capacity;
        front = -1;
        rear = -1;
        items = new int[this.capacity];
    }

    boolean isFull() {
        if (front == 0 && rear == this.capacity - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        return front == -1;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % capacity;
            items[rear] = element;
            size++;
            System.out.println("Insert " + element);
        }
    }

    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % capacity;
            }
            System.out.println(element + " Deleted");
            size--;
            return element;
        }
    }

    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("\nFront index -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % capacity) {
                System.out.print(items[i] + " ");
            }
            System.out.print(items[i] + " ");
            System.out.println("\nRear index -> " + rear + "\n");
        }
    }

    void size() {
        System.out.println("Queue size -> " + size);;
    }

    void clear() {
        if (isEmpty()) {
            System.out.println("Queue is already empty");
        }
        else {
            while (!isEmpty()) {
                if (front >= rear) {
                    front = -1;
                    rear = -1;
                }
                else {
                    front = (front + 1) % capacity;
                }
            }
        }
        size = 0;
    }

    int element() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }
        else {
            return items[front];
        }
    }
}
