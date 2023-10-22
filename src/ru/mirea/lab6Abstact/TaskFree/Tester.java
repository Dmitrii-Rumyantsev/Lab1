package ru.mirea.lab6Abstact.TaskFree;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FurnitureShop f = new FurnitureShop();
        Bad fs = new Bad("Кровать", "Дерево",100,2);
        f.Array(scanner.nextInt());
        f.addNew(fs);
        f.getInfo();
    }
}
