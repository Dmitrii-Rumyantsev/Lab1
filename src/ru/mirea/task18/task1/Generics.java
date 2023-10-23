package ru.mirea.task18.task1;

import java.io.Serializable;

public class Generics<T extends Comparable<T>,V extends Animal & Serializable,K extends Number > {
    private T object1;
    private V object2;
    private K object3;

    public Generics(T object1, V object2, K object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public T getObject1() {
        return object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public V getObject2() {
        return object2;
    }

    public void setObject2(V object2) {
        this.object2 = object2;
    }

    public K getObject3() {
        return object3;
    }

    public void setObject3(K object3) {
        this.object3 = object3;
    }

    @Override
    public String toString() {
        return "Generics" + "\n" +
                "Object1: " + object1 + " " + object1.getClass() +
                "\nobject2: " + object2 + " " + object2.getClass() +
                "\nObject3: " + object3 + " " + object3.getClass();

    }
}
