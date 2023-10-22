package ru.mirea.lab9.task1;

public class Human implements Nameable{
    private String name;
    private int age;
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String getName(){
        return this.name;
    }
}
