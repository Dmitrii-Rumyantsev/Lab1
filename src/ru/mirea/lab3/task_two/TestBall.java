package ru.mirea.lab3.task_two;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0.0,0.0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте скорость полета мяча");
        double xSpeed = scanner.nextDouble(), ySpeed = scanner.nextDouble();
        int choice = 0;
        ball.setXYSpeed(xSpeed,ySpeed);
        boolean flag = true;
        while (flag){
            System.out.println("Выберите действия\n1 - Изменить скорость полета мяча\n2 - Задать начальное положение\n3 - Увеличить координату x и y на какое-то значение\n4 - Завершить программу и вывести информацию об объекте класса Ball");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Задайте новую скорость полета мяча");
                    ball.setXYSpeed(xSpeed = scanner.nextInt(), ySpeed = scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Введите координаты сначала по x потом по y");
                    ball.setXY(scanner.nextDouble(), scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Введите числа на которые вы хотите увеличить сначала x потом y");
                    ball.move(scanner.nextDouble(), scanner.nextDouble());
                    break;
                case 4:
                    System.out.println("Завершения программы ...");
                    flag = false;
                    break;
                default:
                    System.out.println("Вы ввели неверное значение");
            }
        }
        System.out.println(ball);
    }
}
