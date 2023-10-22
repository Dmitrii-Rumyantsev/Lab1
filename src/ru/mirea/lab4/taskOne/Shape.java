package ru.mirea.lab4.taskOne;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape(){
        this.filled = false;
        this.color = "blue";
    }

    Shape(String color, boolean filled){
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimetr();

    public abstract String toString();
}
