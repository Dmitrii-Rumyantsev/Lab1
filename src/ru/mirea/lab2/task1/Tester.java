package ru.mirea.lab2.task1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик", 10);
        Dog dog2 = new Dog("Стрелка"); dog2.setAge(2);
        Dog dog3 = new Dog(); dog3.setName("Белка");dog3.setAge(5);
        System.out.println(dog1);
        dog1.ageToHuman();
        dog2.ageToHuman();
        dog3.ageToHuman();
    }
}
