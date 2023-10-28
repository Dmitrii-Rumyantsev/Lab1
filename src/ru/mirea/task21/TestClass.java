package ru.mirea.task21;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        ArrayQueueModule arrayQueueModule = new ArrayQueueModule();
        arrayQueueModule.enqueue(1);
        arrayQueueModule.enqueue(2);
        arrayQueueModule.enqueue(3);
        System.out.println(Arrays.toString(arrayQueueModule.getArray()));


        ArrayQueueADT arrayQueueADT = new ArrayQueueADT(arrayQueueModule);
        arrayQueueADT.enqueue(4);
        System.out.println(Arrays.toString(arrayQueueADT.getArray()));


        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(5);
        System.out.println(Arrays.toString(arrayQueue.getArray()));

        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(10);
        linkedQueue.enqueue(20);

        System.out.println(Arrays.toString(linkedQueue.toArray()));
    }
}
