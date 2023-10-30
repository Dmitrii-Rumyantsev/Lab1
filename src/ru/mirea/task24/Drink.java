package ru.mirea.task24;

import ru.mirea.task23.Item;

final class Drink extends MenuItem implements AlcohoTable {
    private double alcoholVol;
    private DrinkTypeEnum type;
    private int coast;
    private String name;
    private String description;

    public DrinkTypeEnum getType() {
        return type;
    }
    Drink(String name,String description){
        this.coast = 0;
        this.name = name;
        this.description = description;
    }
    Drink(int coast,String name,String description){
        this.coast = coast;
        this.name = name;
        this.description = description;
    }
    Drink(int coast,String name,String description, int alcoholVol,DrinkTypeEnum type){
        this.coast = coast;
        this.name = name;
        this.description = description;
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return false;
    }

    @Override
    public double getAlcoholVol() {
        return 0;
    }
}
