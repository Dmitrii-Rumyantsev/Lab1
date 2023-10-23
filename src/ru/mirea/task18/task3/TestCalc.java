package ru.mirea.task18.task3;

public class TestCalc {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(10,1.0));
        System.out.println(Calculator.multiply(10.0,23));
        System.out.println(Calculator.subtraction(12.3d,12.03f));
        System.out.println(Calculator.divide(10,0.0));
    }
}
