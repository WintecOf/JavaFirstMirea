package ru.mirea.task23;

public class Tester {
    public static void main(String[] args) {
        /* Круговая очередь типа Int, основанная на массиве */
        ArrayQueueModule aqm = new ArrayQueueModule(5);
        aqm.enQueue(1);
        aqm.enQueue(2);
        aqm.enQueue(5);
        aqm.enQueue(4);
        aqm.display();
        aqm.size();

        aqm.deQueue();
        aqm.deQueue();
        aqm.display();

        aqm.enQueue(6);
        aqm.display();

        aqm.clear();
        aqm.display();

        aqm.deQueue();
        aqm.display();

        System.out.println("\n----------------------------------\n");

        /* Круговая очередь, использующая АТД с явной передачей очереди */
        Queue myQueue = new Queue(5);
        ArrayQueueADT adt1 = new ArrayQueueADT();
        adt1.enQueue(myQueue, 5);
        adt1.enQueue(myQueue, 4);
        adt1.enQueue(myQueue, 3);
        adt1.enQueue(myQueue, 2);
        adt1.display(myQueue);

        System.out.println("\n----------------------------------\n");

        /* Круговая очередь, использующая АТД с неявной передачей очереди */
        Queue myQueue2 = new Queue(10);
        ArrayQueue adt2 = new ArrayQueue(myQueue2);
        adt2.enQueue(5);
        adt2.enQueue(4);
        adt2.enQueue(3);
        adt2.enQueue(2);
        adt2.display();

        adt2.clear();
        adt2.display();
    }
}
