package ru.mirea.lab4.taskTwo;

public class MovableRectangle implements Movable{
    private MovablePoint left, rigth;
    MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        this.left = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.rigth = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public boolean speed(MovablePoint left, MovablePoint rigth){
        return (left.getxSpeed() == rigth.getxSpeed() && left.getySpeed() == rigth.getySpeed());
    }
    public void moveUp() {
        if(speed(left,rigth)){
            left.moveUp();
            rigth.moveUp();
        }
    }
    public void moveDown() {
        if(speed(left,rigth)){
            left.moveDown();
            rigth.moveDown();
        }
    }
    public void moveLeft() {
        if(speed(left,rigth)){
            left.moveLeft();
            rigth.moveLeft();
        }
    }
    public void moveRight() {
        if(speed(left,rigth)){
            left.moveRight();
            rigth.moveRight();
        }
    }
    public String toString() {
        return "MovableRectangle " +"left=" + left +", rigth=" + rigth;
    }
}
