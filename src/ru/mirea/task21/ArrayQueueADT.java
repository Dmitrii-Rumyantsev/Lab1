package ru.mirea.task21;

public class ArrayQueueADT extends ArrayQueueModule{
    private ArrayQueueModule queueModule;
    ArrayQueueADT(ArrayQueueModule queueModule){
        this.queueModule = queueModule;
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean isFull() {
        return super.isFull();
    }

    @Override
    public Object dequeue() {
        return super.dequeue();
    }

    @Override
    public Object element() {
        return super.element();
    }

    @Override
    public void enqueue(int element) {
        super.enqueue(element);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public int size() {
        return super.size();
    }
}
