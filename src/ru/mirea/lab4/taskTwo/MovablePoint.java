package ru.mirea.lab4.taskTwo;

public class MovablePoint implements Movable{
    protected int x, y, xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public int getxSpeed() {
        return xSpeed;
    }
    public int getySpeed() {
        return ySpeed;
    }
    public void moveUp() {
        y += ySpeed;
    }
    public void moveDown(){
        y -= ySpeed;
    }
    public void moveLeft(){
        x -= xSpeed;
    }
    public void moveRight(){
        x += xSpeed;
    }
    public String toString() {
        return "MovablePoint{" +" x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed +'}';
    }
}
