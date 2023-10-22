package ru.mirea.lab9.task1;

public class Table implements Priceable, Nameable{
    private String type;
    private int price;
    Table(String type,int price){
        this.price = price;
        this.type = type;
    }
    @Override
    public String getName() {
        return this.type;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
