package ru.mirea.lab1;

import java.util.Scanner;

public class Practice_One {
    public static void main(String[] args) {
        //first_task();
        //second_task();
        for (int i = 0;i <args.length;i++){
            System.out.println(args[i]);
        }
        //fourth_task();
        //fifth_task();
    }
    public static void first_task(){
        int[] x = {1,2,3,4,5,6};
        int sum = 0;
        for(int i = 0; i < x.length;i++){
            sum += x[i];
        }
        System.out.println("Summ = " + sum + " avarage = " + ((double)sum/ x.length));
    }
    public static void second_task(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        if(scanner.hasNextInt()) {
            int N = scanner.nextInt();
            int[] x = new int[N];
            System.out.println("Введите элементы массива");
            for (int i = 0; i < N; i++) {
                if(scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                }
                else{
                    System.out.println("Введено не целочисленное значение");
                    i--;
                }
            }
            int sum1 = 0, sum2 = 0, min = x[0], max = x[0], i = 0;
            while (i < N) {
                sum1 += x[i];
                if (min > x[i]) min = x[i];
                i++;
            }
            i = 0;
            do {
                sum2 += x[i];
                if (max < x[i]) max = x[i];
                i++;
            } while (i < N);
            System.out.println("Сумма через while = " +sum1 + " Сумма через do while = " + sum2);
        }
        else{
            System.out.println("Введено не целочисленное значение");
            second_task();
        }
    }
    public static void fourth_task(){
        for (int i = 1; i <= 10;i++){
            System.out.println(1./i);
        }
    }
    public static void fifth_task(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для вычисления факториала: ");
        if(scanner.hasNextInt()) {
            int numbers = scanner.nextInt();
            long factoiral = 1;
            if(numbers < 50) {
                if (numbers > 0) {
                    while (numbers > 0) {
                        factoiral *= numbers;
                        numbers--;
                    }
                    System.out.println("Factorial = " + factoiral);
                } else {
                    System.out.println("Factorial = " + 0);
                }
            }
            else{
                System.out.println("Посчитать факториал невозможно");
                fifth_task();
            }
        }
        else {
            System.out.println("Введено не целочисленное значение\n");
            fifth_task();
        }
    }
}
