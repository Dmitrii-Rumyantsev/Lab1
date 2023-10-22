package ru.mirea.lab6Abstact.TaskOne;

public class Tester {
    public static void main(String[] args) {
        Dish cup = new Cup("Стакан","Стекло",1000);
        Dish plates = new Plates("Тарелка", "Керамика", 30);
        Dish tableware = new TableWare("Ложка","Металл", 10, 25);
        System.out.println(cup);
        System.out.println(plates);
        System.out.println(tableware);
    }
}
