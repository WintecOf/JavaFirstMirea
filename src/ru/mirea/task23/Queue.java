package ru.mirea.task23;

public class Queue {
    private int capacity;
    private int[] items;
    private int front, rear;
    private int size;

    Queue(int capacity) {
        this.capacity = capacity;
        front = -1;
        rear = -1;
        items = new int[this.capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public void setItem(int item, int index) {
        this.items[index] = item;
    }

    public int getItem(int index) {
        return this.items[index];
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
