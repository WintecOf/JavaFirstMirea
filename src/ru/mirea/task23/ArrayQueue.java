package ru.mirea.task23;

public class ArrayQueue {
    Queue queue;
    ArrayQueue(Queue queue) {
        this.queue = queue;
    }

    public boolean isFull() {
        if (queue.getFront() == 0 && queue.getRear() == queue.getCapacity() - 1) {
            return true;
        }
        if (queue.getFront() == queue.getRear() + 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return queue.getFront() == -1;
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (queue.getFront() == -1) {
                queue.setFront(0);
            }
            queue.setRear((queue.getRear() + 1) % queue.getCapacity());
            queue.setItem(element, queue.getRear());
            queue.setSize(queue.getSize()+1);
            System.out.println("Insert " + element);
        }
    }

    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            element = queue.getItem(queue.getFront());
            if (queue.getFront() == queue.getRear()) {
                queue.setFront(-1);
                queue.setRear(-1);
            }
            else {
                queue.setFront((queue.getFront() + 1) % queue.getCapacity());
            }
            System.out.println(element + " Deleted");
            queue.setSize(queue.getSize() - 1);
            return element;
        }
    }

    public void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("\nFront index -> " + queue.getFront());
            System.out.println("Items -> ");
            for (i = queue.getFront(); i != queue.getRear(); i = (i + 1) % queue.getCapacity()) {
                System.out.print(queue.getItem(i) + " ");
            }
            System.out.print(queue.getItem(i) + " ");
            System.out.println("\nRear index -> " + queue.getRear() + "\n");
        }
    }

    public void size() {
        System.out.println("Queue size -> " + queue.getSize());
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("Queue is already empty");
        }
        else {
            while (!isEmpty()) {
                if (queue.getFront() >= queue.getRear()) {
                    queue.setFront(-1);
                    queue.setRear(-1);
                }
                else {
                    queue.setFront((queue.getFront() + 1) % queue.getCapacity());
                }
            }
        }
    }

    public int element() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }
        else {
            return queue.getItem(queue.getFront());
        }
    }
}
