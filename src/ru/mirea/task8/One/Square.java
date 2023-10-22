package ru.mirea.task8.One;

import java.awt.*;

public class Square extends Shape implements RandomClass{
    private int side;
    public Square(){
        super();
    }
    public Square(int r, int g, int b, int rows, int cols, int side) {
        super(r, g, b, rows, cols);
        this.side = side;
    }
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
    @Override
    public Shape create() {
        int randomRed = (int) (Math.random() * 255);
        int randomGreen = (int) (Math.random() * 255);
        int randomBlue = (int) (Math.random() * 255);
        int randomRows = (int) (Math.random() * 5);
        int randomCols = (int) (Math.random() * 5);
        int randomSide = (int) (Math.random() * 150);
        while (randomSide < 50){
            randomSide = (int) (Math.random() * 150);
        }
        return new Square(randomRed, randomGreen, randomBlue, randomRows, randomCols, randomSide);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(new Color(getR(),getG(),getB()));
        g.drawRect(super.getCols(),super.getRows(),getSide(),getSide());
    }
}
