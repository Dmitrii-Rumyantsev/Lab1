package ru.mirea.task18.task3;

public class Calculator {
    public static<T extends Number, V extends Number> double sum(T obj1, V obj2){
        return obj1.doubleValue() + obj2.doubleValue();
    }
    public static<T extends Number, V extends Number> double multiply(T obj1, V obj2){
        return obj1.doubleValue() * obj2.doubleValue();
    }
    public static<T extends Number, V extends Number> double divide(T obj1, V obj2){
        try {
            return obj1.doubleValue() / obj2.doubleValue();
        }catch (ArithmeticException e){
            double inf = Double.POSITIVE_INFINITY;
            return inf;
        }
    }
    public static<T extends Number, V extends Number> double subtraction(T obj1, V obj2){
        return obj1.doubleValue() - obj2.doubleValue();
    }
}
