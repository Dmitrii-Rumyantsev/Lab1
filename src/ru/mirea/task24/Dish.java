package ru.mirea.task24;

import ru.mirea.task23.Item;

import java.util.Comparator;

public final class Dish extends MenuItem {
    private int coast;
    private String name;
    private String description;
    Dish(String name,String description){
        super();
        if (name.isEmpty()){
            throw new IllegalArgumentException("Название блюда должно быть ну пустым");
        }
        else if (description.isEmpty()){
            throw new IllegalArgumentException("Описание должно быть ну пустым");

        }else {
            this.coast = 0;
            this.name = name;
            this.description = description;
        }
    }
    Dish(int coast,String name,String description){
        super();
        if (name.isEmpty()){
            throw new IllegalArgumentException("Название блюда должно быть ну пустым");
        }
        else if (description.isEmpty()){
            throw new IllegalArgumentException("Описание должно быть ну пустым");

        }
        else if ( coast < 0){
            throw new IllegalArgumentException("Стоимость должны быть больше 0");

        }else {
            this.coast = coast;
            this.name = name;
            this.description = description;
        }
    }

    @Override
    public int getCost() {
        return coast;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
