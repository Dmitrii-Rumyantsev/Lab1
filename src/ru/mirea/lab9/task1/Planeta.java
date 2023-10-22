package ru.mirea.lab9.task1;

public class Planeta implements Nameable{
    private String name;
    private int radius;
    Planeta(String name, int radius){
        this.name = name;
        this.radius = radius;
    }
    @Override
    public String getName(){
        return this.name;
    }
}
