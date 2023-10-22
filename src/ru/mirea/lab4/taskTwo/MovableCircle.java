package ru.mirea.lab4.taskTwo;

public class MovableCircle  implements Movable {
    private int radius;
    private MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center =  new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius =radius;
    }
    public void moveUp() {
        center.moveUp();
    }
    public void moveDown() {
        center.moveDown();
    }
    public void moveLeft() {
        center.moveLeft();
    }
    public void moveRight() {
        center.moveRight();
    }
    public String toString() {
        return "MovableCircle:" + "radius=" + radius +", center=" + center;
    }
}
