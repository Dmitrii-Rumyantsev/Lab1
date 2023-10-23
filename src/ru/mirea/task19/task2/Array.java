package ru.mirea.task19.task2;

public class Array<E>{
    private E[] arrays;
    Array(E[] arrays){
        this.arrays = arrays;
    }

    public E[] getArrays() {
        return arrays;
    }
    public void setArrays(E[] arrays) {
        this.arrays = arrays;
    }
    public E getInArrayIndex(E[] arrays,int key){
        return arrays[key];
    }
}
