package ru.mirea;

import java.util.List;

class Items {
    private String name;
    private int count;

    public Items(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}

public class Tester {
    public static void main(String[] args) {
        List<Items> items = List.of(
                new Items("Item1", 5),
                new Items("Item2", 3),
                new Items("Item3", 8)
        );

        int sum = items.stream()
                .mapToInt(Items::getCount) // Преобразование объектов в int
                .sum(); // Подсчет суммы значений

        System.out.println("Сумма значений поля 'count' в списке: " + sum);
    }
}
