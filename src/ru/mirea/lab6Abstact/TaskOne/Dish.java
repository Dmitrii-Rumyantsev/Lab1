package ru.mirea.lab6Abstact.TaskOne;

public abstract class Dish {
    private String type, material;

    public Dish(String type, String material) {
        this.type = type;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }
}
