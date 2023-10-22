package ru.mirea.lab6Abstact.TaskOne;

public class Cup extends Dish{
    private int ml;
    public Cup(String type, String material,int ml) {
        super(type, material);
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }

    @Override
    public String toString(){
        return "Cup: type = " + super.getType() + ", material = " + super.getMaterial() + ", volume = " + getMl();
    }
}