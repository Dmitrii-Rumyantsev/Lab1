package ru.mirea.task16;

import java.util.Scanner;

public class Except2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.println("Введите целое число ");
        String intString = myScanner.next();
        try {
            int i;
            i = Integer.parseInt(intString);
        }catch (NumberFormatException e){
            System.out.println("Входные данные не целочисленное значение!!!");
        }finally {
            System.out.println("Вывод все равно");
        }
    }
}
