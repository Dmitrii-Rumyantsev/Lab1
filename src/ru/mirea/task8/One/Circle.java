package ru.mirea.task8.One;

import java.awt.*;

public class Circle extends Shape implements RandomClass{
    private int radius;
    public Circle(){}
    public Circle(int r, int g, int b, int rows, int cols,int radius) {
        super(r, g, b, rows, cols);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape create() {
        int randomRed = (int) (Math.random() * 255);
        int randomGreen = (int) (Math.random() * 255);
        int randomBlue = (int) (Math.random() * 255);
        int randomRows = (int) (Math.random() * 5);
        int randomCols = (int) (Math.random() * 5);
        int randomRadius = (int) (Math.random() * 150);
        while (randomRadius < 50){
            randomRadius = (int) (Math.random() * 150);
        }
        return new Circle(randomRed, randomGreen, randomBlue, randomRows, randomCols, randomRadius);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(new Color(getR(),getG(),getB()));
        g.drawOval(super.getCols(),super.getRows(),getRadius(),getRadius());
    }
}
