package ru.mirea.lab4.taskTwo;

public class TestMovable {
    public static void main(String[] args) {
        Movable circle = new MovableCircle(0,0,10,15,25);
        circle.moveRight();
        circle.moveRight();
        circle.moveUp();
        circle.moveUp();
        System.out.println(circle);

        Movable rectangle = new MovableRectangle(0,10,3,13,10,15);
        rectangle.moveDown();
        rectangle.moveLeft();
        rectangle.moveDown();
        System.out.println(rectangle);
    }
}
