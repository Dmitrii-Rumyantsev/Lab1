package ru.mirea.lab1;

import java.util.Scanner;

public class Practice_One {
    public static void main(String[] args) {
        first_task();
        second_task();
        for (int i = 0;i <args.length;i++){
            System.out.println(args[i]);
        }
        fourthy_task();
        seven_task();
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
        int N = scanner.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N;i++){
            x[i] = scanner.nextInt();
        }
        int sum1 = 0, sum2 = 0, min = x[0], max = x[0],i = 0;
        while(i < N){
           sum1 += x[i];
           if(min > x[i]) min = x[i];
           i++;
        }
        i = 0;
        do{
            sum2 += x[i];
            if(max < x[i]) max = x[i];
            i++;
        }while (i < N );
        System.out.println(sum1 + " " + sum2);
    }
    public static void fourthy_task(){
        for (int i = 1; i <= 10;i++){
            System.out.println(1./i);
        }
    }
    public static void seven_task(){
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int factoiral = 1;
        while(numbers > 0){
            factoiral *= numbers;
            numbers--;
        }
        System.out.println("Factorial = " + factoiral);
    }
}
