package ru.mirea.task14;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;
    BoundedWaitList(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
   public void add(E element){
        if(content.size() == capacity){
            throw new IllegalStateException("Очередь заполнена!");
        }
        content.add(element);
   }
   @Override
    public String toString(){
        return "BouundedWaitList " + " capacity = " + capacity;
   }
}
