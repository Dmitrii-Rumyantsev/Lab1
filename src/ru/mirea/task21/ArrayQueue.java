package ru.mirea.task21;

public class ArrayQueue {
    private ArrayQueueModule queueModule = new ArrayQueueModule();
    public ArrayQueue(){
        super();
    }
    public Object[] getArray(){
        return queueModule.getArray();
    }
    public Object element(){
        return queueModule.element();
    }
    public void clear(){
        queueModule.clear();
    }
    public int size(){
        return queueModule.size();
    }
    public Object dequeue(){
        return queueModule.dequeue();
    }
    public void enqueue(int element){
        queueModule.enqueue(element);
    }
    public boolean isEmpty(){
        return queueModule.isEmpty();
    }
    public boolean isFull(){
        return queueModule.isFull();
    }
}
