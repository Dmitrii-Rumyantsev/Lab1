package ru.mirea.task24;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Dish dishOne = new Dish(10,"Название№1","Описание№1");
        Dish dishTwo = new Dish(500,"Название№2","Описание№2");
        Dish dishFree = new Dish(1000,"Название№3","Описание№3");
        Drink drink = new Drink(120,"dsd","dsds");
        MenuItem menuItem = new MenuItem();
        MenuItem dis = new Dish(1,"dsds","dsds");
        menuItem.add(dishOne);
        menuItem.add(dishTwo);
        menuItem.add(dishFree);
        menuItem.add(drink);
        System.out.println(menuItem.itemsQuantity("Название№1"));
        System.out.println(menuItem.itemsQuantity(dishOne));
        menuItem.remove(dishOne);
        System.out.println(Arrays.stream(menuItem.itemsNames()).toList());

    }
}
