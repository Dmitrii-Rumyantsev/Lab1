package ru.mirea.lab6Abstact.TaskFree;
public abstract class Furniture {
    private String type, material;
    int price;
    Furniture(String type, String material, int price){
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public String getType() {
        return type;
    }
    public String getMaterial() {
        return material;
    }
    public int getPrice() {
        return price;
    }
}
