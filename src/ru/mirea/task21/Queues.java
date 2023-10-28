package ru.mirea.task21;


public interface Queues {

    void enqueue(Object element);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();
    void push(Object element);
    Object peek();
    Object remove();
    Queues getNth(int k);
    Queues removeNth(int k);
    void dropNth(int k);
    Object[] toArray();
    String toStr();
}