package ru.mirea.task21;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Queue;

public class ArrayQueueModule extends AbstractQueue {
    private Object array[];
    private static ArrayQueueModule arrayQueueModule;
    private int left, rigth, size = 5;
    public ArrayQueueModule() {
        array = new Object[size];
        left = -1;
        rigth = -1;
    }
    //enqueue – добавить элемент в очередь


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static ArrayQueueModule getArrayQueueModule() {
        return arrayQueueModule;
    }

    public Object[] getArray() {
        return array;
    }

    public boolean isEmpty(){
        if(left == -1) return true;
        return false;
    }
    public boolean isFull(){
        if(left == 0 && rigth == size - 1)return true;
        return false;
    }
    public void enqueue(int element){
        if (!isFull()) {
            if (left == -1) {
                left = 0;
            }
            rigth++;
            array[rigth] = element;
            System.out.println("Добавлен элемент " + element);
        }
        else{
            System.out.println("Очередь переполнена");
        }
    }
    //dequeue – удалить и вернуть первый элемент в очереди;
    public Object dequeue(){
        if(!isEmpty()){
            Object element = array[left];
            if(left >= rigth){
                left = -1;
                rigth = -1;
            }
            else {
                left++;
            }
            System.out.println("Элемент удален: " + element);
            return element;
        }
        else{
            System.out.println("Очередь пуста!");
            return -1;
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    //size – текущий размер очереди;
    public int size(){
        if (!isEmpty()){
            return Math.abs(left-rigth);
        }
        else{
            System.out.println("Очередь пуста!");
            return -1;
        }
    }
    //clear – удалить все элементы из очереди.
    public void clear(){
        if(!isEmpty()){
            left = -1;
            rigth = -1;
            System.out.println("Очередь успешно удалена: " + array.toString());
        }
        else {
            System.out.println("Очередь пуста!");
        }
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object poll() {
        return null;
    }

    //element – первый элемент в очереди;
    public Object element(){
        if(!isEmpty()){
            return array[left];
        }
        else{
            System.out.println("Очередь пуста!");
            return -1;
        }
    }

    @Override
    public Object peek() {
        return null;
    }
}
