package ru.mirea.task16;

public class Except {
    public static void main(String[] args) {
        try {
            System.out.println(2.0/0.0);

        }catch (ArithmeticException e){
            System.out.println("Деление на ноль не возможно!!!");
        }
    }
}
