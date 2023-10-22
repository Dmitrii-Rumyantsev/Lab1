package ru.mirea.lab4.taskOne;

public class Square extends  Rectangle{
    protected double side;

    Square(){
        this.side = 0;
        this.color = "RED";
        this.filled = false;
    }
    Square(double side){
        this.side = side;
        this.color = "RED";
        this.filled = false;
    }
    Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWigth(double wigth){
        this.wigth = side;
    }
    public void setLength(double length){
        this.length = side;
    }
    public String toString(){
        return "Square: side: " + this.side;
    }
}
