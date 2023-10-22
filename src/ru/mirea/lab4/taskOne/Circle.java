package ru.mirea.lab4.taskOne;

public class Circle extends Shape{
    protected double radius;
    Circle(){
        this.filled = false;
        this.color = "blue";
        this.radius = 1;
    }
    Circle(double radius){
        this.color = "blue";
        this.filled = false;
        this.radius = radius;

    }

    Circle(double radius, String color, boolean filled){
        this.filled = filled;
        this.color = color;
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2.0);
    }

    public double getPerimetr(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color;
    }
}
