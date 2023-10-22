package ru.mirea.task13;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9}, arr = {2,4,6,8,0};
        QueueType queueType = new QueueType();
        queueType.Game(array,arr);
        StackType stackType = new StackType();
        stackType.Game(array,arr);
        DoubleListType doubleListType = new DoubleListType();
        doubleListType.Game(array,arr);
        DequeueType dequeueType = new DequeueType();
        dequeueType.Game(array,arr);
    }
}
