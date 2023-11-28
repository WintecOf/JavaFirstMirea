package ru.mirea.task23;

public class ArrayQueueADT {

    public boolean isFull(Queue queue) {
        if (queue.getFront() == 0 && queue.getRear() == queue.getCapacity() - 1) {
            return true;
        }
        if (queue.getFront() == queue.getRear() + 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty(Queue queue) {
        return queue.getFront() == -1;
    }

    public void enQueue(Queue queue, int element) {
        if (isFull(queue)) {
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

    public int deQueue(Queue queue) {
        int element;
        if (isEmpty(queue)) {
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

    public void display(Queue queue) {
        int i;
        if (isEmpty(queue)) {
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

    public void size(Queue queue) {
        System.out.println("Queue size -> " + queue.getSize());
    }

    public void clear(Queue queue) {
        if (isEmpty(queue)) {
            System.out.println("Queue is already empty");
        }
        else {
            while (!isEmpty(queue)) {
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

    public int element(Queue queue) {
        if (isEmpty(queue)) {
            System.out.println("Empty Queue");
            return -1;
        }
        else {
            return queue.getItem(queue.getFront());
        }
    }
}
