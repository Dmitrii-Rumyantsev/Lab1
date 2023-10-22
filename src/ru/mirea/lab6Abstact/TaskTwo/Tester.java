package ru.mirea.lab6Abstact.TaskTwo;

public class Tester {
    public static void main(String[] args) {
        Dog big = new Sheepdog("Шарик", 10,"Овчарка" );
        Dog small = new YorkshireTerrier("Барсик", 4,"Йорк");
        System.out.println(big);
        System.out.println(small);
    }
}
