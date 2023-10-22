package ru.mirea.lab9.task1;

public class TestClass {
    public static void main(String[] args) {
        Nameable human = new Human("Дмитрий", 19);
        Nameable planeta = new Planeta("Земля", 45435345);
        Car car = new Car("BMW", 1000,10_000_000);
        Table table = new Table("Столешница", 10000);
        System.out.println(human.getClass() + " " + human.getName());
        System.out.println(planeta.getClass() + " " + planeta.getName());
        System.out.println(car.getClass() + " " + car.getName());
        System.out.println(table.getClass() + " " + table.getPrice());
        System.out.println("----------------Задание№2----------------");
        System.out.println(car.getClass() + " " + car.getPrice());
        System.out.println(table.getClass() + " " + table.getPrice());

    }
}
