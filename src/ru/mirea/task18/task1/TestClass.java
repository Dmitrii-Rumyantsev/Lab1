package ru.mirea.task18.task1;

public class TestClass {
    public static void main(String[] args) {
        Generics<String, Animal, Number> newclass = new Generics<>("String",new Animal(),1000);
        System.out.println(newclass.getObject1());
        System.out.println(newclass.getObject2());
        System.out.println(newclass.getObject3());
        System.out.println(newclass);
    }
}
