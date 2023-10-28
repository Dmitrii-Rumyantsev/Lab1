package ru.mirea.task21;

import java.util.Arrays;
import java.util.Queue;

public abstract class AbstractQueues implements Queues {
    protected int size;

    public void enqueue(Object element) {
        assert element != null;
        enqueueImpl(element);
        size++;
    }

    protected abstract void enqueueImpl(Object element);

    public Object dequeue() {
        assert size > 0;
        Object result = element();
        dequeueImpl();
        size--;
        return result;
    }

    protected abstract void dequeueImpl();

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        clearImpl();
        size = 0;
    }

    protected abstract void clearImpl();

    public void push(Object element) {
        assert element != null;
        pushImpl(element);
        size++;
    }

    protected abstract void pushImpl(Object element);

    public Object remove() {
        assert size > 0;
        Object result = peek();
        removeImpl();
        size--;
        return result;
    }

    protected abstract void removeImpl();

    public Queues removeNth(int k) {
        return oneByOneNth(k, true, true);
    }

    public Queues getNth(int k) {
        return oneByOneNth(k, false, true);
    }

    public void dropNth(int k) {
        oneByOneNth(k, true, false);
    }

    private Queues oneByOneNth(int k, boolean deleteNth, boolean copyNth) {
        Queues result = create();
        int i = 1;
        int sz = size;
        while (i <= sz) {
            if (i % k != 0 || !deleteNth) {
                enqueue(element());
            }
            if (i % k == 0 && copyNth) {
                result.element();
            }
            dequeue();
            i++;
        }
        return result;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        while (i < size) {
            result[i] = element();
            i++;
            enqueue(element());
            dequeue();
        }
        return result;
    }

    public String toStr() {
        return Arrays.toString(toArray());
    }

    protected abstract Queues create();
}
