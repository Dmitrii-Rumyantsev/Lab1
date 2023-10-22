package ru.mirea.task14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList <E> implements IWaitList<E>{
    protected ConcurrentLinkedDeque<E> content;
    public WaitList(){
        content = new ConcurrentLinkedDeque<E>();
    }
    public WaitList(ConcurrentLinkedDeque<E> c){
        content = new ConcurrentLinkedDeque<E>(c);
    }
    @Override
    public String toString(){
        return "WayList " + "content = " + content;
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        if(isEmpty()){
            throw new IllegalStateException("Очередь пуста!");
        }
        return content.remove();
    }

    @Override
    public boolean contains(Object element) {
        boolean result = false;
        for(int i = 0; i < content.size(); i++){
            E el = content.remove();
            if(el.equals(element)) result = true;
            content.add(el);
        }
        return result;
    }

    @Override
    public boolean containsAll(Collection c) {
        ArrayList<E> al = new ArrayList<>(c);
        for(int i = 0; i < c.size(); i++){
            boolean res = false;
            for(int j = 0; j < content.size(); j++){
                E el = content.remove();
                if(el.equals(al.get(i))) res = true;
                content.add(el);
            }
            if(!res) return false;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
