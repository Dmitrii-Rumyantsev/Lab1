package ru.mirea.task22;

public class TestFactory {
    public static void main(String[] args) {
        Complex complex = CompsFact.GetComplex(new ConcreteFactory(),2,3);
        Complex complex1 = CompsFact.getComplex(new ConcreteFactory());
        System.out.println(complex.toString());
        System.out.println(complex1.toString());

    }
}
