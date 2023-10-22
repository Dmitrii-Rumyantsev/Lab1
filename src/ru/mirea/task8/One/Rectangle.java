package ru.mirea.task8.One;

import java.awt.*;

public class Rectangle extends Shape implements RandomClass{
    protected int wigth,higth;
    public Rectangle(){
        super();
    }
    public Rectangle(int r, int g, int b, int rows, int cols, int wigth, int higth) {
        super(r, g, b, rows, cols);
        this.wigth = wigth;
        this.higth = higth;
    }
    public int getWigth() {
        return wigth;
    }
    public void setWigth(int wigth) {
        this.wigth = wigth;
    }
    public int getHigth() {
        return higth;
    }
    public void setHigth(int higth) {
        this.higth = higth;
    }
    @Override
    public Shape create() {
        int randomRed = (int) (Math.random() * 255);
        int randomGreen = (int) (Math.random() * 255);
        int randomBlue = (int) (Math.random() * 255);
        int randomRows = (int) (Math.random() * 5);
        int randomCols = (int) (Math.random() * 5);
        int randomWigth = (int) (Math.random() * 150);
        int radnomHeigth = (int) (Math.random() * 150);
        while (randomWigth < 50){
            randomWigth = (int) (Math.random() * 150);
        }
        while (radnomHeigth < 50){
            radnomHeigth = (int) (Math.random() * 150);
        }
        return new Rectangle(randomRed, randomGreen, randomBlue, randomRows, randomCols, randomWigth, radnomHeigth);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(new Color(getR(),getG(),getB()));
        g.drawRect(super.getCols(),super.getRows(),getHigth(),getWigth());
    }
}
