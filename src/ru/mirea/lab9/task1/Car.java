package ru.mirea.lab9.task1;

public class Car implements Nameable, Priceable{

    private String name;
    private int engine, price;
    Car(String name, int engine, int price){
        this.name = name;
        this.engine = engine;
        this.price = price;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
