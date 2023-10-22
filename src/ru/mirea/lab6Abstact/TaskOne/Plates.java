package ru.mirea.lab6Abstact.TaskOne;

public class Plates extends Dish{
    private int raduis;
    Plates(String type, String material,int radius ){
        super(type,material);
        this.raduis = radius;
    }

    public int getRaduis() {
        return raduis;
    }
    @Override
    public String toString(){
        return "Plates: type = " + super.getType() + ", material = " + super.getMaterial() + ", radius = " + getRaduis();
    }
}