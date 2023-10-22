package ru.mirea.lab2.task2;

import java.util.Scanner;

public class TesterBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(0.0, 0.0);
        Ball ball2 = new Ball(1.0);ball2.setY(2.0);
        Ball ball3 = new Ball();ball3.setXY(5.0,3.5);
        ball1.move(10.0,25.0);
        ball2.move(0.0,0.1);
        ball3.move(100.0,200.0);
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());
    }
}
