package ru.mirea.task24;

import ru.mirea.task23.Item;

public final class Dish extends MenuItem {
    private int coast;
    private String name;
    private String description;
    Dish(String name,String description){
        this.coast = 0;
        this.name = name;
        this.description = description;
    }
    Dish(int coast,String name,String description){
        this.coast = coast;
        this.name = name;
        this.description = description;
    }
}
