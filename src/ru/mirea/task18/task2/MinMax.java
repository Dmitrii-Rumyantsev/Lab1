package ru.mirea.task18.task2;
public class MinMax<T extends Comparable<T>> {
    private T[] array;
    MinMax(T[] array){
        this.array = array;
    }

    public T getMin(){
        if(array.length > 0) {
            T min = array[0];
            for (T t : array) {
                if (t.compareTo(min) < 0) {
                    min = t;
                }
            }
            return min;
        }
        return null;
    }
    public T getMax(){
        if(array.length > 0){
            T max = array[0];
            for(T t : array){
                if (t.compareTo(max) > 0){
                    max = t;
                }
            }
            return max;
        }
        return null;
    }
}
