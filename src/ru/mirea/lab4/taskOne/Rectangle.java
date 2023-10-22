package ru.mirea.lab4.taskOne;

public abstract class Rectangle extends Shape{
    protected double wigth, length;
    Rectangle(){
        this.filled = false;
        this.color = "blue";
        wigth = 1.0;
        length = 1.0;
    }
    Rectangle(double wigth, double length){
        this.filled = false;
        this.color = "blue";
        this.wigth = wigth;
        this.length = length;
    }
    Rectangle(double wigth, double length, String color, boolean filled){
        this.filled = filled;
        this.color = color;
        this.wigth = wigth;
        this.length = length;
    }
    public double getWigth() {
        return wigth;
    }

    abstract void setWigth(double wigth);
    public double getLength() {
        return length;
    }

    abstract void setLength(double length);

    public double getArea(){
        return wigth * length;
    }

    public double getPerimetr(){
        return 2 * (wigth + length);
    }

    public String toString(){
        return "Retangle: wigth, length: " + this.wigth + ", color: " + this.length;
    }
}
