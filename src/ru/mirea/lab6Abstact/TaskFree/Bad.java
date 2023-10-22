package ru.mirea.lab6Abstact.TaskFree;

public class Bad extends Furniture{
    int size;
    Bad(String type, String material, int price, int size){
        super(type,material,price);
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    @Override
    public String toString(){
        return "Type = " + super.getType() + ", material = " + super.getMaterial() + ", price = " + super.getPrice() + ", size = " + getSize();
    }
}

