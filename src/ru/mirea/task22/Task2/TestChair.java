package ru.mirea.task22.Task2;

public class TestChair {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Chair chairOne = factory.createFunctionalChair();
        Chair chairTwo = factory.createVictorianChair();
        Chair chairFree = factory.createMagicChair();

    }
}
